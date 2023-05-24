/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoinmobiliaria;

import java.util.ArrayList;

/**
 *
 * @author ET36
 */
public class Inmobiliaria {
    ArrayList<Propiedad> prop = new ArrayList<>;

    public Inmobiliaria(ArrayList<Propiedad> al) {
        this.prop = al;
    }
    
    public void agregarPropiedad(pro){
        prop.add(pro);
    }
    
    public Propiedad obtenerPropiedadID(int id){
       for(ArrayList<Propiedad> p: prop){
            if (p.getId() == id){
                System.out.println("La propiedad que estas buscando es: " + p.toString());
            }
        }  
    }

}