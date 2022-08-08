package Quiz;

public class Fructe {

   private String nume;
   private Integer bucati;
   private Double cantitate;

    public String getNume() {
        return nume;
    }

    public Integer getBucati() {
        return bucati;
    }

    public Double getCantitate() {
        return cantitate;
    }

    public Fructe(String nume, Integer bucati, Double cantitate) {
        this.nume = nume;
        this.bucati = bucati;
        this.cantitate = cantitate;
    }

    public Fructe(String nume, Integer bucati) {
        this.nume = nume;
        this.bucati = bucati;
    }

    public Fructe(String nume, Double cantitate) {
        this.nume = nume;
        this.cantitate = cantitate;
    }

}
