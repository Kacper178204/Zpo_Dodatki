package Pizzeria;

public class Cebula extends Dodatki{
    private Pizza pizza;

    public Cebula(Pizza pizza)
    {
        this.pizza = pizza;
    }

    @Override
    public String getOpis() {
        return pizza.getOpis() + ", cebula";
    }

    @Override
    public double getCena() {
        return pizza.getCena() + 5.77;
    }
}
