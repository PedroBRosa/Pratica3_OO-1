public class Vip extends Ingresso {
    private double valorAd;
    public Vip(double valor, double valorAd) {
        super(valor);
        this.valorAd = valorAd;
    }

    public void ingressoVip(){
        double valorVip = valorAd+getValor();
        System.out.printf("O valor do Ingresso Vip é: %.2f R$  \n",valorVip);
    }
}
