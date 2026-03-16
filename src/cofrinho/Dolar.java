package cofrinho;

public class Dolar extends Moeda {

    public Dolar(double valorMoeda) {

        super(valorMoeda);
    }

    @Override
    public void info() {

        System.out.println("Total de Dolar: " + valorMoeda);
    }

    @Override
    public double converter() {

        return valorMoeda * 5.37;
    }
}