/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

/**
 *
 * @author arthur.7923
 */
public class ModEstado {
    private int id;
    private int id_pais;
    private String nome;
    private String uf;
    
    public ModEstado () {
}

public ModEstado(int id, int id_pais, String nome, String uf) {
        this.id = id;
        this.id_pais = id_pais;
        this.nome = nome;
        this.uf = uf;
        
    }
    
    public int getid() {
        return id;
    }
    
    public void setid(int id) {
        this.id = id;
    }
    
    public int getid_pais() {
        return id_pais;
    }
    
    public void setid_pais(int pId_pais) {
        this.id_pais = id_pais;
    }
    
    public String getnome(){
        return nome;
    }
    
    public void setnome(String nome) {
        this.nome = nome;
    }
    
    public String getuf() {
       return uf;
    }
    
    public void setuf (String uf) {
        this.uf = uf;
    }
    

    @Override
    public String toString() {
        return "ModEstado{" + "id=" + id + ", id_pais=" + id_pais + ", nome=" + nome + ", uf=" + uf + '}';
    }
}