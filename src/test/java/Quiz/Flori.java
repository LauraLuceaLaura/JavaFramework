package Quiz;

public class Flori implements FloriInterface{

    private String nume;
    private Integer numarBucati;
    private String culoare;
    private Boolean frunze;

    public Flori(String nume, Integer numarBucati, String culoare, Boolean frunze) {
        this.nume = nume;
        this.numarBucati = numarBucati;
        this.culoare = culoare;
        this.frunze = frunze;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Integer getNumarBucati() {
        return numarBucati;
    }

    public void setNumarBucati(Integer numarBucati) {
        this.numarBucati = numarBucati;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public Boolean getFrunze() {
        return frunze;
    }

    public void setFrunze(Boolean frunze) {
        this.frunze = frunze;
    }

    @Override
    public void vandFloare() {

    }

    @Override
    public void vandBuchet() {

    }

    @Override
    public void pregatescBuchet() {

    }
}
