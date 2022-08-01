package ObiectConstructor;

import org.junit.Test;

import java.util.HashMap;

public class TelefonTest {

    @Test
    public void test()
    {
        //declaram un obiect;
//        Telefon S22 = new Telefon("Samsung" , "S22" , "7 inch" , "negru", 2022, true);
//        S22.infoTelefon();
//        S22.editieTelefon();
//
//        Telefon iphone = new Telefon("Apple", "13 Max", "9 inch", "argintiu", 2019,true);
//        iphone.infoTelefon();
//        iphone.editieTelefon();
//
//        Telefon nokia = new Telefon("Nokia" , "vechi" , "1 inch", "albastru" , 2000 );
//        nokia.infoTelefon();

        Telefon xiaomi = new Telefon("Xiaomi", "2" , " 8 inch" , "auriu" ,  2015 , true , 200.99);
        xiaomi.infoTelefon();
        HashMap<String , Double> accesoriiXiaomi = new HashMap<>();
        accesoriiXiaomi.put("Husa" , 115.87);
        accesoriiXiaomi.put("Casti" , 70.50);
        accesoriiXiaomi.put("Folie" , 60.0);
        accesoriiXiaomi.put("Incarcator" , 99.99);
        xiaomi.pretCuAccesorii(accesoriiXiaomi);

    }
}
