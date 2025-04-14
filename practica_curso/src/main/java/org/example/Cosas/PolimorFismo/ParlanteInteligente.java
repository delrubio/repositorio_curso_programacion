package org.example.Cosas.PolimorFismo;

public class ParlanteInteligente extends Dispositivo{
    public ParlanteInteligente(String nombre) {
        super(nombre);
    }

    @Override
    public void encender() {
        super.encender();
        if (super.mostrarEstado()){
            System.out.println("Ya está encendido");
        }else {
            System.out.println("Activando parlante con comando de voz...");
        }
    }
}
