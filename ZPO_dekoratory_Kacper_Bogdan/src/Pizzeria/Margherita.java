package Pizzeria;

class Margherita extends Pizza {
    @Override
    public String getOpis() {
        return "Pizzeria.Pizza Pizzeria.Margherita, sos pomidorowy, ser mozzarella";
    }

    @Override
    public double getCena() {
        return 15.0;
    }
}