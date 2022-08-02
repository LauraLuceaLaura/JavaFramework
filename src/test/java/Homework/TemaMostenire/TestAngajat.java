package Homework.TemaMostenire;

import org.junit.Test;

public class TestAngajat {

    @Test
    public void testPersoane()
    {
        Angajat angajat1 = new Angajat("3890216070014", "Popescu", "Ion",33, "0741957931", true,
                "Manager", 7, 5450.0 , 20);
        angajat1.infoAngajat();
        angajat1.venituriTotale();
    }
}
