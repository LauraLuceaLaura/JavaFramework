package OOP_ClaseAbstracte;

public abstract class PersoanaAbstracta {

    //recunoastem o clasa abstracta dupa cuvantul abstract ( pe care trebuie sa-l adaugam noi )
    //o clasa abstracta poate sau nu sa contina metode abstracte
    //intr-o clasa abstracta putem sa facem un constructor => nu putem sa facem un obiect
    //clasa abstracta se mostenste
    // clasa care mosteneste clasa abstracta trebuie sa implementeze toate metodele abstracte
    //o clasa poate sa mosteneasca o singura clasa abstracta
    //o clasa abstraca poate sa implementeze mai multe interfete

    abstract void munceste();
    abstract void primesteSalariu();
    abstract void bursa();
    abstract void practica();
    abstract void pierdeVremea();
    abstract void primesteAjutorSocial();
    public void metodaNormala()
    {
        System.out.println("clasa abstracta");
    }

    public String proba;


}
