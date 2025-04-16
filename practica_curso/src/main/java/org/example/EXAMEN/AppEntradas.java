package org.example.EXAMEN;

import java.time.LocalDate;

public class AppEntradas {

    public static void main(String[] args) {

        TicketMutxa appTickets = new TicketMutxa();

        appTickets.generarUsuarios(4);
        appTickets.insertarEvento("Paellas", LocalDate.of(2025,4,16), 20, "festival");
        appTickets.iniciarSesion();
    }

}
