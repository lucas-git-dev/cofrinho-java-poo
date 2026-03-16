package cofrinho;
public class Euro extends Moeda {

    public Euro(double valorMoeda) {

        super(valorMoeda);
    }

    @Override
    public void info() {

        System.out.println("Total de Euro: " + valorMoeda);
    }

    @Override
    public double converter() {

        return valorMoeda * 6.15;
    }
}