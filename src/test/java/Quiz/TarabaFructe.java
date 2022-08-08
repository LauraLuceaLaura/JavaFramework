package Quiz;


import org.junit.Test;

public class TarabaFructe extends Fructe implements FructeInterface{

    public TarabaFructe(String nume, Integer bucati, Double cantitate) {
        super(nume, bucati, cantitate);
    }

    public TarabaFructe(String nume, Integer bucati) {
        super(nume, bucati);
    }

    public TarabaFructe(String nume, Double cantitate) {
        super(nume, cantitate);
    }

    @Override
    public void vandFruct(Double cantitate , Double pret) {
        switch (getNume())
        {
            case "mere":
                System.out.println("Merele se vand cu " + pret + " lei/kg" + " ," + "va costa " + cantitate*pret);
                break;
            case "struguri":
                System.out.println("Strugurii se vand cu " + pret + " lei/kg" + " ," + "va costa " + cantitate*pret);
                break;
            case "prune":
                System.out.println("Prunele se vand cu " + pret + " lei/kg" + " ," + "va costa " + cantitate*pret);
                break;
            default:
                System.out.println("Nu avem acest fruct.");
        }

    }

    @Override
    public void vandFruct(Integer bucati, Double pret) {
        switch (getNume())
        {
            case "mango":
                System.out.println("Mango se vinde cu " + pret + " lei/buc" + " ," + " va costa " + bucati*pret);
                break;
            case "nuca cocos":
                System.out.println("Nuca de cocos se vinde cu " + pret + " lei/buc" + " ," + " va costa " + bucati*pret);
                break;
            case "smochine":
                System.out.println("Smochinele se vand cu " + pret + " lei/buc" + " ," + " va costa " + bucati*pret);
                break;
            default:
                System.out.println("Nu avem acest fruct.");
        }
    }

    @Override
    public void vandPungaFructe() {
        System.out.println("O punga costa 50 bani.");
    }

    @Override
    public void pregatescFructe() {

    }

}
