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

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract double calcularProventos();

    public String toString(){
        return nome + " " + calcularProventos();
    }

}
