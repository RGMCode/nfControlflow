package RGMCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void alarmTestUnter30(){
        int num1 = 29;
        String actual = Main.checkAnzahlSimple(num1);
        assertEquals("Maximale Personenzahl nicht überschritten", actual);
        //System.out.println("Die Anzahl der Personen ist: " + num1);
    }

    @Test
    void alarmTestUeber30(){
        int num1 = 30;
        String actual = Main.checkAnzahlSimple(num1);
        assertEquals("Zu viele Personen", actual);
        //System.out.println("Die Anzahl der Personen ist: " + num1);
    }

    /* ********************************************** */

    @Test
    void alarmTestRot() {
        int num1 = 0;
        String alarmstufe = "rot";
        String actual = Main.checkAnzahl(num1, alarmstufe);
        assertEquals("Keine Personen erlaubt", actual);
    }

    @Test
    void alarmTestGelbUnter30() {
        int num1 = 29;
        String alarmstufe = "gelb";
        String actual = Main.checkAnzahl(num1, alarmstufe);
        assertEquals("Alarmstufe grün Maximale Personenzahl nicht überschritten", actual);
    }

    @Test
    void alarmTestGelbUeber30() {
        int num1 = 30;
        String alarmstufe = "gelb";
        String actual = Main.checkAnzahl(num1, alarmstufe);
        assertEquals("Alarmstufe grün Maximale Personenzahl nicht überschritten", actual);
    }

    @Test
    void alarmTestGruenUnter60() {
        int num1 = 59;
        String alarmstufe = "grün";
        String actual = Main.checkAnzahl(num1, alarmstufe);
        assertEquals("Alarmstufe gelb Maximale Personenzahl nicht überschritten", actual);
    }

    @Test
    void alarmTestGruenUeber60() {
        int num1 = 61;
        String alarmstufe = "rot";
        String actual = Main.checkAnzahl(num1, alarmstufe);
        assertEquals("Keine Personen erlaubt", actual);
    }


}

