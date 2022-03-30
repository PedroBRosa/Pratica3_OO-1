package Ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int menu = 0,matricula,producao;
        double  percentual,vendas,salario;
        String nome;
        Scanner ler = new Scanner(System.in);

        switch (menu) {
            case 1:
                System.out.println("SALARIO FIXO");
                FPadrao f = new FPadrao(matricula,nome,salario);
            case 2:
                System.out.println("COMISSÃO");
            case 3:
                System.out.println("PRODUTIVIDADE");
            default:
                System.out.println("Opção Invalida");


        }
    }
}
