/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

/**
 *
 * @author arthur.7923
 */
public class ModCidade {
    private int id;
    private int id_estado;
    private String nome;
    
    public ModCidade(){
        
    }
    
    public ModCidade(int id, int id_estado, String nome) {
        this.id = id;
        this.id_estado = id_estado;
        this.nome = nome;
        
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getId_estado() {
        return id_estado;
    }
    
    public void setId_estado(int id_estado) {
        this.id_estado = id_estado;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cidade{" + "id=" + id + ", id_estado=" + id_estado + ", nome=" + nome + '}';
    }
}