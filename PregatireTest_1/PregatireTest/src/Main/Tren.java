package Main;

import java.time.LocalDate;

public abstract class Tren {
    private int numarTren;
    private int numarVagoane;
    private LocalDate dataUltimaRevizie;

    public Tren() {
    }

    public Tren(int numarTren, int numarVagoane, LocalDate dataUltimaRevizie) {
        this.numarTren = numarTren;
        this.numarVagoane = numarVagoane;
        this.dataUltimaRevizie = dataUltimaRevizie;
    }

    public int getNumarTren() {
        return numarTren;
    }

    public void setNumarTren(int numarTren) {
        this.numarTren = numarTren;
    }

    public int getNumarVagoane() {
        return numarVagoane;
    }

    public void setNumarVagoane(int numarVagoane) {
        this.numarVagoane = numarVagoane;
    }

    public LocalDate getDataUltimaRevizie() {
        return dataUltimaRevizie;
    }

    public void setDataUltimaRevizie(LocalDate dataUltimaRevizie) {
        this.dataUltimaRevizie = dataUltimaRevizie;
    }

    @Override
    public String toString() {
        return numarTren + ", " + numarVagoane + ", " + dataUltimaRevizie;
    }

    public abstract String getType();

    public abstract int getVar();
}
