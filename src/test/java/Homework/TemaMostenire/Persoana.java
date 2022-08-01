package Homework.TemaMostenire;

public class Persoana {

    private String cnp;
    public String nume;
    public String prenume;
    public Integer varsta;
    private String numarTelefon;
    public Boolean fumator;

    public Persoana(String cnp, String nume, String prenume, Integer varsta, String numarTelefon, Boolean fumator) {
        this.cnp = cnp;
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.numarTelefon = numarTelefon;
        this.fumator = fumator;
    }

    public void infoPersoana() {
        System.out.println("CNP-ul este: " + getCnp());
        System.out.println("Numele: " + nume);
        System.out.println("Prenumele: " + prenume);
        System.out.println("Varsta: " + varsta + " ani");
        System.out.println("Numar de telefon: " + getNumarTelefon());
        if ( fumator == true)
        {
            String verificare = "Da";
            System.out.println("Este fumator? " + verificare);
        }
        else
        {
            String verificare = "Nu";
            System.out.println("Este fumator? " + verificare);
        }
    }

    public String getCnp() {
        return cnp;
    }

    public String getNumarTelefon() {
        return numarTelefon;
    }
}
