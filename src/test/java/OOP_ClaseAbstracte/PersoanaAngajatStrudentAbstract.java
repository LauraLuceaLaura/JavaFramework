package OOP_ClaseAbstracte;

public class PersoanaAngajatStrudentAbstract extends PersoanaAbstracta{

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
        System.out.println("Studentul angajat " + getNume() + " " + getPrenume() + " munceste.");
    }

    @Override
    void primesteSalariu() {
        System.out.println("Studentul angajat " + getNume() + " " + getPrenume() + " ia bani.");
    }

    @Override
    void bursa() {
        System.out.println("Studentul angajat " + getNume() + " " + getPrenume() + " ia bursa.");
    }

    @Override
    void practica() {
        System.out.println("Studentul angajat " + getNume() + " " + getPrenume() + " face practica.");
    }

    @Override
    void pierdeVremea() {

    }

    @Override
    void primesteAjutorSocial() {

    }
}
