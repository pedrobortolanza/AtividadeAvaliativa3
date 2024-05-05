package main;
import controller.CadastroFuncionario;
import model.Desenvolvedor;
import model.Estagiario;
import model.Funcionario;
import model.Gerente;
import view.Console;

public class Principal {

    public static void main(String[] args) {

        exibirMenu();

    }

    private static void exibirMenu() {

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Funcionário");
            System.out.println("2. Remover Funcionário");
            System.out.println("3. Exibir Funcionários");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = Console.lerInt();

            switch (opcao) {
                case 1:
                    adicionarFuncionario();
                    break;
                case 2:
                    removerFuncionario();
                    break;
                case 3:
                    exibirFuncionarios();
                    break;
                case 0:
                    System.out.println("Fechando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private static void adicionarFuncionario() {
        System.out.println("\nAdicionar Funcionário:");

        System.out.print("Nome: ");
        String nome = Console.lerString();

        System.out.print("Matrícula: ");
        int matricula = Console.lerInt();

        System.out.print("Horas Trabalhadas: ");
        int horasTrabalhadas = Console.lerInt();

        System.out.print("Valor da Hora: ");
        float valorHora = Console.lerFloat();

        System.out.println("\nTipo de Funcionário:");
        System.out.println("1. Gerente");
        System.out.println("2. Desenvolvedor");
        System.out.println("3. Estagiário");
        System.out.print("Escolha o tipo: ");
        int tipo = Console.lerInt();

        switch (tipo) {
            case 1:
                System.out.print("Bônus Anual: ");
                float bonusAnual = Console.lerFloat();

                System.out.print("Equipe: ");
                String equipe = Console.lerString();

                Gerente gerente = new Gerente(nome, matricula, horasTrabalhadas, valorHora, bonusAnual, equipe);
                CadastroFuncionario.cadastrar(gerente);

                gerente.trabalhar();

                break;
            case 2:
                System.out.print("Tecnologias: ");
                String tecnologias = Console.lerString();

                Desenvolvedor dev = new Desenvolvedor(nome, matricula, horasTrabalhadas, valorHora, tecnologias);
                CadastroFuncionario.cadastrar(dev);

                dev.trabalhar();

                break;
            case 3:
                System.out.print("Supervisor: ");
                String supervisor = Console.lerString();

                Estagiario estagiario = new Estagiario(nome, matricula, horasTrabalhadas, valorHora, supervisor);
                CadastroFuncionario.cadastrar(estagiario);

                estagiario.trabalhar();

                break;
            default:
                System.out.println("Tipo de funcionário inválido!");
        }

        System.out.println("Funcionário adicionado com sucesso!");
    }

    private static void removerFuncionario() {
        System.out.println("\nRemover Funcionário:");
        if (CadastroFuncionario.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
            return;
        }

        System.out.print("Digite a matrícula do funcionário a ser removido: ");
        int matricula = Console.lerInt();

        for (Funcionario func : CadastroFuncionario.getListaFuncionarios()) {
            if (func.getMatricula() == matricula) {
                CadastroFuncionario.getListaFuncionarios().remove(func);
                System.out.println("\nFuncionário removido com sucesso!");
                return;
            }
        }
        System.out.println("Matricula não encontrada.");
    }

    private static void exibirFuncionarios() {
        System.out.println("\nLista de Funcionários:");
        if (CadastroFuncionario.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
            return;
        }

        System.out.println("\nLista dos Funcionários: ");
        for (Funcionario funcionario : CadastroFuncionario.getListaFuncionarios()) {
            System.out.println(funcionario);
        }
    }
}
