package ValueReference;

import org.junit.Test;

public class Laptop {

    public Integer numar;
    public int numar2 = 7;
    public String nume = "Laura";

    @Test
    public void test()
    {
        numar = 5 ;
        adunare(numar);
        System.out.println(numar);
        numar.byteValue();

        adunare(numar2);
        System.out.println(numar2);

        System.out.println(nume);
        nume = "Victor";
        System.out.println(nume);
        String proiect = "tema";
        StringBuffer proiect2 = new StringBuffer("alta tema");
    }

    public void adunare(Integer x)
    {
        x += 1;
        System.out.println(x);
    }

}
