package RGMCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void alarmTestUnter30(){
        int num1 = 29;
        String actual = Main.checkAnzahl(num1);
        assertEquals("Maximale Personenzahl nicht überschritten", actual);
        //System.out.println("Die Anzahl der Personen ist: " + num1);
    }

    @Test
    void alarmTestUeber30(){
        int num1 = 30;
        String actual = Main.checkAnzahl(num1);
        assertEquals("Zu viele Personen", actual);
        //System.out.println("Die Anzahl der Personen ist: " + num1);
    }

}