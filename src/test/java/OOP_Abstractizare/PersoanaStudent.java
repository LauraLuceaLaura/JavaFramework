package OOP_Abstractizare;

public class PersoanaStudent extends PersoanaInterface implements InterfaceStudent{


    public PersoanaStudent(String nume, String prenume, Integer varsta) {
        super(nume, prenume, varsta);
    }

    @Override
    public void practica() {
        System.out.println("Studentul " + getNume() + " " + getPrenume() + " face practica la Pentalog.");
    }

    @Override
    public void bursa() {
        System.out.println("Studentul " + getNume() + " " + getPrenume() + " ia 800 lei bursa.");
    }
}
