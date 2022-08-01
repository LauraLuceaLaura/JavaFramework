package OOP_Mostenire;

public class Masina {

    //in Java putem sa mostenim numa o singura clasa

    private String marca;
    private String model;
    private Integer numarRoti;
    private String transmisie;
    private String motor;

    public Masina(String marca, String model, Integer numarRoti, String transmisie, String motor) {
        this.marca = marca;
        this.model = model;
        this.numarRoti = numarRoti;
        this.transmisie = transmisie;
        this.motor = motor;
    }

    public void infoMasina()
    {
        System.out.println("Marca este " + marca);
        System.out.println("Modelul este " + model);
        System.out.println("Numarul rotilor este " + numarRoti);
        System.out.println("Transmisia este de tip " + transmisie);
        System.out.println("Motorul are capacitatea cilindrica " + motor);
    }

    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public Integer getNumarRoti() {
        return numarRoti;
    }

    public String getTransmisie() {
        return transmisie;
    }

    public String getMotor() {
        return motor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setTransmisie(String transmisie) {
        this.transmisie = transmisie;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }
}
