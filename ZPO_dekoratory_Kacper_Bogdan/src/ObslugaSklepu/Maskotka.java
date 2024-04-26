package ObslugaSklepu;

public class Maskotka extends Dodatek{

    private Produkt produkt;

    public Maskotka(Produkt produkt){
        this.produkt = produkt;
    }

    @Override
    public String Opis() {
        return produkt.Opis() + ", maskotka (0pln)";
    }

    @Override
    public double Cena() {
        return produkt.Cena();
    }
}
