package cofrinho;
public abstract class Moeda {

    protected double valorMoeda;

    public Moeda(double valorMoeda) {
        this.valorMoeda = valorMoeda;
    }

    public abstract void info();

    public abstract double converter();
}