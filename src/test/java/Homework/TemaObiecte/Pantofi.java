package Homework.TemaObiecte;

import com.beust.jcommander.IDefaultProvider;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Pantofi {

    public String pentruCine;
    public Float marime;
    public String culoare;
    public Double pret;
    public String tipPantof;
    public Boolean imprimeu;
    public String material;
    public List<Double> preturi;

    public Pantofi(String pentruCine, Float marime, String culoare, Double pret, String tipPantof, Boolean imprimeu, String material)
    {
        this.pentruCine = pentruCine;
        this.marime = marime;
        this.culoare = culoare;
        this.pret = pret;
        this.tipPantof = tipPantof;
        this.imprimeu = imprimeu;
        this.material = material;
        initializarePreturi();
    }

    public void afisareInfo()
    {
        System.out.println("Pantofi de " + pentruCine + " .");
        System.out.println("Marimea aleasa este " + marime + " .");
        if( pentruCine.equals("dama") && marime>41.0 && marime<35.5)
        {
            System.out.println("Marimea selectata nu exista.");
        }
        if(pentruCine.equals("barbat") && marime<40.0)
        {
            System.out.println("Marimea selectata nu exista.");
        }
        if( pentruCine.equals("fata") || pentruCine.equals("baiat") && marime>35.0 && marime<29.0)
        {
            System.out.println("Marimea selectata nu exista.");
        }
        System.out.println("Culoarea aleasa este " + culoare + " .");
        System.out.println("Pretul este de " + pret + " lei.");
        System.out.println("Pantofii sunt " + tipPantof + " .");
        System.out.println("Au imprimeu? " + imprimeu);
        System.out.println("Materialul pantofilor este din " + material + " .");
    }

    public void aflaImprimeul( String tipImprimeu)
    {
        if (imprimeu == true)
        {
            switch (tipImprimeu) {
                case "floral":
                    System.out.println("Imprimeul este floral.");
                    System.out.println(" ");
                    break;
                case "animal print":
                    System.out.println("Imprimeul este animal print.");
                    System.out.println(" ");
                    break;
                case "buline":
                    System.out.println("Imrpimeul are buline.");
                    System.out.println(" ");
                    break;
                case "sarpe":
                    System.out.println("Imprimeu sarpe.");
                    System.out.println(" ");
                    break;
                case "dungi":
                    System.out.println("Imprimeul are dungi.");
                    System.out.println(" ");
                    break;
            }
        }
        else
        {
            System.out.println("Acesti pantofi nu au imprimeu.");
            System.out.println(" ");
        }
    }

    public void pretTotal()
    {
        Double pretTotalPAntofiCumparati = calculPantofi(preturi);
        pretTotalPAntofiCumparati += pret;
        System.out.println("Total " + pretTotalPAntofiCumparati);
    }

    public void initializarePreturi()
    {
        preturi = new ArrayList<>();
        preturi.add(35.0);
        preturi.add(66.1);
    }

    public Double calculPantofi( List < Double > pantofi)
    {
        Double rezultat = 0.0;
        for ( Double pantof : pantofi)
        {
            rezultat += pantof;
        }
        return rezultat;
    }

}