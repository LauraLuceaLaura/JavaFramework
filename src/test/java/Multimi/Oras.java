package Multimi;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Oras {

    //array
    public void printNumeArray()
    {
        String[] nume = new String[4];
        nume[0] = "Victor";
        nume[1] ="Laura";
        nume[2] = "Alex";
        nume[3] = "Diana";
        nume[4] = "Andreea";

        for(int i=0; i<nume.length; i++)
        {
            System.out.println(nume[i]);
        }
    }

    @Test
    public void Test()
    {
       // printNumeArray();
       // printNumeList();
        // printCuvinte();
        printTariOrase();
    }

    public void printNumeList()
    {
        List<String> nume = new ArrayList<>();
        nume.add("Victor");
        nume.add("Laura");
        nume.add("Alex");
        nume.add("Diana");
        nume.add("Andreea");

        Integer numarElemente = nume.size();
        System.out.println(numarElemente);
        nume.remove(nume.size()-1);
        nume.remove(0);

        for(int i=0; i<nume.size();i++)
        {
            System.out.println(nume.get(i));
        }

    }

    public void printCuvinte()
    {
        //key = value
        HashMap<String , String> cuvinte = new HashMap<>();
        cuvinte.put("Haina","Pantaloni");
        cuvinte.put("Fruct" , "Mar");
        cuvinte.put("Mancare" , "Supa");
        for(String key:cuvinte.keySet())
        {
            System.out.println("Cheia curenta este: " + key);
            System.out.println("Valoarea pe baza cheii este: " + cuvinte.get(key));
        }
    }

    public void printTariOrase()
    {
        HashMap<String , List<String>> TariOrase = new HashMap<>();
        List<String> oraseRomania = new ArrayList<>();
        oraseRomania.add("Bucuresti");
        oraseRomania.add("Brasov");
        oraseRomania.add("Cluj");
        oraseRomania.add("Bacau");

        List<String> oraseItalia = new ArrayList<>();
        oraseItalia.add("Roma");
        oraseItalia.add("Bologna");
        oraseItalia.add("Napoli");

        List<String> oraseSpania = new ArrayList<>();
        oraseSpania.add("Barcelona");
        oraseSpania.add("Madrid");
        oraseSpania.add("Sevilia");

        TariOrase.put("Romania", oraseRomania);
        TariOrase.put("Italia", oraseItalia);
        TariOrase.put("Spania" , oraseSpania);

        for(String key:TariOrase.keySet())
        {
            System.out.println("Tara este " + key);
            List<String> oraseCurente = TariOrase.get(key);
            for(int i=0; i<oraseCurente.size(); i++)
            {
                System.out.println(oraseCurente.get(i));
            }
        }
    }

}
