package Ex3;

import Ex2.FComissionado;
import Ex2.FPadrao;
import Ex2.FProdutividade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int menu=0,ano,eixos,assentos;
        String placa;
        Scanner ler = new Scanner(System.in);
        System.out.println("Escreva a placa do Veículo: ");
        placa = ler.nextLine();
        System.out.println("Escreva o ano do Veículo: ");
        ano = ler.nextInt();
            System.out.println("============= FUNCIONARIOS =============");
            System.out.println("1 - ONIBUS");
            System.out.println("2 - CAMINHÃO");
            System.out.println("==============================================");
            System.out.println("==Por gentileza escolha uma opção de [1-2]: ==");
            System.out.println("==============================================");
            menu = ler.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("ONIBUS");
                    System.out.println("ESCREVA A QUANTIDADE DE ASSENTOS: ");
                    assentos = ler.nextInt();
                    Onibus onibus = new Onibus(placa,ano,assentos);
                    onibus.exibirDados();
                    break;
                case 2:
                    System.out.println("CAMINHÃO");
                    System.out.println("ESCREVA A QUANTIDADE DE EIXOS: ");
                    eixos = ler.nextInt();
                    Caminhao caminhao = new Caminhao(placa,ano,eixos);
                    caminhao.exibirDados();
                    break;
                default:
                    System.out.println("Opção Invalida");

            }
        }
    }

