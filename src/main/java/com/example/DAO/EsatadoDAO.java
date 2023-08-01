package com.example.DAO;

import java.sql.Connection;
import java.sql.SQLException;

public class EsatadoDAO {

    private Connection conn;

    public EsatadoDAO(Connection conn) {
        this.conn = conn;
    }
    private void listar() {
        try{
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
    public void localizar(String uf) {
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
    public void excluirProduto(Connection conn, long id) {
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
