/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stream;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Stream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Factura f=new Factura("Ticketera",80);
        Factura f2=new Factura("Celular",1000);
        Factura f3=new Factura("Impresora",200);
        Factura f4=new Factura("Computadora",400);
        List<Factura> facturas=new ArrayList<Factura>();
        facturas.add(f);
        facturas.add(f2);
        facturas.add(f3);
        facturas.add(f4);
        Predicate<Factura> predicado=new Predicate<Factura>(){
            @Override
            public boolean test(Factura f){
                System.out.println("Iteracion");
                return f.getImporte()>300;
            }
        };
        Factura facturaFiltro=facturas.stream().filter(predicado).findFirst().get();
        System.out.println("Unica: "+facturaFiltro.getImporte());
    }
}
