package Ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int menu = 0, matricula, producao;
        double percentual, vendas, salario, valor;
        String nome;
        Scanner ler = new Scanner(System.in);
        System.out.println("Escreva o nome do funcionario: ");
        nome = ler.nextLine();
        System.out.println("Escreva o salario do funcionario: ");
        salario = ler.nextDouble();
        System.out.println("Escreva a matricula: ");
        matricula = ler.nextInt();
        while (menu != 4) {
            System.out.println("============= FUNCIONARIOS =============");
            System.out.println("1 - PADRÃO");
            System.out.println("2 - COMISSIONARIO");
            System.out.println("3 - PRODUTIVIDADE");
            System.out.println("4 - Sair");
            System.out.println("==============================================");
            System.out.println("==Por gentileza escolha uma opção de [1-4]: ==");
            System.out.println("==============================================");
            menu = ler.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("SALARIO FIXO");
                    FPadrao fPadrao = new FPadrao(matricula, salario, nome);
                    System.out.println(fPadrao.toString());
                    break;
                case 2:
                    System.out.println("COMISSÃO");
                    System.out.println("Escreva o Percentual: ");
                    percentual = ler.nextDouble();
                    System.out.println("Escreva as Vendas: ");
                    vendas = ler.nextDouble();
                    FComissionado fComissionado = new FComissionado(matricula, salario, nome, percentual, vendas);
                    System.out.println(fComissionado.toString());
                    break;
                case 3:
                    System.out.println("PRODUTIVIDADE");
                    System.out.println("Escreva o Valor: ");
                    valor = ler.nextDouble();
                    System.out.println("Escreva a Produção: ");
                    producao = ler.nextInt();
                    FProdutividade fProdutividade = new FProdutividade(matricula, salario, nome, valor, producao);
                    System.out.println(fProdutividade.toString());
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção Invalida");

            }
        }
    }
}