package Pizzeria;

public class BezSera extends Dodatki{
    private Pizza pizza;

    public BezSera(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getOpis() {
        String opis = pizza.getOpis();
        if (opis.contains("ser mozzarella")) {
            opis = opis.replace(", ser mozzarella", "");
        }
        return opis;
    }

    @Override
    public double getCena() {
        return pizza.getCena() - 1.5;
    }
}