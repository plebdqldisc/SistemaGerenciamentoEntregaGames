/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao;

import com.mycompany.ferramentas.BancoDeDadosMySql;
import static com.mycompany.ferramentas.BancoDeDadosMySql.getConexao;
import static com.mycompany.ferramentas.BancoDeDadosMySql.getResultado;
import static com.mycompany.ferramentas.BancoDeDadosMySql.getStatement;
import static com.mycompany.ferramentas.BancoDeDadosMySql.setResultado;
import static com.mycompany.ferramentas.BancoDeDadosMySql.setStatement;
import java.sql.ResultSet;

/**
 *
 * @author arthur.7923
 */
public class DaoEstado extends BancoDeDadosMySql{
    private String sql;
    
    public Boolean inserir(int id, String nome, String uf){
        try{
            sql= "INSERT INTO ESTADO (ID, NOME, UF) VALUES (?, ?, ?)";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            getStatement().setString(2, nome);
            getStatement().setString(3, uf);
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
            
        }
    }
    
    public Boolean alterar(int id, String novoNome, String novoUf) {
        try{
            sql = "UPDATE ESTADO SET NOME = ?, UF = ? WHERE ID = ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(3, id);
            getStatement().setString(1, novoNome);
            getStatement().setString(2, novoUf);
            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
            
        }
    }
    
    public Boolean excluir (int id) {
        
        try{
            sql = "DELETE FROM ESTADO WHERE ID = ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
        
    }
    
    public ResultSet listarTodos(){
        try{
            sql = "SELECT ID, NOME, UF FROM ESTADO";
            
            setStatement(getConexao().prepareStatement(sql));
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    
    public ResultSet listarPorId(int id){
        try{
            sql = 
                  " SELECT                       "+ 
                  "     EST.ID AS ID,            "+
                  "     EST.NOME AS ESTADO,      "+
                  "     EST.UF                   "+
                  " FROM                         "+
                  "    ESTADO EST                "+
                  " WHERE                        "+
                  "     EST.ID = ?               ";  
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
        
    }
    
    public ResultSet listarPorNome (String nome){
        try{
            sql = 
                    
                    
                  " SELECT                       "+ 
                  "     EST.ID AS ID,            "+
                  "     EST.NOME AS ESTADO,      "+
                  "     EST.UF                   "+
                  " FROM                         "+
                  "    ESTADO EST                "+
                  " WHERE                        "+
                  "     EST.NOME = ?             ";  
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, nome + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
            
        }
        
        return getResultado();
        
    }
    
    
    public ResultSet listarPorUf (String uf) {
        try{
            sql = 
                    
                  " SELECT                       "+ 
                  "     EST.ID AS ID,            "+
                  "     EST.NOME AS ESTADO,      "+
                  "     EST.UF                   "+
                  " FROM                         "+
                  "    ESTADO EST                "+
                  " WHERE                        "+
                  "     EST.UF = ?               ";  
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, uf + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }

    public int buscarProximoId(){
        int id = -1;
        
        try{
            sql = "SELECT (MAX(ID), 0) + 1 FROM ESTADO";
            
            setStatement(getConexao().prepareStatement(sql));
            
            setResultado(getStatement().executeQuery());
            
            getResultado().next();
            
            id = getResultado().getInt(1);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return id;
        
    }
}
