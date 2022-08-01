package Homework.TemaObiecte;

import Homework.TemaObiecte.Pantofi;
import org.junit.Test;

public class PantofiTest {

    @Test
    public void test()
    {
        Pantofi pantofiDama = new Pantofi("dama", 41.5f, "negru", 250.99, "sandale", true, "piele ecologica");
        pantofiDama.afisareInfo();
        pantofiDama.aflaImprimeul("dungi");
        pantofiDama.pretTotal();

//        Pantofi pantofiBarbat = new Pantofi("barbat", 43.0f, "albastru", 365.89, "sport", false, "textil");
//        pantofiBarbat.afisareInfo();
//        pantofiBarbat.aflaImprimeul("dungi");
//
//        Pantofi pantofiFata = new Pantofi("fata", 33.0f, "roz", 116.0, "balerini", true, "panza");
//        pantofiFata.afisareInfo();
//        pantofiFata.aflaImprimeul("floral");
//
//        Pantofi pantofiBaiat = new Pantofi("baiat", 34.5f, "verde deschis", 59.99, "adidasi", true, "bumbac");
//        pantofiBaiat.afisareInfo();
//        pantofiBaiat.aflaImprimeul("buline");
    }
}
