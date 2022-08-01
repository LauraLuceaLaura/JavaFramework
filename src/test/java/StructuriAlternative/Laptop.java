package StructuriAlternative;

import org.junit.Test;

import javax.sound.midi.Soundbank;

public class Laptop {

    //structuri alternative = if, else si switch, case
    @Test
    public void metodaTeste(){
        par(6);
        par(7);
        par(-2);
        par(-3);
        par(0);
    }
    @Test
    public void afisareZileleSaptamanii()
    {
        afisareZileleSaptamanii("luni");
    }

    @Test
    public void test()
    {
        System.out.println(conditiiIf(3));
    }

    //verificam daca nu nr e par si pozitiv

    public void par( Integer nr) {
        if(nr==0){
            System.out.println("Numarul este 0");
        }
        if (nr < 0) {
            if (nr % 2 == 0) {
                System.out.println("Numarul " + nr + " negativ si par");
            } else {
                System.out.println("Numarul " + nr + " negativ si impar");
            }
        }
        if(nr>0) {
            if (nr % 2 == 0) {
                System.out.println("Numarul " + nr + " e pozitiv si par");
            } else {
                System.out.println("Numarul " + nr + " e pozitiv si impar");
            }
        }
    }

    public void afisareZileleSaptamanii(String zi)
    {
        switch (zi)
        {
            case "luni":
                System.out.println("Astazi este luni");
                break;
            case "marti" :
                System.out.println("Astazi este marti");
                break;
            case "miercuri" :
                System.out.println("Astazi este miercuri");
                break;

        }
    }

    public Integer conditiiIf(Integer numar)
    {
        switch(numar)
        {
            case 1:
                return numar;
            case 2:
                return numar*2;
            default: return 0;
        }

    }

}
