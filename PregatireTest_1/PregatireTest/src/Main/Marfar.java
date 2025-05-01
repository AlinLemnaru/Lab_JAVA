package Main;

import java.time.LocalDate;

public class Marfar extends Tren{
    private String marfaTransportata;

    public Marfar() {
    }

    public Marfar(int numarTren, int numarVagoane, LocalDate dataUltimaRevizie, String marfaTransportata) {
        super(numarTren, numarVagoane, dataUltimaRevizie);
        this.marfaTransportata = marfaTransportata;
    }

    public String getMarfaTransportata() {
        return marfaTransportata;
    }

    public void setMarfaTransportata(String marfaTransportata) {
        this.marfaTransportata = marfaTransportata;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + marfaTransportata;
    }

    @Override
    public String getType() {
        return "Marfar";
    }

    @Override
    public int getVar() {
        return 0;
    }
}
