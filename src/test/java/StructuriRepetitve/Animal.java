package StructuriRepetitve;

public class Animal {

    //structuri repetitive : for, while, for each

    //afisam primele n nr
    public void afisare( Integer n)
    {
        for(int i=0;i<n;i++)
        {
            if(i%5==0)
            {
                break;
            }
            System.out.println(i + " ");
        }
    }

    public void afisareWhile(Integer n)
    {
        int i = 0;
        while(i<n)
        {
            System.out.println(i + " ");
            i++;
        }
    }

}
