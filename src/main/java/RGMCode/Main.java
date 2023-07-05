package RGMCode;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static String checkAnzahlSimple(int num1){
        if (num1 < 30){
            return "Maximale Personenzahl nicht überschritten";
        } else {
            return "Zu viele Personen";
        }
    }



    public static String checkAnzahl(int num1, String alarmstufe){
        switch (alarmstufe.toLowerCase()) {
            case "rot":
                return "Keine Personen erlaubt";
            case "gelb":
                if (num1 <= 30) {
                    return "Alarmstufe grün Maximale Personenzahl nicht überschritten";
                } else {
                    return "Zu viele Personen";
                }
            case "grün":
                if (num1 <= 60) {
                    return "Alarmstufe gelb Maximale Personenzahl nicht überschritten";
                } else {
                    return "Zu viele Personen";
                }
            default:
                return "Ungültige Alarmstufe";
        }
    }



}