package OOP_ClaseAbstracte;

public class PersoanaStudentAbstract extends PersoanaAbstracta{

    private String nume;
    private String prenume;

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

    @Override
    void munceste() {

    }

    @Override
    void primesteSalariu() {

    }

    @Override
    void bursa() {
        System.out.println("Studentul angajat " + getNume() + " " + getPrenume() + " ia busra");
    }

    @Override
    void practica() {
        System.out.println("Studentul angajat " + getNume() + " " + getPrenume() + " face practica");
    }

    @Override
    void pierdeVremea() {

    }

    @Override
    void primesteAjutorSocial() {

    }



}
