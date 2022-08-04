package Homework.TemaAbstractizare;

public class Animal {

    private String specie;
    private String rasa;
    private Integer nrPicioare;

    public Animal(String specie, String rasa, Integer nrPicioare) {
        this.specie = specie;
        this.rasa = rasa;
        this.nrPicioare = nrPicioare;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public Integer getNrPicioare() {
        return nrPicioare;
    }

    public void setNrPicioare(Integer nrPicioare) {
        this.nrPicioare = nrPicioare;
    }
}
