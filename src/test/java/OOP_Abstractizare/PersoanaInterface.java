package OOP_Abstractizare;

public class PersoanaInterface {

    //abstractizarea = conceptul pe baza caruia definim comportamentul unei clase
    //abstractizarea se poate face folosind interfete sau clase abstracte

    private String nume;
    private String prenume;
    private Integer varsta;

    public PersoanaInterface(String nume, String prenume, Integer varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }



}
