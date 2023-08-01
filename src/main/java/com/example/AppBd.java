package com.example;

import java.sql.Connection;
import java.sql.SQLException;

import com.example.DAO.connectionManager;
import com.example.model.Marca;
import com.example.model.Produto;

public class AppBd {
    public static void main(String[] args) {
        new AppBd();
    }
    public AppBd(){
        try(var conn = connectionManager.getConnection()){
            carregarDriverJDBC();
            listarEstados(conn);
            localizarEstado(conn, "DF");
          
            //listarDadosTabela(conn, "cliente");

            var marca = new Marca();
            marca.setId(2L);

            var produto = new Produto();
            produto.setId(210L);
            produto.setMarca(marca);
            produto.setValor(300);
            produto.setNome("Produto Teste 785");
        
            inserirProduto(conn, produto);
            alterarProduto(conn, produto);
            listarDadosTabela(conn, "produto");
            excluirProduto(conn, 204);
        
        } catch (SQLException e) {
            System.err.println("Não foi possível conectar ao banco de dados: " + e.getMessage());
        }        
    }
    private void inserirProduto(Connection conn, Produto produto) {
        var sql = "insert into produto (nome, marca_id, valor) values (?,?,?)";
        try (var statement = conn.prepareStatement(sql)) {
            statement.setString(1, produto.getNome());
            statement.setLong(2, produto.getMarca().getId());
            statement.setDouble(3, produto.getValor());
            statement.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Erro na execução da consulta: " + e.getMessage());
        }
    }
    private void alterarProduto(Connection conn, Produto produto) {
        var sql = "update produto set nome = ?  marca_id= ?, valor = ?) where id =?)";
        try (var statement = conn.prepareStatement(sql)) {
            statement.setString(1, produto.getNome());
            statement.setLong(2, produto.getMarca().getId());
            statement.setDouble(3, produto.getValor());
            statement.setLong(4, produto.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Erro na alteração do Produto " + e.getMessage());
        }
    }
    private void listarDadosTabela(Connection conn, String tabela) {
        var sql = "select * from " + tabela;
        //System.out.println(sql);
        try {
            var statement = conn.createStatement();
            var result = statement.executeQuery(sql);

            var metadata = result.getMetaData();
            int cols = metadata.getColumnCount();

            for (int i = 1; i <= cols; i++) {
                System.out.printf("%-25s | ", metadata.getColumnName(i));
            }
            System.out.println();

            while(result.next()){
                for (int i = 1; i <= cols; i++) {
                    System.out.printf("%-25s | ", result.getString(i));
                }
                System.out.println();
            }
        } catch (SQLException e) {
            System.err.println("Erro na execução da consulta: " + e.getMessage());
        }
    }
    private void listarEstados(Connection conn) {
        try{
            System.out.println("Conexão com o banco realizada com sucesso.");

            var statement = conn.createStatement();
            var result = statement.executeQuery("select * from estado");
            while(result.next()){
                System.out.printf("Id: %d Nome: %s UF: %s\n", result.getInt("id"), result.getString("nome"), result.getString("uf"));
            }
            System.out.println();
        } catch (SQLException e) {
            System.err.println("Não foi possível executar a consulta ao banco: " + e.getMessage());
        }
    }
   
    private void carregarDriverJDBC() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("Não foi possível carregar a biblioteca para acesso ao banco de dados: " + e.getMessage());
        }
    }
    private void localizarEstado(Connection conn, String uf) {
        try{
            //var sql = "select * from estado where uf = '" + uf + "'"; //suscetível a SQL Injection
            var sql = "select * from estado where uf = ?";
            var statement = conn.prepareStatement(sql);
            //System.out.println(sql);
            statement.setString(1, uf);
            var result = statement.executeQuery();
            if(result.next()){
                System.out.printf("Id: %d Nome: %s UF: %s\n", result.getInt("id"), result.getString("nome"), result.getString("uf"));
            }
            System.out.println();
        } catch(SQLException e){
            System.err.println("Erro ao executar consulta SQL: " + e.getMessage());
        }
    }
    private void excluirProduto(Connection conn, long id) {
        var sql = "delete from produto where id = ?";
        try {
           var statement = conn.prepareStatement(sql);
            statement.setLong(1, id);
            if (statement.executeUpdate() ==1 )
                 System.out.println(" Produto exluido com sucesso");
            else System.out.println(" Produto não localizado");
            statement.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Erro na exlusão: " + e.getMessage());
        }
       
    }
} 

   
    
