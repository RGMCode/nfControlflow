package RGMCode;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static String checkAnzahl(int num1){
        if (num1 < 30){
            return "Maximale Personenzahl nicht überschritten";
        } else {
            return "Zu viele Personen";
        }
    }

}