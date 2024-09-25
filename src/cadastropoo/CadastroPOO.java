/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadastropoo;



import java.io.IOException;
import java.util.Scanner;
import model.PessoaFisica;
import model.PessoaJuridica;
import model.PessoaFisicaRepo;
import model.PessoaJuridicaRepo;

public class CadastroPOO {

    private static final Scanner scanner = new Scanner(System.in);
    private static PessoaFisicaRepo repoFisica = new PessoaFisicaRepo();
    private static PessoaJuridicaRepo repoJuridica = new PessoaJuridicaRepo();

    public static void main(String[] args) {
        int opcao = -1;

        while (opcao != 0) {
            mostrarMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    incluir();
                    break;
                case 2:
                    alterar();
                    break;
                case 3:
                    excluir();
                    break;
                case 4:
                    exibirPorId();
                    break;
                case 5:
                    exibirTodos();
                    break;
                case 6:
                    salvarDados();
                    break;
                case 7:
                    recuperarDados();
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("Selecione uma opção:");
        System.out.println("1 - Incluir Pessoa");
        System.out.println("2 - Alterar Pessoa");
        System.out.println("3 - Excluir Pessoa");
        System.out.println("4 - Buscar pelo ID");
        System.out.println("5 - Exibir todos");
        System.out.println("6 - Persistir dados");
        System.out.println("7 - Recuperar dados");
        System.out.println("0 - Finalizar Programa");
    }

    private static void incluir() {
        System.out.println("Incluir pessoa Física ou Jurídica (F/J)?");
        String tipo = scanner.nextLine().toUpperCase();
        
        if (tipo.equals("F")) {
            PessoaFisica pf = new PessoaFisica();
            System.out.println("Informe o ID:");
            pf.setId(scanner.nextInt());
            scanner.nextLine();
            System.out.println("Informe o nome:");
            pf.setNome(scanner.nextLine());
            System.out.println("Informe o CPF:");
            pf.setCpf(scanner.nextLine());
            System.out.println("Informe a idade:");
            pf.setIdade(scanner.nextInt());
            scanner.nextLine();
            repoFisica.inserir_pf(pf);
        } else if (tipo.equals("J")) {
            PessoaJuridica pj = new PessoaJuridica();
            System.out.println("Informe o ID:");
            pj.setId(scanner.nextInt());
            scanner.nextLine();
            System.out.println("Informe a razão social:");
            pj.setNome(scanner.nextLine());
            System.out.println("Informe o CNPJ:");
            pj.setCnpj(scanner.nextLine());
            repoJuridica.inserir_pj(pj);
        } else {
            System.out.println("Tipo inválido.");
        }
    }

    private static void alterar() {
        System.out.println("Alterar pessoa Física ou Jurídica (F/J)?");
        String tipo = scanner.nextLine().toUpperCase();

        if (tipo.equals("F")) {
            System.out.println("Informe o ID:");
            int id = scanner.nextInt();
            scanner.nextLine();
            PessoaFisica pf = repoFisica.obter_pf(id);
            if (pf != null) {
                System.out.println("Dados atuais: " + pf);
                System.out.println("Informe o novo nome:");
                pf.setNome(scanner.nextLine());
                System.out.println("Informe o novo CPF:");
                pf.setCpf(scanner.nextLine());
                System.out.println("Informe a nova idade:");
                pf.setIdade(scanner.nextInt());
                scanner.nextLine();
                repoFisica.alterar_pf(pf);
            } else {
                System.out.println("Pessoa Física não encontrada.");
            }
        } else if (tipo.equals("J")) {
            System.out.println("Informe o ID:");
            int id = scanner.nextInt();
            scanner.nextLine();
            PessoaJuridica pj = repoJuridica.obter_pj(id);
            if (pj != null) {
                System.out.println("Dados atuais: " + pj);
                System.out.println("Informe a nova razão social:");
                pj.setNome(scanner.nextLine());
                System.out.println("Informe o novo CNPJ:");
                pj.setCnpj(scanner.nextLine());
                repoJuridica.alterar_pj(pj);
            } else {
                System.out.println("Pessoa Jurídica não encontrada.");
            }
        } else {
            System.out.println("Tipo inválido.");
        }
    }

    private static void excluir() {
        System.out.println("Excluir pessoa Física ou Jurídica (F/J)?");
        String tipo = scanner.nextLine().toUpperCase();

        if (tipo.equals("F")) {
            System.out.println("Informe o ID:");
            int id = scanner.nextInt();
            scanner.nextLine();
            repoFisica.excluir_pf(id);
        } else if (tipo.equals("J")) {
            System.out.println("Informe o ID:");
            int id = scanner.nextInt();
            scanner.nextLine();
            repoJuridica.excluir_pj(id);
        } else {
            System.out.println("Tipo inválido.");
        }
    }

    private static void exibirPorId() {
        System.out.println("Exibir pessoa Física ou Jurídica (F/J)?");
        String tipo = scanner.nextLine().toUpperCase();

        if (tipo.equals("F")) {
            System.out.println("Informe o ID:");
            int id = scanner.nextInt();
            scanner.nextLine();
            PessoaFisica pf = repoFisica.obter_pf(id);
            //if (pf != null) {Id(id);
            if (pf != null) {
                System.out.println("Dados: " + pf);
            } else {
                System.out.println("Pessoa Física não encontrada.");
            }
        } else if (tipo.equals("J")) {
            System.out.println("Informe o ID:");
            int id = scanner.nextInt();
            scanner.nextLine();
            PessoaJuridica pj = repoJuridica.obter_pj(id);
            if (pj != null) {
                System.out.println("Dados: " + pj);
            } else {
                System.out.println("Pessoa Jurídica não encontrada.");
            }
        } else {
            System.out.println("Tipo inválido.");
        }
    }

    private static void exibirTodos() {
        System.out.println("Exibir todas as pessoas Físicas ou Jurídicas (F/J)?");
        String tipo = scanner.nextLine().toUpperCase();

        if (tipo.equals("F")) {
            for (PessoaFisica pf : repoFisica.obterTodos_pf()) {
                System.out.println(pf);
            }
        } else if (tipo.equals("J")) {
            for (PessoaJuridica pj : repoJuridica.obterTodos_pj()) {
                System.out.println(pj);
            }
        } else {
            System.out.println("Tipo inválido.");
        }
    }

    private static void salvarDados() {
        try {
            System.out.println("Informe o prefixo dos arquivos:");
            String prefixo = scanner.nextLine();
            repoFisica.persistir_pf(prefixo + "_fisica.dat");
            repoJuridica.persistir_pj(prefixo + "_juridica.dat");
            System.out.println("Dados salvos com sucesso.");
        } catch (IOException e) {
            System.err.println("Erro ao salvar os dados: " + e.getMessage());
        }
    }

    private static void recuperarDados() {
        try {
            System.out.println("Informe o prefixo dos arquivos:");
            String prefixo = scanner.nextLine();
            repoFisica.recuperar_pf(prefixo + "_fisica.dat");
            repoJuridica.recuperar_pj(prefixo + "_juridica.dat");
            System.out.println("Dados recuperados com sucesso.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erro ao recuperar os dados: " + e.getMessage());
        }
    }
}