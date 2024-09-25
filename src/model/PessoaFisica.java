/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class PessoaFisica extends Classe_Pessoa {
    private String cpf;
    private int idade;
    
//Contrutor padrão
public PessoaFisica(){
    super();
}

//Contrutor completo
public PessoaFisica (int id, String nome, String cpf, int idade){
    super(id, nome); //Chama o contrutor da classe Pessoa
    this.cpf = cpf;
    this.idade = idade;
}
 //Getters e Setters 
public String getCpf(){
    return cpf;
}
public void setCpf(String cpf) {
   this.cpf = cpf;
}
public int getIdade(){
    return idade;
}
public void setIdade(int idade){
    this.idade = idade;
}

//Método para exibir polimórfico
public void exibir (){
    super.exibir(); //Chama o método exibir da classe Pessoa
    System.out.println("CPF: "+ cpf);
    System.out.println("Idade: "+idade);
}
 // Sobrescrevendo o método toString
    @Override
    public String toString() {
        return "Pessoa Fisica [ID=" + getId() + ", Nome=" + getNome() + ", CPF=" + cpf + ", Idade=" + idade + "]";
    }
}



/**
 *
 * @author Josy Leal
 */

