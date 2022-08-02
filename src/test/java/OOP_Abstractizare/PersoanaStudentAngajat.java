package OOP_Abstractizare;

public class PersoanaStudentAngajat extends PersoanaInterface implements InterfaceStudent, InterfaceAngajat {


    public PersoanaStudentAngajat(String nume, String prenume, Integer varsta) {
        super(nume, prenume, varsta);
    }

    @Override
    public void munceste() {
        System.out.println("Studentul angajat " + getNume() + " " + getPrenume() + " munceste.");
    }

    @Override
    public void primesteSalariu() {
        System.out.println("Studentul angajat " + getNume() + " " + getPrenume() + " ia 1500 lei.");
    }

    @Override
    public void practica() {
        System.out.println("Studentul angajat " + getNume() + " " + getPrenume() + " face practica la Pentalog.");
    }

    @Override
    public void bursa() {
        System.out.println("Studentul angajat " + getNume() + " " + getPrenume() + " ia bursa 800 lei.");
    }
}
