package model;
public abstract class Funcionario{

    private String nome;
    private int matricula;
    private int horasTrabalhadas;
    private float valorHora;

    public abstract float calcularSalario();

    public Funcionario(String nome, int matricula, int horasTrabalhadas, float valorHora) {
        this.nome = nome;
        this.matricula = matricula;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }


    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public float getValorHora() {
        return valorHora;
    }

    @Override
    public String toString() {
        return "\nMatrícula: " + matricula +
                "\nNome: " + nome +
                "\nValor da hora: R$ " + valorHora +
                "\nHoras trabalhadas: " + horasTrabalhadas;
    }

    
}
