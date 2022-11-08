package Hilo;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

public class Hilo extends Thread {

    int tiempo;

    public Hilo(String nombre, int tiempo) {
        super(nombre);
        this.tiempo = tiempo;
    }

    @Override
    public void run() {
        System.out.println("Inicio " + this.getName());
        for (int i = 0; i < 10; i++) {
            try {
                sleep(this.tiempo);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            System.out.println(java.time.LocalTime.now());

            
        }
        System.out.println("\nFinal " + this.getName());
    }

}
