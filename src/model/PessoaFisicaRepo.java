package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Josy Leal
 */

import java.nio.charset.StandardCharsets;
import java.io.*;
import java.util.ArrayList;

public class PessoaFisicaRepo extends Classe_Pessoa{
    private ArrayList<PessoaFisica> pessoasFisicas;

    public PessoaFisicaRepo() {
        pessoasFisicas = new ArrayList<>();
    }

    // Método para inserir uma nova PessoaFisica
    public void inserir_pf (PessoaFisica pessoa) {
        pessoasFisicas.add(pessoa);
    }

    // Método para alterar uma PessoaFisica existente
    public void alterar_pf(PessoaFisica pessoa) {
        for (int i = 0; i < pessoasFisicas.size(); i++) {
            if (pessoasFisicas.get(i).getId() ==pessoa.getId()){
            pessoasFisicas.set(i, pessoa);
                return;
            }
        }
    }

    // Método para excluir uma PessoaFisica pelo ID
    public void excluir_pf (int id) {
        pessoasFisicas.removeIf(p -> p.getId() ==id);
    }

    // Método para obter uma PessoaFisica pelo ID
    public PessoaFisica obter_pf (int id) {
        for (PessoaFisica p : pessoasFisicas) {
            if (p.getId() == p.getId()) {
                return p;
            }
        }
        return null;
    }

    // Método para obter todas as PessoaFisica
    public ArrayList<PessoaFisica> obterTodos_pf() {
        return new ArrayList<>(pessoasFisicas);
    }

    // Método para persistir os dados em um arquivo
    public void persistir_pf (String nomeArquivo_pf) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomeArquivo_pf))){
            oos.writeObject(pessoasFisicas) ;
        }
    }

    // Método para recuperar os dados de um arquivo
    public void recuperar_pf(String nomeArquivo_pf) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomeArquivo_pf))) {
            pessoasFisicas = (ArrayList<PessoaFisica>) ois.readObject();
        }
    }
}