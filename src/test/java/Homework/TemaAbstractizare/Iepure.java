package Homework.TemaAbstractizare;

public class Iepure extends Animal implements IepureInterface{


    public Iepure(String specie, String rasa, Integer nrPicioare) {
        super(specie, rasa, nrPicioare);
    }

    @Override
    public void info() {
        System.out.println("Iepuriele face parte din specia " + getSpecie() + ", rasa " + getRasa() + " si are " + getNrPicioare() + " picioare.");
    }


    @Override
    public void sare()
    {
        System.out.println("Sare 30 cm intaltime.");
    }

    @Override
    public void alearga()
    {
        System.out.println("Alearga cu 40 km/h.");
    }

    @Override
    public void roade()
    {
        System.out.println("Mananca : fan, morcovi, porumb, varza, cartofi.");
    }
}
