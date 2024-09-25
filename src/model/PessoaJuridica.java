/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Josy Leal
 */
public class PessoaJuridica extends Classe_Pessoa {
    private String cnpj;
    
//Contrutor padrão
public PessoaJuridica(){
    super();
}
//Construtor completo
public PessoaJuridica(int id,  String nome, String cnpj){
    super(id,nome); //Chama o contrutotr da classe Pessoa
    this.cnpj = cnpj;
}
//Getters e Setters
public String getCnpj(){
    return cnpj;
}
public void setCnpj (String cnpj){
    this.cnpj = cnpj;
}
//Método para exibir polimórfico
public void exibir(){
    super.exibir();//Chama o método exibir da classe Pessoa
    System.out.println("CNPJ: "+cnpj);
}
// Sobrescrevendo o método toString
    @Override
    public String toString() {
        return "Pessoa Juricica [ID=" + getId() + ", Nome=" + getNome() + ", CNPJ=" + cnpj+"]";
    }
}