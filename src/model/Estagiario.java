package model;
import interfaces.Trabalhavel;

public class Estagiario extends Funcionario implements Trabalhavel {
    private String supervisor;

    public Estagiario(String nome, int matricula, int horasTrabalhadas, float valorHora, String supervisor) {
        super(nome, matricula, horasTrabalhadas, valorHora);
        this.supervisor = supervisor;
    }

    public String getSupervisor() {
        return supervisor;
    }

    @Override
    public float calcularSalario() {
        return getValorHora() * getHorasTrabalhadas();
    }

    @Override
    public void trabalhar() {
        System.out.println("Estagiário Firmino trabalhando arduamente...");
    }

    @Override
    public void relatarProgresso() {
        System.out.println("Estagiário Firmino relata pouco progresso...");
    }

    @Override
    public String toString() {

        return super.toString() +
        "\nSalário: " + calcularSalario() + 
        "\nSupervisor: " + supervisor;
    }
}