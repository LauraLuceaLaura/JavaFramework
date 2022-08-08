package Quiz;

public class TarabaLegume extends  Legume implements LegumeInterface{

    public TarabaLegume(String nume, Integer bucati, Double cantitate) {
        super(nume, bucati, cantitate);
    }

    public TarabaLegume(String nume, Integer bucati) {
        super(nume, bucati);
    }

    public TarabaLegume(String nume, Double cantitate) {
        super(nume, cantitate);
    }

    @Override
    public void vandLeguma(Double cantitate, Double pret) {
        switch (getNume())
        {
            case "ceapa rosie":
            case "cartofi":
            case "rosii":
        }
    }

    @Override
    public void vandLegaturaLeguma(Integer bucati, Double pret) {
        switch (getNume())
        {
            case "ceapa verde":
                System.out.println("Ceapa verde costa " + pret + " lei/buc" + " ,va va costa " );
                break;
            case "patrunjel":
            case "marar":

        }
    }

    @Override
    public void punPeTaraba() {

    }
}
