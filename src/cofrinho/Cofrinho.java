package cofrinho;

import java.util.ArrayList;

public class Cofrinho {

    private ArrayList<Moeda> listaMoedas = new ArrayList<>();


    public void adicionar(Moeda moeda) {

        listaMoedas.add(moeda);

        System.out.println("Você adicionou moeda no cofre");
    }


    public void remover(Moeda moeda) {

        boolean encontrada = false;

        for (Moeda m : listaMoedas) {

            if (m.getClass() == moeda.getClass() && m.valorMoeda == moeda.valorMoeda) {

                listaMoedas.remove(m);

                encontrada = true;

                System.out.println("Moeda Removida");

                break;
            }
        }

        if (!encontrada) {

            System.out.println("Moeda não encontrada no cofrinho.");
        }
    }


    public void listagemMoedas() {

        for (Moeda moeda : listaMoedas) {

            moeda.info();
        }
    }


    public double totalConvertido() {

        double total = 0;

        for (Moeda moeda : listaMoedas) {

            total += moeda.converter();
        }

        return total;
    }
}