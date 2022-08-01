package ObiectConstructor;

import java.util.HashMap;

public class Telefon {

    //obiect = instanta unei clase
    //constructor = are ca rol sa initializeze atributele unei variabile
    //constructorul tot timpul este public ( private - se aplica conceptul de singletone )
    //constructorul tot timpul are numele la fel ca si clasa
    //constructorul e de 2 feluri : cu parametrii si fara parametrii
    //daca nu am facut noi un constructor => unul by default fara parametrii
    //dintr-o clasa putem face mai multe obiecte care se vor diferentia prin numele lor
    //in momentul in care se initializeaza un obiect => se apeleaza constructorul clasei
    //recunoastem un obiect dupa cuvantul "new"

    public String marca;
    public String model;
    public String diagonala;
    public String culoare;
    public Integer anFabricatie;
    public Boolean areCamera;
    public Double pret;

    public Telefon(String marca, String model, String diagonala, String culoare, Integer anFabricatie, Boolean areCamera) {
        this.marca = marca;
        this.model = model;
        this.diagonala = diagonala;
        this.culoare = culoare;
        this.anFabricatie = anFabricatie;
        this.areCamera = areCamera;
    }

    public Telefon(String marca, String model, String diagonala, String culoare, Integer anFabricatie) {
        this.marca = marca;
        this.model = model;
        this.diagonala = diagonala;
        this.culoare = culoare;
        this.anFabricatie = anFabricatie;
    }

    public Telefon(String marca, String model, String diagonala, String culoare, Integer anFabricatie, Boolean areCamera, Double pret) {
        this.marca = marca;
        this.model = model;
        this.diagonala = diagonala;
        this.culoare = culoare;
        this.anFabricatie = anFabricatie;
        this.areCamera = areCamera;
        this.pret = pret;
    }

    public void infoTelefon()
    {
        System.out.println("Marca este: " + marca);
        System.out.println("Modelul este: " + model);
        System.out.println("Are diagonala de: " + diagonala);
        System.out.println("Anul fabricatiei este: " + anFabricatie);
        System.out.println("Culoarea este: " + culoare);
        if(areCamera != null)
        {System.out.println("Are camera? " + areCamera);}
        else {
            System.out.println("Nu exista.");
        }
        if(pret!=null)
        {
            System.out.println("Telefonul costa: " +pret+ " lei");
        }
        else
        {
            System.out.println("Telefon furat");
        }
    }

    public void editieTelefon()
    {
        if(anFabricatie >= 2020)
        {
            System.out.println("Telefonul este din generatia noua.");
        }
        if(anFabricatie<2020 && anFabricatie>=2015)
        {
            System.out.println("Telefonul este usor invechit.");
        }
        if(anFabricatie<2015)
        {
            System.out.println("Telefonul este vechi.");
        }
    }

    public void pretCuAccesorii(HashMap<String, Double> accesorii)
    {
        for(String key:accesorii.keySet())
        {
            pret = pret+ accesorii.get(key);
        }
        System.out.println("Pretul cu accesorii este: "+ pret + " lei");
    }

}
