package ObslugaSklepu;

public class Smycz extends Dodatek{

    private Produkt produkt;

    public Smycz(Produkt produkt){
        this.produkt = produkt;
    }

    @Override
    public String Opis() {
        return produkt.Opis() + ", ObslugaSklepu.Smycz (1pln)";
    }

    @Override
    public double Cena() {
        return produkt.Cena() + 1.0;
    }
}
