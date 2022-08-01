package Homework;

import org.junit.Test;

public class Televizor {

    public String brand;
    public String culoare;
    public Character telecomanda;
    public Integer anAparitie;
    public Float greutate;
    public Boolean smart;
    public Double diagonala;
    public Double pretInitial;
    public Double pretDupaReducere;
    public Double diferentaReducere;

    public Double getProcentReducere()
    {
        Double procentReducere = (diferentaReducere*100)/pretInitial;
        return procentReducere;
    }

    @Test
    public void getInfo()
    {
        brand = "Samsung";
        culoare = "negru";
        telecomanda = 'y';
        anAparitie = 2022;
        greutate = 29.4f;
        smart = true;
        diagonala = 188.5 ;
        pretInitial = 5699.9;
        pretDupaReducere = 5350.0;
        diferentaReducere = pretInitial - pretDupaReducere;

        System.out.println("Brand: " + brand);
        System.out.println("Culoare: " + culoare);
        System.out.println("Telecomanda: " + telecomanda);
        System.out.println("An aparitie: " + anAparitie);
        System.out.println("Greutate: " + greutate + " kg");
        System.out.println("Este smart? " + smart);
        System.out.println("Diagonala: " + diagonala + " cm");
        System.out.println("Pret initial: " + pretInitial + " lei");
        System.out.println("Pret dupa reducere: " + pretDupaReducere + " lei");
        System.out.println("Diferetna pret: " + diferentaReducere + " lei");
        System.out.println("Procent reducere: " + getProcentReducere() + " %");
    }
}
