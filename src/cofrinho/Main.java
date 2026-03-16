package cofrinho;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Cofrinho cofrinho = new Cofrinho();

        int opcao = 0;

        do {

            System.out.println("\nMenu do Cofrinho");
            System.out.println("1 - Adicionar moeda");
            System.out.println("2 - Remover moeda");
            System.out.println("3 - Listar moedas");
            System.out.println("4 - Converter para Real");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:

                    System.out.println("Escolha o tipo de moeda:");
                    System.out.println("1 - Real");
                    System.out.println("2 - Dólar");
                    System.out.println("3 - Euro");

                    int tipo = sc.nextInt();

                    System.out.println("Digite o valor da moeda:");

                    double valor = sc.nextDouble();

                    if (tipo == 1) {

                        cofrinho.adicionar(new Real(valor));
                    }

                    if (tipo == 2) {

                        cofrinho.adicionar(new Dolar(valor));
                    }

                    if (tipo == 3) {

                        cofrinho.adicionar(new Euro(valor));
                    }

                    break;

                case 2:

                    System.out.println("Escolha a moeda para remover:");
                    System.out.println("1 - Real");
                    System.out.println("2 - Dolar");
                    System.out.println("3 - Euro");

                    int tipoRemover = sc.nextInt();

                    System.out.println("Digite o valor da moeda:");
                    double valorRemover = sc.nextDouble();

                    if (tipoRemover == 1) {
                        cofrinho.remover(new Real(valorRemover));
                    }

                    if (tipoRemover == 2) {
                        cofrinho.remover(new Dolar(valorRemover));
                    }

                    if (tipoRemover == 3) {
                        cofrinho.remover(new Euro(valorRemover));
                    }

                break;

                case 3:

                    cofrinho.listagemMoedas();

                    break;

                case 4:

                    double total = cofrinho.totalConvertido();

                    System.out.println("Total de moedas se converter para reais: " + total);

                    break;

            }

        } while (opcao != 0);

        sc.close();
    }
}
