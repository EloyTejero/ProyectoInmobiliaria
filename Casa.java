/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoinmobiliaria;

/**
 *
 * @author ET36
 */
public class Casa extends Propiedad {

    boolean Terraza;
    boolean balcon;
    boolean pileta;

    public Casa(boolean Terraza, boolean balcon, boolean pileta, String direccion, Double metros_cuadrados, String cod_postal, int id, int cant_ambientes, String tipo) {
        super(direccion, metros_cuadrados, cod_postal, id, cant_ambientes, tipo);
        this.Terraza = Terraza;
        this.balcon = balcon;
        this.pileta = pileta;
    }

    @Override
    public void MostrarDatos() {
        if (Terraza == true) {
            System.out.println("La casa tiene terraza");
        }
        if (pileta == true) {
            System.out.println("La casa tiene pileta");

        }

        if (balcon == true) {
            System.out.println("La casa tiene balcon");
        }

    }

    @Override
    public void CalcularPrecio() {

        precio = (metros_cuadrados * precio_metrocuadrado) * (1 + cant_ambientes / 10);
        if (Terraza) {
            precio = precio * 1.22;
        }
        if (pileta) {
            precio = precio * 1.55;
        }

        if (balcon) {
            precio = precio * 1.5;
        }

    }

}
