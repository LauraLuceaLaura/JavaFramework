package OOP_Mostenire;

import javax.swing.*;
import java.util.HashMap;
import java.util.List;

public class Audi extends Masina {

    //super apeleaza constructorul din clasa parintelui
    private Double pret;
    private List <String> dotariExterioare;
    private List<String> dotariInterioare;

    public Audi(String marca, String model, Integer numarRoti, String transmisie, String motor, Double pret,
                List<String> dotariExterioare, List<String> dotariInterioare)
    {
        super(marca, model, numarRoti, transmisie, motor);
        this.pret = pret;
        this.dotariExterioare = dotariExterioare;
        this.dotariInterioare = dotariInterioare;
    }


    public void folosireVolan()
    {
        System.out.println("Volanul lui Audi este super.");
        super.folosireVolan();
    }


    public void pretStandard()
    {
        System.out.println("Pretul standard al masinii " + getMarca() + " " + getModel() + " este " + pret + " euro.");
    }

    public void adaugareDotariExterioare()
    {
        for ( String dotare : dotariExterioare )
        {
            switch (dotare)
            {
                case "negru mat" :
                    pret = pret + 300;
                    break;
                case "jante 18" :
                    pret += 800;
                    break;
                case "capace jante" :
                    pret += 200;
                    break;
            }
        }
    }

    public void adaugareDotariInterioare()
    {
        for ( String dotare : dotariInterioare )
        {
            switch (dotare)
            {
                case "clima automata pe 4 zone" :
                    pret = pret + 500;
                    break;
                case "elemente cromate" :
                    pret += 200;
                    break;
                case "geamuri electrice" :
                    pret += 100;
                    break;
                case "navigatie" :
                    pret += 400;
                    break;
                case "oglinzi electrice si rabatabile" :
                    pret += 150;
                    break;
                case "camera spate" :
                    pret += 600;
                    break;
            }
        }
    }

    public void pretFinal()
    {
        System.out.println("Pretul final dupa dotari este de " + pret + " euro");
    }

    public void configuratieAudi()
    {
        infoMasina();
        System.out.println("Dotarile interioare sunt " + dotariInterioare);
        System.out.println("Dotarile exterioare sunt " + dotariExterioare);
        pretFinal();
    }

    public Double getPret() {
        return pret;
    }

    public List<String> getDotariExterioare() {
        return dotariExterioare;
    }

    public List<String> getDotariInterioare() {
        return dotariInterioare;
    }

    public void setDotariExterioare(List<String> dotariExterioare) {
        this.dotariExterioare = dotariExterioare;
    }

    public void setDotariInterioare(List<String> dotariInterioare) {
        this.dotariInterioare = dotariInterioare;
    }

    //polimorfism static
    public void numarPasageri(Integer numar)
    {
        System.out.println(numar);
    }

    public void numarPasageri(String numar)
    {
        System.out.println(numar);
    }

    public void numarPasageri(Integer numar, Integer numarAnimale)
    {
        System.out.println(numar);
    }

    public Integer proba()
    {

        return 1;
    }

    public Integer proba(Integer x)
    {

        return 2;
    }

}
