/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
public class Classe_Pessoa implements Serializable {
    private int id;
    private String nome;
    
//Contrutor padrão
public Classe_Pessoa (){  
}

//Construtor completo   
public Classe_Pessoa(int id, String nome){
    this.id = id;
    this.nome = nome;
}       

//Getters e Setters
public int getId(){
    return id;
}
        
public void setId(int id){
     this.id = id;
    }
    
public String getNome(){
     return nome;
    }

public void setNome(String nome){
    this.nome = nome;
}
//Método para imprimir os dados
public void exibir(){
    System.out.println("ID: " + id);
    System.out.println("Nome: " + nome);
}
    }


/**
 *
 * @author Josy Leal
 */

