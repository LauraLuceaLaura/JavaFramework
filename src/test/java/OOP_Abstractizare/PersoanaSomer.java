package OOP_Abstractizare;

import org.openqa.selenium.remote.JsonToWebElementConverter;

public class PersoanaSomer extends PersoanaInterface implements InterfaceSomer{


    public PersoanaSomer(String nume, String prenume, Integer varsta) {
        super(nume, prenume, varsta);
    }

    @Override
    public void pierdeVremea() {
        System.out.println("Somerul " +  getNume() + " " + getPrenume() + " pierde vremea.");
    }

    @Override
    public void primesteAjutorSocial() {
        System.out.println("Somerul " + getNume() + " " + getPrenume() + " primeste ajutor social.");
    }
}
