import java.util.Calendar;

public class Kalender {


    private Sweeties[] tuer = new Sweeties[24];


    Kalender() {
        for (int i = 0; i < tuer.length; i++) {
            tuer[i] = Sweeties.randomSweet();
        }


    }

    public String openDoor(int day) {
        if (day < 1 || day > 24) {
            return "Ungueltige Eingabe ";

        } else {
            if (day <= (new java.util.GregorianCalendar()).get(Calendar.DAY_OF_MONTH)) {
                if (tuer[day - 1].name().equals("SchokoNikolaus")) {
                    MyAudio.play("jingle-bells.wav");
                }


                return tuer[day - 1].name();
            } else {
                return "Heute ist noch nicht der " + day + " Dezember";
            }
        }


    }
}




