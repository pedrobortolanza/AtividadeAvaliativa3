package controller;
import java.util.ArrayList;
import java.util.List;

import model.Desenvolvedor;
import model.Estagiario;
import model.Funcionario;
import model.Gerente;

public class CadastroFuncionario {
    
    private static List<Funcionario> listaFuncionarios = new ArrayList<>();

    public static void cadastrar(Funcionario funcionario) {
        listaFuncionarios.add(funcionario);
    }

    public static List<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public static List<Funcionario> listarGerentes() {
        List<Funcionario> gerentes = new ArrayList<>();
        for (Funcionario funcionario : listaFuncionarios) {
            if (funcionario instanceof Gerente) {
                gerentes.add(funcionario);
            }
        }
        return gerentes;
    }

    public static List<Funcionario> listarDesenvolvedores() {
        List<Funcionario> desenvolvedores = new ArrayList<>();
        for (Funcionario funcionario : listaFuncionarios) {
            if (funcionario instanceof Desenvolvedor) {
                desenvolvedores.add(funcionario);
            }
        }
        return desenvolvedores;
    }

    public static List<Funcionario> listarEstagiarios() {
        List<Funcionario> estagiarios = new ArrayList<>();
        for (Funcionario funcionario : listaFuncionarios) {
            if (funcionario instanceof Estagiario) {
                estagiarios.add(funcionario);
            }
        }
        return estagiarios;
    }

    public static boolean isEmpty() {
        return listaFuncionarios.isEmpty();
    }
}