package OOP_Abstractizare;

public class PersoanaAngajata extends PersoanaInterface implements  InterfaceAngajat{


    public PersoanaAngajata(String nume, String prenume, Integer varsta) {
        super(nume, prenume, varsta);
    }

    @Override
    public void munceste() {
        System.out.println("Angajatul " + getNume() + " " + getPrenume() + " munceste." );
    }

    @Override
    public void primesteSalariu() {
        System.out.println("Angajatul " + getNume() + " " + getPrenume() + "primeste 1500 lei.");
    }

}
