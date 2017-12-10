import java.util.Random;

public enum Sweeties {


    Lebkuchen,
    Plaetzchen,
    Praline,
    SchokoNikolaus,
    Gummibaerchen,
    Spekulatius;


     public static Sweeties randomSweet() {
        int pick = new Random().nextInt(Sweeties.values().length);
        return Sweeties.values()[pick];
    }




}

