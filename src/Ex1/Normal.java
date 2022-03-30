package Ex1;

public class Normal extends Ingresso{

    public Normal(double valor) {
        super(valor);
    }
    public void ingressoNormal(){
        System.out.printf("O valor do ingresso normal é %.2f R$ \n",getValor());
    }
}
