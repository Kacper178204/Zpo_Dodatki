package Pizzeria;

public class BezPieczarek extends Dodatki{
    private Pizza pizza;

    public BezPieczarek(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getOpis() {
        String opis = pizza.getOpis();
        if (opis.contains("pieczarki")) {
            opis = opis.replace(", pieczarki", "");
        }
        return opis;
    }

    @Override
    public double getCena() {
        return pizza.getCena() - 2.5;
    }
}
