public class Camarote extends Ingresso {
    private double valorAd;
    private String local;

    public Camarote(double valor, double valorAd, String local) {
        super(valor);
        this.valorAd = valorAd;
        this.local = local;
    }
    public void ingressoCamarote(){
        double valorCamarote = valorAd+getValor();
        System.out.printf("O local do camarote é %s e o valor do Ingresso é %.2f R$ \n",local,valorCamarote);
    }
}
