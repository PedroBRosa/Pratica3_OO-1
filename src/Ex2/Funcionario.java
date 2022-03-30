package Ex2;

abstract class Funcionario {
    private int matricula;
    private double salario;
    private String nome;

    public Funcionario(int matricula, double salario, String nome) {
        this.matricula = matricula;
        this.salario = salario;
        this.nome = nome;
    }

    public abstract double calcularProventos();

    public String toString(){
        return nome + " " + calcularProventos();
    }

}
