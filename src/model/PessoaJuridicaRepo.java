/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Josy Leal
 */
import java.io.*;
import java.util.ArrayList;

public class PessoaJuridicaRepo extends Classe_Pessoa {
    private ArrayList<PessoaJuridica> pessoasJuridicas;

    public PessoaJuridicaRepo() {
        pessoasJuridicas = new ArrayList<>();
    }

    // Método para inserir uma nova PessoaJuridica
    public void inserir_pj(PessoaJuridica pessoa) {
        pessoasJuridicas.add(pessoa);
    }

    // Método para alterar uma PessoaJuridica existente
    public void alterar_pj(PessoaJuridica pessoa) {
        for (int i = 0; i < pessoasJuridicas.size(); i++) {
            if (pessoasJuridicas.get(i).getId() == pessoa.getId()) {
                pessoasJuridicas.set(i, pessoa);
                return;
            }
        }
    }

   // Método para excluir uma PessoaJuridica pelo ID
public void excluir_pj(int id) {
    pessoasJuridicas.removeIf(p -> p.getId()== id);  
}

    // Método para obter uma PessoaJuridica pelo ID
    public PessoaJuridica obter_pj(int id) {
        for (PessoaJuridica p : pessoasJuridicas) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    // Método para obter todas as PessoaJuridica
    public ArrayList<PessoaJuridica> obterTodos_pj() {
        return new ArrayList<>(pessoasJuridicas);
    }

    // Método para persistir os dados em um arquivo
    public void persistir_pj(String nomeArquivo_pj) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomeArquivo_pj))) {
            oos.writeObject(pessoasJuridicas);
        }
    }

    // Método para recuperar os dados de um arquivo
    public void recuperar_pj(String nomeArquivo_pj) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomeArquivo_pj))) {
            pessoasJuridicas = (ArrayList<PessoaJuridica>) ois.readObject();
        }
    }
}
