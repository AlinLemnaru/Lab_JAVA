package masini.group.SpringJdbcMySQL;

public class Masina {
    private String nr_inm;
    private String marca;
    private int an;
    private String culoare;
    private int nr_km;

    public Masina() {
    }

    public Masina(String nr_inm, String marca, int an, String culoare, int nr_km) {
        this.nr_inm = nr_inm;
        this.marca = marca;
        this.an = an;
        this.culoare = culoare;
        this.nr_km = nr_km;
    }

    public String getNr_inm() {
        return nr_inm;
    }

    public void setNr_inm(String nr_inm) {
        this.nr_inm = nr_inm;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public int getNr_km() {
        return nr_km;
    }

    public void setNr_km(int nr_km) {
        this.nr_km = nr_km;
    }

    @Override
    public String toString() {
        return nr_inm + ", " + marca + ", " + an + ", " + culoare + ", " + nr_km;
    }
}
