package model;
import interfaces.Trabalhavel;

public class Gerente extends Funcionario implements Trabalhavel {
    private float bonusAnual;
    private String equipe;

    public Gerente(String nome, int matricula, int horasTrabalhadas, float valorHora, float bonusAnual, String equipe) {
        super(nome, matricula, horasTrabalhadas, valorHora);
        this.bonusAnual = bonusAnual;
        this.equipe = equipe;
    }

    public String getEquipe() {
        return equipe;
    }

    @Override
    public float calcularSalario() {
        return getValorHora() * getHorasTrabalhadas() + bonusAnual;
    }

    @Override
    public void trabalhar() {
        System.out.println("Gerente Jason está trabalhando...");
    }

    @Override
    public void relatarProgresso() {
        System.out.println("Gerente Jason relata um bom progresso...");
    }

    @Override
    public String toString() {

        return super.toString() +
        "\nSalário: " + calcularSalario() + 
        "\nEquipe: " + equipe;
    }
}