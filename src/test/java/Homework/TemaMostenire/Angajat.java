package Homework.TemaMostenire;

import java.util.HashMap;

public class Angajat extends Persoana{

    public String functie;
    public Integer vechime;
    private Double salariu;
    private Integer zileLucrate;

    //public Integer bonuri = calculBonuriMasa(zileLucrate);

    public Angajat(String cnp, String nume, String prenume, Integer varsta, String numarTelefon, Boolean fumator,
                   String functie, Integer vechime, Double salariu) {
        super(cnp, nume, prenume, varsta, numarTelefon, fumator);

        this.functie = functie;
        this.vechime = vechime;
        this.salariu = salariu;
    }

    public Double getSalariu() {
        return salariu;
    }

    public Integer getZileLucrate() {
        return zileLucrate;
    }

    public void infoAngajat()
    {
        infoPersoana();
        System.out.println("Angajatul are functia de: " + functie);
        System.out.println("Angajatul lucreaza de " + vechime + " ani pe acest post.");
        System.out.println("Castiga " + salariuBrut() + " lei brut.");
        System.out.println("Are venituri de " + getSalariu() + " lei net.");
    }

    public Double salariuBrut()
    {
        Double salariuIntreg = getSalariu() + (16 * getSalariu())/100;
        salariuIntreg += (10 * salariuIntreg)/100;
        salariuIntreg += (10 * salariuIntreg)/100;
        salariuIntreg += (25 * salariuIntreg)/100;
        return  salariuIntreg;
    }

    public Integer calculBonuriMasa(Integer zileLucrate)
    {
        Integer bonuri = 0;
        for ( Integer i=1 ; i<= zileLucrate ; i++)
        {
            bonuri = bonuri + 30;
        }
        System.out.println("Castiga bonuri in valoare de " + bonuri + " lei.");
        return bonuri;
    }

//    public Double venituriTotale()
//    {
//        Double venituriTotaleSalariu = getSalariu() + bonuri ;
//        System.out.println("Venituri totale de:" + venituriTotaleSalariu + "lei");
//        return venituriTotaleSalariu;
//    }

}
