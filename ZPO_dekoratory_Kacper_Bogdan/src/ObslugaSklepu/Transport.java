package ObslugaSklepu;

public class Transport extends Dodatek{

    private Produkt produkt;

    public Transport(Produkt produkt){
        this.produkt = produkt;
    }

    @Override
    public String Opis() {
        return produkt.Opis() + ", transport (13 pln)";
    }

    @Override
    public double Cena() {
        return produkt.Cena() + 13.0;
    }
}
