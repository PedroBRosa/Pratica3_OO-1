package Ex1;

public class Vip extends Ingresso {
    private double valorAd;
    public Vip(double valor, double valorAd) {
        super(valor);
        this.valorAd = valorAd;
    }

    public void ingressoVip(){
        double valorVip = valorAd+getValor();
        System.out.printf("O valor do Ex1.Ingresso Ex1.Vip é: %.2f R$  \n",valorVip);
    }
}
