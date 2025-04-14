package org.example.Cosas.PolimorFismo;

import lombok.Data;

@Data
public abstract class Dispositivo {
    private String nombre;
    private boolean encendido;

    public Dispositivo(String nombre){
        this.nombre=nombre;
    }

    public void encender(){
        encendido=true;
    }

    public void apagar(){
        if (encendido){
            encendido=false;
            System.out.println("Dispositivo " + nombre + " apagado.");
        }else {
            System.out.println(nombre + " ya está apagado.");
        }
    }

    public boolean mostrarEstado(){
        System.out.println("El dispositivo " + nombre + " está " + encendido);
        return encendido;
    }
}
