package ObslugaSklepu;

public class Sklep {
    public static void main(String[] args) {
        Produkt zakupy1 = new Dlugopis();
        zakupy1 = new Rabat(zakupy1);
        zakupy1 = new Maskotka(zakupy1);
        System.out.println(zakupy1.Opis());
        System.out.println(zakupy1.Cena());


        Produkt zakupy2 = new Bieznia();
        zakupy2 = new Transport(zakupy2);
        zakupy2 = new Smycz(zakupy2);
        System.out.println(zakupy2.Opis());
        System.out.println(zakupy2.Cena());
    }
}
