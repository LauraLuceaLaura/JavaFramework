package OOP_Mostenire;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MostenireTest {

    @Test
    public void testMostenire()
    {
        List<String> audiDotariExterioare = new ArrayList<>();
        audiDotariExterioare.add("negru mat");
        audiDotariExterioare.add("jante 18");

        List<String> audiDotariInterioare = new ArrayList<>();
        audiDotariInterioare.add("clima automata pe 4 zone");
        audiDotariInterioare.add("elemente cromate");
        audiDotariInterioare.add("camera spate");

        Audi a5 = new Audi("Audi", "A5", 4, "automata", "2000 cm3",
                20000.0, audiDotariExterioare, audiDotariInterioare);
        a5.setModel("A4");
        a5.pretStandard();
        a5.adaugareDotariExterioare();
        a5.adaugareDotariInterioare();
        a5.configuratieAudi();
        a5.folosireVolan();
        a5.numarPasageri(5);
        a5.numarPasageri("4 pasageri");
        a5.numarPasageri(3, 2);
        a5.proba();
    }

}
