package Ex2;

public class FProdutividade extends Funcionario {
    private double valor;
    private int producao;

    public FProdutividade(int matricula, double salario, String nome, double valor, int producao) {
        super(matricula, salario, nome);
        this.valor = valor;
        this.producao = producao;
    }

    public double calcularProventos() {
        setSalario(getSalario()+(valor*producao));
        return getSalario();
    }
}
