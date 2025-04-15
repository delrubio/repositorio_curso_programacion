package org.example.Collection.ExamenPizza;

public class AppTienda {

    public static void main(String[] args) {


       GestionInventario inventario = new GestionInventario() {
           @Override
           public void verificarStock() {
               System.out.println("Verificando stock...");
           }

           @Override
           public void reponerProducto() {

           }

           @Override
           public void liquidar() {

           }
       } ;

       inventario.verificarStock();
    }
}
