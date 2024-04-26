package Pizzeria;

public class Main {
    public static void main(String[] args) {
        Pizza pizza1 = new Margherita();
        System.out.println("Cena pizzy1: "+pizza1.getCena());
        System.out.println("Opis pizza1: "+pizza1.getOpis());


        Pizza pizza2 = new Margherita();
        pizza2 = new Pieczaki(pizza2);
        System.out.println("Cena pizzy2: "+pizza2.getCena());
        System.out.println("Opis pizza2: "+pizza2.getOpis());

        pizza2 = new BezPieczarek(pizza2);
        System.out.println("Cena pizzy2: "+pizza2.getCena());
        System.out.println("Opis pizza2: "+pizza2.getOpis());

        pizza2 = new BezSera(pizza2);
        System.out.println("Cena pizzy2: "+pizza2.getCena());
        System.out.println("Opis pizza2: "+pizza2.getOpis());


        Pizza pizza3 = new Capriciosa();
        pizza3 = new BezPieczarek(pizza3);
        pizza3 = new Cebula(pizza3);
        System.out.println("Cena pizzy3: "+pizza3.getCena());
        System.out.println("Opis pizza3: "+pizza3.getOpis());


    }
}
