/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoInmobiliaria;


public class Ph extense Propiedad{
    int dpt;
    boolean vistaFront;

    public Ph(int dpt, boolean vistaFront){
        super(dir, precio, mts2, ID, codPostal, tipo, cant_amb);
        this.dpt = dpt;
        this.vistaFront = vistaFront;
    }
    
    public void calcularPrecio(){
        if (vistaFront==true){
            precio=precio*1.2;
        }
    }    
}
