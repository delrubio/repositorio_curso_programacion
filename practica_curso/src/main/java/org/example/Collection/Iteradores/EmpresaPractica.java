package org.example.Collection.Iteradores;

import java.util.ArrayList;
import java.util.Iterator;

public class EmpresaPractica {

    public static void main(String[] args) {

        ArrayList<Empresa> listaEmpresas = new ArrayList<>();
        listaEmpresas.add(new Empresa("DXC", 356));
        listaEmpresas.add(new Empresa("NTT", 670));
        listaEmpresas.add(new Empresa("Calconut", 197));
        listaEmpresas.add(new Empresa("Icaro Cloud", 10));

        Iterator<Empresa> itEmpresa = listaEmpresas.iterator();

        while (itEmpresa.hasNext()){
            Empresa empresa = itEmpresa.next();
            System.out.println(empresa);

            if (empresa.getEmpleados()>10){
                itEmpresa.remove();
            }
        }

        //EL ITERADOR ES UTIL PARA CUANDO QUEREMOS MANIPULAR UN FOREACH Y QUE NO SE VUELVA LOCO.

    }

}
