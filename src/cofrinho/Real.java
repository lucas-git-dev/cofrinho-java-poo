package cofrinho;
public class Real extends Moeda {

    public Real(double valorMoeda) {

        super(valorMoeda);
    }

    @Override
    public void info() {

        System.out.println("Total de Real: " + valorMoeda);
    }

    @Override
    public double converter() {

        return valorMoeda;
    }
}