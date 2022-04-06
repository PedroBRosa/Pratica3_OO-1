package Ex2;

public class FComissionado extends Funcionario{

    private double percentual,vendas;

    public FComissionado(int matricula, double salario, String nome, double percentual, double vendas) {
        super(matricula, salario, nome);
        this.percentual = percentual;
        this.vendas = vendas;
    }

    public double calcularProventos() {
        setSalario(getSalario()+(percentual*vendas));
        return getSalario();
    }
}
