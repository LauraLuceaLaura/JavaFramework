package OOP_Abstractizare;

public interface InterfaceAngajat {

    //recunoastem o interfata dupa interface
    //toate metodele dintr-o interfata sunt abstracte
    //toate variabilele dintr-o interfata sunt abstracte
    //intr-o interfata nu putem sa avem un construcotr => nu putem face un obiect
    //interfata se implementeaza
    //clasa care implementeaza interfata trebuie sa implementeze toate metodele interfetei
    //o clasa poate sa implementeze n interfete
    //o interfata poate sa mosteneasca o alta interfata
    //o clasa abstracta poate sa implementeze o interfata

    void munceste();
    void primesteSalariu();

}
