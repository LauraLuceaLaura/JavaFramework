package OOP_Abstractizare;

public class PersoanaStudentSomer extends PersoanaInterface implements InterfaceStudent, InterfaceSomer{


    public PersoanaStudentSomer(String nume, String prenume, Integer varsta) {
        super(nume, prenume, varsta);
    }

    @Override
    public void pierdeVremea() {
        System.out.println("Studentul angajat " + getNume() + " " + getPrenume() + " pierde vremea.");
    }

    @Override
    public void primesteAjutorSocial() {
        System.out.println("Studentul angajat " + getNume() + " " + getPrenume() + " primeste ajutor social.");
    }

    @Override
    public void practica() {
        System.out.println("Studentul angajat " + getNume() + " " + getPrenume() + " face practica la Pentalog");
    }

    @Override
    public void bursa() {
        System.out.println("Studentul angajat " + getNume() + " " + getPrenume() + " ia 800 lei bursa.");
    }
}
