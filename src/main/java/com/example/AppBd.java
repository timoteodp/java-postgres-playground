package com.example;

import java.sql.SQLException;

import com.example.dao.DAO;
import com.example.dao.EstadoDAO;
import com.example.dao.ProdutoDAO;
import com.example.dao.connectionManager;
import com.example.model.Marca;
import com.example.model.Produto;


public class AppBd {
    public static void main(String[] args) {
      new AppBd();
    }

    public AppBd(){
    
    try(var conn = connectionManager.getConnection()){ 
        var estadoDAO = new EstadoDAO(conn); 
        
           var listaEstados = estadoDAO.listar();
           for (var estado : listaEstados) {
            System.out.println(estado);
           }

          // estadoDAO.excluir(27L);
           estadoDAO.localizar("PR");
          
            var marca = new Marca();
            marca.setId(2L);

            var produto = new Produto();
            produto.setId(206L);
            produto.setMarca(marca);
            produto.setValor(90);
            produto.setNome("Produto Novo");

            var produtoDAO = new ProdutoDAO(conn);
            produtoDAO.alterar(produto);
            produtoDAO.excluir(204L);
          
            //var dao = new DAO(conn);
           // dao.listar("produto");
        }catch (SQLException e){
            System.out.println("Não foi possível connectar ao banco de dados: " + e.getMessage());
        } 
    } 
}
    
