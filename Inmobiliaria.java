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
    private ArrayList<Propiedad> prop;
    

    public Inmobiliaria() {
        prop = new ArrayList<>();
    }
    
    public void agregarPropiedad(Propiedad pro){
        prop.add(pro);
    }
    
    public void obtenerPropiedadID(int id){
        for(Propiedad p: prop){
            if (p.getId() == id){
                System.out.println("La propiedad que estas buscando es: " + p.toString());
            }
        }
    }

}