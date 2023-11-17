/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

/**
 *
 * @author Usuario
 */
public class ModPessoa {
    private int id;
    private int idEndereco;
    private String nome;
    private String sobrenome;
    private String genero;
    private String telefone;
    private String email;
    private String cpf;
    private String cartaocreditoultimosquatrodigit;
    private String cartaocreditonomedotitular;
    private String cartaocreditodatavencimento;
    private String usuario;
    private String senha;
    
    public ModPessoa(int id, int idEndereco, String nome, String sobrenome, String genero, String telefone, String email, String cpf, String cartaocreditoultimosquatrodigit, String cartaocreditonomedotitular, String cartaocreditodatavencimento) {
        this.id = id;
        this.idEndereco = idEndereco;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.genero = genero;
        this.telefone = telefone;
        this.email = email;
        this.cartaocreditoultimosquatrodigit = cartaocreditoultimosquatrodigit;
        this.cartaocreditonomedotitular = cartaocreditonomedotitular;
        this.cartaocreditodatavencimento = cartaocreditodatavencimento;
        this.usuario = usuario;
        this.senha = senha;
    }
    
    public ModPessoa() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String Cpf) {
        this.cpf = cpf;
    }
        
    public String getCartaocreditoultimosquatrodigit() {
            return cartaocreditoultimosquatrodigit;
    }
    
    public void setCartaocreditoultimosquatrodigit(String cartaocreditoultimosquatrodigit) {
        this.cartaocreditoultimosquatrodigit = cartaocreditoultimosquatrodigit;
    }
    
    public String getCartaocreditonomedotitular() {
            return cartaocreditonomedotitular;
    }
    
    public void setcartaocreditonomedotitular(String cartaocreditonomedotitular) {
        this.cartaocreditonomedotitular = cartaocreditonomedotitular;
    }
    
    public String getCartaocreditodatavencimento() {
            return cartaocreditodatavencimento;
    }
    
    public void setcartaocreditodatavencimento(String cartaocreditodatavencimento) {
        this.cartaocreditodatavencimento = cartaocreditodatavencimento;
    }

     @Override
    public String toString() {
        return "ModPessoa{" + "id=" + id + ", idEndereco=" + idEndereco + ", nome=" + nome + ", sobrenome=" + sobrenome + ", genero=" + genero + ", telefone=" + telefone + ", email=" + email + ", cpf=" + cpf + ", cartaocreditoultimosquatrodigit=" + cartaocreditoultimosquatrodigit + ", cartaocreditonomedotitular=" + cartaocreditonomedotitular + ", cartaocreditodatavencimento=" + cartaocreditodatavencimento + ", usuario=" + usuario + ", senha=" + senha + '}';
    }
}
