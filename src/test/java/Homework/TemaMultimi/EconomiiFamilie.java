package Homework.TemaMultimi;

import org.junit.Test;

import java.util.*;

public class EconomiiFamilie {

    public List<Integer> economiiCurente;
    public String key;

    public void getEconomiileFamiliei()
    {
        HashMap<String , List<Integer>> economiiFam = new HashMap<>();
        List<Integer> economiiVechiMama = new ArrayList<>();
        economiiVechiMama.add(150);
        economiiVechiMama.add(200);
        economiiVechiMama.add(250);

        List<Integer> economiiVechiTata = new ArrayList<>();
        economiiVechiTata.add(300);
        economiiVechiTata.add(100);
        economiiVechiTata.add(150);

        List<Integer> economiiVechiCopil = new ArrayList<>();
        economiiVechiCopil.add(15);
        economiiVechiCopil.add(20);
        economiiVechiCopil.add(10);

        List<Integer> economiiVechiBunica = new ArrayList<>();
        economiiVechiBunica.add(400);
        economiiVechiBunica.add(200);
        economiiVechiBunica.add(100);

        economiiFam.put("Mama" , economiiVechiMama);
        economiiFam.put("Tata" , economiiVechiTata);
        economiiFam.put("Copilul" , economiiVechiCopil);
        economiiFam.put("Bunica" , economiiVechiBunica);



        for(String key:economiiFam.keySet())
        {
            System.out.println(key + " a economisit:");
            List<Integer> economiiCurente = economiiFam.get(key);
            List<Integer> curente = getEconomiiNoi(key , economiiCurente);
            System.out.println(economiiCurente );
            System.out.println(curente);

            calculEconomii(curente);
        }
    }

    public List<Integer> getEconomiiNoi(String key, List<Integer> economiiCurente)
    {
        if(key.equals("Copilul"))
        {
            economiiCurente.add(20);
            List<Integer> economiiCopil = economiiCurente;
            return economiiCopil;
        }
        else
        {
            economiiCurente.add(100);
            List<Integer> economiiAdult = economiiCurente;
            return economiiAdult;
        }
    }

    public void calculEconomii(List<Integer> economiiTotale)
    {
        Integer total=0;
        for(int i=0; i<economiiTotale.size();i++)
        {
            total += economiiTotale.get(i);
        }
        System.out.println("Totalul economiilor este : " + total + " lei");
    }

    @Test
    public void economiiFamilie()
    {
        getEconomiileFamiliei();
    }

}
