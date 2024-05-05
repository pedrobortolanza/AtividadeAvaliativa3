package model;
import interfaces.Trabalhavel;

public class Desenvolvedor extends Funcionario implements Trabalhavel {
    private String tecnologias;

    public Desenvolvedor(String nome, int matricula, int horasTrabalhadas, float valorHora, String tecnologias) {
        super(nome, matricula, horasTrabalhadas, valorHora);
        this.tecnologias = tecnologias;
    }

    public String getTecnologias() {
        return tecnologias;
    }

    @Override
    public float calcularSalario() {
        return getHorasTrabalhadas() * getValorHora() + 200;
    }

    @Override
    public void trabalhar() {
        System.out.println("Desenvolvedor Pedro está trabalhando...");
    }

    @Override
    public void relatarProgresso() {
        System.out.println("Desenvolvedor Pedro relata progresso ótimo...");
    }
    @Override
    public String toString() {

        return super.toString() +
        "\nSalário: " + calcularSalario() + 
        "\nTecnologias: " + tecnologias;
    }
}