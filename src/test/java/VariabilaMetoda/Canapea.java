package VariabilaMetoda;


import org.junit.Test;

public class Canapea {

    @Test
    public void metodaTest()
    {
        afisareNumeCanapea("Extensibila");
        afisareNumeCanapea("Dreapta");
        afisareNumeCanapea("Coltar");

        calculReducere(160,10);
        calculReducere(75 , 50);
        calculReducere(80, 30);
    }

    //printam numele canapelei
    public void afisareNumeCanapea( String nume)
    {
        System.out.println(nume);
    }

    //aplicam o reducere la o canapea

    public void calculReducere( Integer pret , Integer reducere)
    {
        Integer pretRedus = (pret*reducere)/100;
        Integer pretFinal = pret - pretRedus;
        System.out.println("Pretul " +pret+ " dupa reducere cu " +reducere+ " %: " + pretFinal);

    }

}
