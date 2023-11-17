/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao;

import com.mycompany.ferramentas.BancoDeDadosMySql;
import java.sql.ResultSet;
/**
 *
 * @author Usuario
 */
public class DaoPessoa extends BancoDeDadosMySql{
    String sql;
    
    public Boolean inserir(int id, int idEndereco, String nome, String sobrenome, String genero, String telefone, String email, String cpf, String cartaocreditoultimosquatrodigit, String cartaocreditonomedotitular, String cartaocreditodatavencimento, String usuario, String senha){
        try{
            sql = "INSERT INTO PESSOA (ID, ID_ENDERECO, NOME, SOBRENOME, GENERO, TELEFONE, EMAIL, CPF, CARTAOCREDITOULTIMOSQUATRODIGIT, CARTAOCREDITONOMEDOTITULAR, CARTAOCREDITODATAVENCIMENTO, USUARIO, SENHA) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            getStatement().setInt(2, idEndereco);
            getStatement().setString(3, nome);
            getStatement().setString(4, sobrenome);
            getStatement().setString(5, genero);
            getStatement().setString(6, telefone);
            getStatement().setString(7, email);
            getStatement().setString(8, cpf);
            getStatement().setString(9, cartaocreditoultimosquatrodigit);
            getStatement().setString(10, cartaocreditonomedotitular);
            getStatement().setString(11, cartaocreditodatavencimento);
            getStatement().setString(12, usuario);
            getStatement().setString(13, senha);
            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public Boolean alterar(int id, int idEndereco, String nome, String sobrenome, String genero, String telefone, String email, String cpf, String cartaocreditoultimosquatrodigit, String cartaocreditonomedotitular, String cartaocreditodatavencimento, String usuario){
        try{
            sql = "UPDATE PESSOA SET ID_ENDERECO = ?, NOME = ?, SOBRENOME = ?, GENERO = ?, TELEFONE = ?, EMAIL = ?, CPF = ?, CARTAOCREDITOULTIMOSQUATRODIGIT = ?, CARTAOCREDITONOMEDOTITULAR = ?, CARTAOCREDITODATAVENCIMENTO = ?, USUARIO = ?  WHERE ID = ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(13, id);
            getStatement().setInt(1, idEndereco);
            getStatement().setString(2, nome);
            getStatement().setString(3, sobrenome);
            getStatement().setString(4, genero);
            getStatement().setString(5, telefone);
            getStatement().setString(6, email);
            getStatement().setString(7, cpf);
            getStatement().setString(8, cartaocreditoultimosquatrodigit);
            getStatement().setString(9, cartaocreditonomedotitular);
            getStatement().setString(10, cartaocreditodatavencimento);
            getStatement().setString(11, usuario);
            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public Boolean alterarSenha(int id, String novaSenha){
        try{
            sql = "UPDATE PESSOA SET SENHA = ? WHERE ID = ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(2, id);
            getStatement().setString(1, novaSenha);
            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public Boolean excluir(int id){
        try{
            sql = "DELETE FROM PESSOA WHERE ID = ?";
            
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
            sql = 
                " SELECT                            " +
                "   P.ID AS ID,                     " +
                "   C.NOME AS CIDADE,               " +
                "   E.NOME_RUA AS RUA,              " +
                "   E.CEP AS CEP,                   " +
                "   E.NUMERO_RESIDENCIA AS NUM_RES, " +
                "   P.NOME AS NOME,                 " +
                "   P.SOBRENOME AS SOBRENOME,       " +
                "   P.GENERO AS GENERO,             " +
                "   P.TELEFONE AS TELEFONE,         " +
                "   P.EMAIL AS EMAIL,               " +
                "   P.CPF AS CPF,                   " +
                "    P.CARTAOCREDITOULTIMOSQUATRODIGIT AS CARTCREDITULTQUATRODIGIT" +
                "    P.CARTAOCREDITONOMEDOTITULAR AS CARTCREDITNOMETITULAR" +
                "    P.CARTAOCREDITODATAVENCIMENTO AS CARTCREDITDATAVENCIMENTO" +
                "    P.USUARIO AS USUARIOZINHO" +
                "    P.SENHA AS SENHAZINHA" +
                " FROM                              " +
                "   PESSOA P                        " +
                " JOIN ENDERECO E ON                " +
                "   E.ID = P.ID_ENDERECO            " +
                " JOIN CIDADE C ON                  " +
                "   C.ID = E.ID_CIDADE              " ;
            
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
                " SELECT                            " +
                "   P.ID AS ID,                     " +
                "   C.NOME AS CIDADE,               " +
                "   E.NOME_RUA AS RUA,              " +
                "   E.CEP AS CEP,                   " +
                "   E.NUMERO_RESIDENCIA AS NUM_RES, " +
                "   P.NOME AS NOME,                 " +
                "   P.SOBRENOME AS SOBRENOME,       " +
                "   P.GENERO AS GENERO,             " +
                "   P.TELEFONE AS TELEFONE,         " +
                "   P.EMAIL AS EMAIL,               " +
                "   P.CPF AS CPF,                   " +
                "    P.CARTAOCREDITOULTIMOSQUATRODIGIT AS CARTCREDITULTQUATRODIGIT" +
                "    P.CARTAOCREDITONOMEDOTITULAR AS CARTCREDITNOMETITULAR" +
                "    P.CARTAOCREDITODATAVENCIMENTO AS CARTCREDITDATAVENCIMENTO" +
                "    P.USUARIO AS USUARIOZINHO" +
                "    P.SENHA AS SENHAZINHA" +
                "   P.ID_ENDERECO AS ID_ENDERECO,   " +
                "   E.ID AS ID_ENDERECO             " +
                " FROM                              " +
                "   PESSOA P                        " +
                " JOIN ENDERECO E ON                " +
                "   E.ID = P.ID_ENDERECO            " +
                " JOIN CIDADE C ON                  " +
                "   C.ID = E.ID_CIDADE              " +
                " WHERE P.ID = ?                    " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorRua(String rua){
        try{
            sql = 
                " SELECT                            " +
                " SELECT                            " +
                "   P.ID AS ID,                     " +
                "   C.NOME AS CIDADE,               " +
                "   E.NOME_RUA AS RUA,              " +
                "   E.CEP AS CEP,                   " +
                "   E.NUMERO_RESIDENCIA AS NUM_RES, " +
                "   P.NOME AS NOME,                 " +
                "   P.SOBRENOME AS SOBRENOME,       " +
                "   P.GENERO AS GENERO,             " +
                "   P.TELEFONE AS TELEFONE,         " +
                "   P.EMAIL AS EMAIL,               " +
                "   P.CPF AS CPF,                   " +
                "    P.CARTAOCREDITOULTIMOSQUATRODIGIT AS CARTCREDITULTQUATRODIGIT" +
                "    P.CARTAOCREDITONOMEDOTITULAR AS CARTCREDITNOMETITULAR" +
                "    P.CARTAOCREDITODATAVENCIMENTO AS CARTCREDITDATAVENCIMENTO" +
                "    P.USUARIO AS USUARIOZINHO" +
                "    P.SENHA AS SENHAZINHA" +
                "   P.ID_ENDERECO AS ID_ENDERECO,   " +
                "   E.ID AS ID_ENDERECO             " +
                " FROM                              " +
                "   PESSOA P                        " +
                " JOIN ENDERECO E ON                " +
                "   E.ID = P.ID_ENDERECO            " +
                " JOIN CIDADE C ON                  " +
                "   C.ID = E.ID_CIDADE              " +
                " WHERE E.NOME_RUA LIKE ?           " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, rua + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorCep(String cep){
        try{
            sql = 
                " SELECT                            " +
                "   P.ID AS ID,                     " +
                "   C.NOME AS CIDADE,               " +
                "   E.NOME_RUA AS RUA,              " +
                "   E.CEP AS CEP,                   " +
                "   E.NUMERO_RESIDENCIA AS NUM_RES, " +
                "   P.NOME AS NOME,                 " +
                "   P.SOBRENOME AS SOBRENOME,       " +
                "   P.GENERO AS GENERO,             " +
                "   P.TELEFONE AS TELEFONE,         " +
                "   P.EMAIL AS EMAIL,               " +
                "   P.CPF AS CPF,                   " +
                "    P.CARTAOCREDITOULTIMOSQUATRODIGIT AS CARTCREDITULTQUATRODIGIT" +
                "    P.CARTAOCREDITONOMEDOTITULAR AS CARTCREDITNOMETITULAR" +
                "    P.CARTAOCREDITODATAVENCIMENTO AS CARTCREDITDATAVENCIMENTO" +
                "    P.USUARIO AS USUARIOZINHO" +
                "    P.SENHA AS SENHAZINHA" +
                "   P.ID_ENDERECO AS ID_ENDERECO,   " +
                "   E.ID AS ID_ENDERECO             " +
                " FROM                              " +
                "   PESSOA P                        " +
                " JOIN ENDERECO E ON                " +
                "   E.ID = P.ID_ENDERECO            " +
                " JOIN CIDADE C ON                  " +
                "   C.ID = E.ID_CIDADE              " +
                " WHERE E.CEP LIKE ?                " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, cep + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorNumeroResidencia(String numResidencia){
        try{
            sql = 
                " SELECT                            " +
                "   P.ID AS ID,                     " +
                "   C.NOME AS CIDADE,               " +
                "   E.NOME_RUA AS RUA,              " +
                "   E.CEP AS CEP,                   " +
                "   E.NUMERO_RESIDENCIA AS NUM_RES, " +
                "   P.NOME AS NOME,                 " +
                "   P.SOBRENOME AS SOBRENOME,       " +
                "   P.GENERO AS GENERO,             " +
                "   P.TELEFONE AS TELEFONE,         " +
                "   P.EMAIL AS EMAIL,               " +
                "   P.CPF AS CPF,                   " +
                "    P.CARTAOCREDITOULTIMOSQUATRODIGIT AS CARTCREDITULTQUATRODIGIT" +
                "    P.CARTAOCREDITONOMEDOTITULAR AS CARTCREDITNOMETITULAR" +
                "    P.CARTAOCREDITODATAVENCIMENTO AS CARTCREDITDATAVENCIMENTO" +
                "    P.USUARIO AS USUARIOZINHO" +
                "    P.SENHA AS SENHAZINHA" +
                "   P.ID_ENDERECO AS ID_ENDERECO,   " +
                "   E.ID AS ID_ENDERECO             " +
                " FROM                              " +
                "   PESSOA P                        " +
                " JOIN ENDERECO E ON                " +
                "   E.ID = P.ID_ENDERECO            " +
                " JOIN CIDADE C ON                  " +
                "   C.ID = E.ID_CIDADE              " +
                " WHERE E.NUMERO_RESIDENCIA LIKE ?  " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, numResidencia + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorNome(String nome){
        try{
            sql = 
                " SELECT                            " +
                "   P.ID AS ID,                     " +
                "   C.NOME AS CIDADE,               " +
                "   E.NOME_RUA AS RUA,              " +
                "   E.CEP AS CEP,                   " +
                "   E.NUMERO_RESIDENCIA AS NUM_RES, " +
                "   P.NOME AS NOME,                 " +
                "   P.SOBRENOME AS SOBRENOME,       " +
                "   P.GENERO AS GENERO,             " +
                "   P.TELEFONE AS TELEFONE,         " +
                "   P.EMAIL AS EMAIL,               " +
                "   P.CPF AS CPF,                   " +
                "    P.CARTAOCREDITOULTIMOSQUATRODIGIT AS CARTCREDITULTQUATRODIGIT" +
                "    P.CARTAOCREDITONOMEDOTITULAR AS CARTCREDITNOMETITULAR" +
                "    P.CARTAOCREDITODATAVENCIMENTO AS CARTCREDITDATAVENCIMENTO" +
                "    P.USUARIO AS USUARIOZINHO" +
                "    P.SENHA AS SENHAZINHA" +
                "   P.ID_ENDERECO AS ID_ENDERECO,   " +
                "   E.ID AS ID_ENDERECO             " +
                " FROM                              " +
                "   PESSOA P                        " +
                " JOIN ENDERECO E ON                " +
                "   E.ID = P.ID_ENDERECO            " +
                " JOIN CIDADE C ON                  " +
                "   C.ID = E.ID_CIDADE              " +
                " WHERE P.NOME LIKE ?               " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, nome + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorSobrenome(String sobrenome){
        try{
            sql = 
                " SELECT                            " +
                "   P.ID AS ID,                     " +
                "   C.NOME AS CIDADE,               " +
                "   E.NOME_RUA AS RUA,              " +
                "   E.CEP AS CEP,                   " +
                "   E.NUMERO_RESIDENCIA AS NUM_RES, " +
                "   P.NOME AS NOME,                 " +
                "   P.SOBRENOME AS SOBRENOME,       " +
                "   P.GENERO AS GENERO,             " +
                "   P.TELEFONE AS TELEFONE,         " +
                "   P.EMAIL AS EMAIL,               " +
                "   P.CPF AS CPF,                   " +
                "    P.CARTAOCREDITOULTIMOSQUATRODIGIT AS CARTCREDITULTQUATRODIGIT" +
                "    P.CARTAOCREDITONOMEDOTITULAR AS CARTCREDITNOMETITULAR" +
                "    P.CARTAOCREDITODATAVENCIMENTO AS CARTCREDITDATAVENCIMENTO" +
                "    P.USUARIO AS USUARIOZINHO" +
                "    P.SENHA AS SENHAZINHA" +
                " FROM                              " +
                "   PESSOA P                        " +
                " JOIN ENDERECO E ON                " +
                "   E.ID = P.ID_ENDERECO            " +
                " JOIN CIDADE C ON                  " +
                "   C.ID = E.ID_CIDADE              " +
                " WHERE P.SOBRENOME LIKE ?          " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, sobrenome + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorGenero(String genero){
        try{
            sql = 
                " SELECT                            " +
                "   P.ID AS ID,                     " +
                "   C.NOME AS CIDADE,               " +
                "   E.NOME_RUA AS RUA,              " +
                "   E.CEP AS CEP,                   " +
                "   E.NUMERO_RESIDENCIA AS NUM_RES, " +
                "   P.NOME AS NOME,                 " +
                "   P.SOBRENOME AS SOBRENOME,       " +
                "   P.GENERO AS GENERO,             " +
                "   P.TELEFONE AS TELEFONE,         " +
                "   P.EMAIL AS EMAIL,               " +
                "   P.CPF AS CPF,                   " +
                "    P.CARTAOCREDITOULTIMOSQUATRODIGIT AS CARTCREDITULTQUATRODIGIT" +
                "    P.CARTAOCREDITONOMEDOTITULAR AS CARTCREDITNOMETITULAR" +
                "    P.CARTAOCREDITODATAVENCIMENTO AS CARTCREDITDATAVENCIMENTO" +
                "    P.USUARIO AS USUARIOZINHO" +
                "    P.SENHA AS SENHAZINHA" +
                " FROM                              " +
                "   PESSOA P                        " +
                " JOIN ENDERECO E ON                " +
                "   E.ID = P.ID_ENDERECO            " +
                " JOIN CIDADE C ON                  " +
                "   C.ID = E.ID_CIDADE              " +
                " WHERE P.GENERO LIKE ?             " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, genero + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorTelefone(String telefone){
        try{
            sql = 
                " SELECT                            " +
                "   P.ID AS ID,                     " +
                "   C.NOME AS CIDADE,               " +
                "   E.NOME_RUA AS RUA,              " +
                "   E.CEP AS CEP,                   " +
                "   E.NUMERO_RESIDENCIA AS NUM_RES, " +
                "   P.NOME AS NOME,                 " +
                "   P.SOBRENOME AS SOBRENOME,       " +
                "   P.GENERO AS GENERO,             " +
                "   P.TELEFONE AS TELEFONE,         " +
                "   P.EMAIL AS EMAIL,               " +
                "   P.CPF AS CPF,                   " +
                "    P.CARTAOCREDITOULTIMOSQUATRODIGIT AS CARTCREDITULTQUATRODIGIT" +
                "    P.CARTAOCREDITONOMEDOTITULAR AS CARTCREDITNOMETITULAR" +
                "    P.CARTAOCREDITODATAVENCIMENTO AS CARTCREDITDATAVENCIMENTO" +
                "    P.USUARIO AS USUARIOZINHO" +
                "    P.SENHA AS SENHAZINHA" +
                " FROM                              " +
                "   PESSOA P                        " +
                " JOIN ENDERECO E ON                " +
                "   E.ID = P.ID_ENDERECO            " +
                " JOIN CIDADE C ON                  " +
                "   C.ID = E.ID_CIDADE              " +
                " WHERE P.TELEFONE LIKE ?           " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, telefone + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorEmail(String email){
        try{
            sql = 
                " SELECT                            " +
                "   P.ID AS ID,                     " +
                "   C.NOME AS CIDADE,               " +
                "   E.NOME_RUA AS RUA,              " +
                "   E.CEP AS CEP,                   " +
                "   E.NUMERO_RESIDENCIA AS NUM_RES, " +
                "   P.NOME AS NOME,                 " +
                "   P.SOBRENOME AS SOBRENOME,       " +
                "   P.GENERO AS GENERO,             " +
                "   P.TELEFONE AS TELEFONE,         " +
                "   P.EMAIL AS EMAIL,               " +
                "   P.CPF AS CPF,                   " +
                "    P.CARTAOCREDITOULTIMOSQUATRODIGIT AS CARTCREDITULTQUATRODIGIT" +
                "    P.CARTAOCREDITONOMEDOTITULAR AS CARTCREDITNOMETITULAR" +
                "    P.CARTAOCREDITODATAVENCIMENTO AS CARTCREDITDATAVENCIMENTO" +
                " FROM                              " +
                "   PESSOA P                        " +
                " JOIN ENDERECO E ON                " +
                "   E.ID = P.ID_ENDERECO            " +
                " JOIN CIDADE C ON                  " +
                "   C.ID = E.ID_CIDADE              " +
                " WHERE P.EMAIL LIKE ?              " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, email + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    public ResultSet listarPorUsuario(String usuario, boolean buscaParcial){
        try{
            sql = 
                " SELECT                            " +
                "   P.ID AS ID,                     " +
                "   C.NOME AS CIDADE,               " +
                "   E.NOME_RUA AS RUA,              " +
                "   E.CEP AS CEP,                   " +
                "   E.NUMERO_RESIDENCIA AS NUM_RES, " +
                "   P.NOME AS NOME,                 " +
                "   P.SOBRENOME AS SOBRENOME,       " +
                "   P.GENERO AS GENERO,             " +
                "   P.TELEFONE AS TELEFONE,         " +
                "   P.EMAIL AS EMAIL,               " +
                "   P.CPF AS CPF,                   " +
                "    P.CARTAOCREDITOULTIMOSQUATRODIGIT AS CARTCREDITULTQUATRODIGIT" +
                "    P.CARTAOCREDITONOMEDOTITULAR AS CARTCREDITNOMETITULAR" +
                "    P.CARTAOCREDITODATAVENCIMENTO AS CARTCREDITDATAVENCIMENTO" +
                "    P.USUARIO AS USUARIOZINHO" +
                " FROM                              " +
                "   PESSOA P                        " +
                " JOIN ENDERECO E ON                " +
                "   E.ID = P.ID_ENDERECO            " +
                " JOIN CIDADE C ON                  " +
                "   C.ID = E.ID_CIDADE              " +
                " WHERE P.USUARIO LIKE ?              " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            if(buscaParcial)
                getStatement().setString(1, usuario + "%");
            else
                getStatement().setString(1, usuario);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet recuperaSenha(String usuario){
        try{
            sql = 
                " SELECT                            " +
                "   ID,                             " +
                "   SENHA                           " +
                " FROM                              " +
                "   PESSOA                          " +
                " WHERE USUARIO = ?                 " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, usuario);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
        public int buscarProximoId(){
        int id = -1;
        
        try{
            sql = "SELECT IFNULL(MAX(ID), 0) + 1 FROM PESSOA";
            
            setStatement(getConexao().prepareStatement(sql));
            
            setResultado(getStatement().executeQuery());
            
            getResultado().next(); //Move para o primeiro registro.
            
            id = getResultado().getInt(1); //Pega o valor retornado na consulta
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return id;
    }
}