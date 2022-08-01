package Homework.TemaMostenire;

import org.junit.Test;

public class TestAngajat {

    public Integer zileLucrate;

    @Test
    public void testPersoane()
    {
        Angajat angajat1 = new Angajat("3890216070014", "Popescu", "Ion",33, "0741957931", true,
                "Manager", 7, 5450.0);
        angajat1.infoAngajat();
        angajat1.calculBonuriMasa(20);
        //angajat1.venituriTotale();
    }

//    public Double venituriTotale()
//    {
//        Double venituriTotaleSalariu = getSalariu() + calculBonuriMasa(zileLucrate);
//        System.out.println("Venituri totale de:" + venituriTotaleSalariu + "lei");
//        return venituriTotaleSalariu;
//    }
}
