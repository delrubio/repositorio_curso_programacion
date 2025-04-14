package org.example.Cosas.PolimorFismo;

public class AireAcondicionado extends Dispositivo implements ControlRemoto{
    public AireAcondicionado(String nombre) {
        super(nombre);
    }

    @Override
    public void encender() {
        super.encender();
        if (super.mostrarEstado()){
            System.out.println("Ya está encendido");
        }else {
            System.out.println("Encendiendo aire acondicionado...");
        }
    }

    @Override
    public void sincronizar() {
        System.out.println("Sincronizando aire acondicionado con control remoto...");
    }
}
