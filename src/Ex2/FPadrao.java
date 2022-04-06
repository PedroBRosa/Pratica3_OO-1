package Ex2;

public class FPadrao extends Funcionario{
    public FPadrao(int matricula, double salario, String nome) {
        super(matricula, salario, nome);
    }

    public double calcularProventos() {
        return getSalario();
    }

}
