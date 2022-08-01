package Homework.TemaStructuriAlternative;

import org.junit.Test;
import org.openqa.selenium.json.JsonOutput;

public class ReduceriTelefoane {

    public Double pretInitial = Double.valueOf(1);

    public Double getScumpireNokia(Double pertInitial)
    {
        Double pretScumpire = pretInitial + (pretInitial * 2)/100;
        return pretScumpire;
    }

    public Double getReducereTelefoane(Double pretInitial, Double procentReducere)
    {
        Double pretRedus = pretInitial - (pretInitial * procentReducere)/100;
        return pretRedus;
    }

    public void faraReducere()
    {
        System.out.println("Acest telefon nu este la reducere.");
    }

    public void afisarePreturiNoi(String brandTelefon)
    {
        switch(brandTelefon)
        {
            case "Samsung":
                System.out.println("Noul pret este: " + getReducereTelefoane(3500.99,15.0) + " S10+");
                System.out.println("Noul pret este: " + getReducereTelefoane(4780.99,15.0) + " Note22");
                System.out.println("Noul pret este: " + getReducereTelefoane(6850.99,15.0) + " S22Fe");
                break;
            case "Huawei":
                System.out.println("Noul pret este: " + getReducereTelefoane(1299.99,30.0) + " Nova 9");
                System.out.println("Noul pret este: " + getReducereTelefoane(999.00,30.0) + " Nova i8");
                System.out.println("Noul pret este: " + getReducereTelefoane(3500.99, 30.0) + " P50 Pro");
                System.out.println("Noul pret este: " + getReducereTelefoane(9999.99, 30.0) + " Mate XS");
                System.out.println("Noul pret este: " + getReducereTelefoane(2567.80, 30.0) + " P30");
                break;
            case "Apple":
                System.out.println("Noul pret este: " + getReducereTelefoane(7599.99,5.0) + " Ultra Max Pro 13" );
                break;
            case "Nokia":
                System.out.println("Noul pret este: " + getScumpireNokia(772.62) + " G21");
                System.out.println("Noul pret este: " + getScumpireNokia(1249.99) + " X20");
                break;
            default: faraReducere();
        }
    }

    @Test
    public void afisareTelefoane()
    {
        afisarePreturiNoi("Samsung");
        afisarePreturiNoi("Huawei");
        afisarePreturiNoi("Apple");
        afisarePreturiNoi("Nokia");
        afisarePreturiNoi("Xiaomi");
    }

}
