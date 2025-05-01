package Main;

import java.time.LocalDate;

public class Accelerat extends Tren {
    private int numarLocuri;
    private boolean vagonRestaurant;

    public Accelerat() {
    }

    public Accelerat(int numarTren, int numarVagoane, LocalDate dataUltimaRevizie, int numarLocuri, boolean vagonRestaurant) {
        super(numarTren, numarVagoane, dataUltimaRevizie);
        this.numarLocuri = numarLocuri;
        this.vagonRestaurant = vagonRestaurant;
    }

    public int getNumarLocuri() {
        return numarLocuri;
    }

    public void setNumarLocuri(int numarLocuri) {
        this.numarLocuri = numarLocuri;
    }

    public boolean isVagonRestaurant() {
        return vagonRestaurant;
    }

    public void setVagonRestaurant(boolean vagonRestaurant) {
        this.vagonRestaurant = vagonRestaurant;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + numarLocuri + ", " + vagonRestaurant;
    }

    @Override
    public String getType() {
        return "Accelerat";
    }

    @Override
    public int getVar() {
        return numarLocuri;
    }
}
