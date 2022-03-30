package Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int menu=0;
        double val = 100;
        Scanner ler = new Scanner(System.in);
        while (menu != 4) {
            System.out.println("============= INGRESSOS CARNAVAL =============");
            System.out.println("1 - Ex1.Ingresso Ex1.Normal");
            System.out.println("2 - Ex1.Ingresso Ex1.Vip");
            System.out.println("3 - Ex1.Camarote");
            System.out.println("4 - Sair");
            System.out.println("==============================================");
            System.out.println("==Por gentileza escolha uma opção de [1-4]: ==");
            System.out.println("==============================================");
            menu = ler.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("==============================================");
                    Normal normal = new Normal(val);
                    normal.ingressoNormal();
                    System.out.println("==============================================");
                    break;
                case 2:
                    System.out.println("==============================================");
                    Vip vip = new Vip(val,50);
                    vip.ingressoVip();
                    System.out.println("==============================================");
                    break;
                case 3:
                    System.out.println("==============================================");
                    Camarote camarote = new Camarote(val, 100,"SETOR NORTE");
                    camarote.ingressoCamarote();
                    System.out.println("==============================================");
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção Invalida!");

            }
        }
    }
}
