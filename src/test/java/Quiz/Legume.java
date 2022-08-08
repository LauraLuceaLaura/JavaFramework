package Quiz;

public class Legume {

    private String nume;
    private Integer bucati;
    private Double cantitate;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Integer getBucati() {
        return bucati;
    }

    public void setBucati(Integer bucati) {
        this.bucati = bucati;
    }

    public Double getCantitate() {
        return cantitate;
    }

    public void setCantitate(Double cantitate) {
        this.cantitate = cantitate;
    }

    public Legume(String nume, Integer bucati, Double cantitate) {
        this.nume = nume;
        this.bucati = bucati;
        this.cantitate = cantitate;
    }

    public Legume(String nume, Integer bucati) {
        this.nume = nume;
        this.bucati = bucati;
    }

    public Legume(String nume, Double cantitate) {
        this.nume = nume;
        this.cantitate = cantitate;
    }

}
