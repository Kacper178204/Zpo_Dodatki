package ObslugaSklepu;

public class Rabat extends Dodatek{

    private Produkt produkt;

    public Rabat(Produkt produkt){
        this.produkt = produkt;
    }


    @Override
    public String Opis() {
        return produkt.Opis() + ", rabat(-10 pln)";
    }

    @Override
    public double Cena() {
        double cenaZRabatem = produkt.Cena()-10.0;
        return cenaZRabatem > 0 ? cenaZRabatem : 0;
    }
}
