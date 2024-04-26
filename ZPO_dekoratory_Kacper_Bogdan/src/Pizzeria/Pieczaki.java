package Pizzeria;

public class Pieczaki extends Dodatki{

    private Pizza pizza;

    public Pieczaki(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getOpis() {
        return pizza.getOpis() + ", pieczarki";
    }

    @Override
    public double getCena() {
        return pizza.getCena() + 2.5;
    }
}
