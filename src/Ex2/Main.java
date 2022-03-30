package Ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int menu = 0,matricula,producao;
        double  percentual,vendas,salario,valor;
        String nome;
        Scanner ler = new Scanner(System.in);
        System.out.println("Escreva o nome do funcionario: ");
        nome = ler.nextLine();
        System.out.println("Escreva o salario do funcionario: ");
        salario = ler.nextDouble();
        System.out.println("Escreva a matricula: ");
        matricula = ler.nextInt();
        switch (menu) {
            case 1:
                System.out.println("SALARIO FIXO");
                FPadrao fPadrao = new FPadrao(matricula,salario,nome);
            case 2:
                System.out.println("COMISSÃO");
                System.out.println("Escreva o Percentual: ");
                percentual = ler.nextDouble();
                System.out.println("Escreva as Vendas: ");
                vendas = ler.nextDouble();
                FComissionado fComissionado = new FComissionado(matricula,salario,nome,percentual,vendas);
            case 3:
                System.out.println("PRODUTIVIDADE");
                System.out.println("Escreva o Valor: ");
                valor = ler.nextDouble();
                System.out.println("Escreva a Produção: ");
                producao = ler.nextInt();
                FProdutividade fProdutividade = new FProdutividade(matricula,salario,nome,valor,producao);
            default:
                System.out.println("Opção Invalida");


        }
    }
}
