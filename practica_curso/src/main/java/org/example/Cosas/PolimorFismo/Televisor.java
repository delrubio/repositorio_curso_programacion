package org.example.Cosas.PolimorFismo;

public class Televisor extends Dispositivo implements ControlRemoto{

    public Televisor(String nombre) {
        super(nombre);
    }

    @Override
    public void encender() {
        super.encender();
        if (super.mostrarEstado()){
            System.out.println("Ya está encendido");
        }else {
            System.out.println("Encendiendo televisor...");
        }
    }

    @Override
    public void sincronizar() {
        System.out.println("Sincronizando televisor con control remoto...");
    }
}
