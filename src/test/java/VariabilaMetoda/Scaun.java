package VariabilaMetoda;

import org.junit.Test;

public class Scaun {

    //clasa = colectie de atribute si metode
    //atribut = variabila unei clase
    //metoda = actiunea unei clase
    //intr-un fisier java se pot face n clase
    //variabila = 2 tipuri : globala si locala
    //var globala = vizibila peste tot
    //var locala = vizibila unde o declari
    //structura var globala = are acces control (3 variante: public, private, protected), tip de variabila, un nume
    //o var poate sau nu sa primeasca o val
    public String material;
    public String model;
    public Integer nr_picioare;
    public Double inaltime;
    public Float greutate;
    public Character marime;
    public Boolean esteTapitat;

    @Test
    public void InfoScaun()
    {
        material = "Fag";
        model = "Smacher";
        nr_picioare = 4;
        inaltime = 10.7;
        greutate = 2.5f;
        marime = 'M';
        esteTapitat = true;

        System.out.println(material);
        System.out.println(model);
        System.out.println(nr_picioare);
        System.out.println("Inaltimea este : " + inaltime);
        System.out.println("Greutatea :" + greutate);
        System.out.println("Marime : " + marime);
        System.out.println("Este tapitat? " + esteTapitat);

        afiseazaPret();
        System.out.println(getCuloareScaun());

    }

    public void afiseazaPret()
    {
        Double pret = 1.234;
        System.out.println("Pret : " +pret);
    }

    public String getCuloareScaun()
    {
       return "rosu";
    }

}
