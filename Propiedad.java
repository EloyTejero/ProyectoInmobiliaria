package ProyectoInmobiliaria;

public abstract class Propiedad {

    String direccion;
    Double precio;
    Double metros_cuadrados;
    String cod_postal;
    int id;
    int cant_ambientes;
    Double precio_metrocuadrado=1000.0;
    String tipo;

    public Propiedad(String direccion, Double metros_cuadrados, String cod_postal, int id, int cant_ambientes, String tipo) {
        this.direccion = direccion;
        this.metros_cuadrados = metros_cuadrados;
        this.cod_postal = cod_postal;
        this.id = id;
        this.cant_ambientes = cant_ambientes;
        this.tipo= tipo;
    }

    public String getDireccion() {
        return direccion;
    }

    public Double getPrecio() {
        return precio;
    }

    public Double getMetros_cuadrados() {
        return metros_cuadrados;
    }

    public String getCod_postal() {
        return cod_postal;
    }

    public int getId() {
        return id;
    }

    public int getCant_ambientes() {
        return cant_ambientes;
    }

    public Double getPrecio_metrocuadrado() {
        return precio_metrocuadrado;
    }

    

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setMetros_cuadrados(Double metros_cuadrados) {
        this.metros_cuadrados = metros_cuadrados;
    }

    public void setCod_postal(String cod_postal) {
        this.cod_postal = cod_postal;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCant_ambientes(int cant_ambientes) {
        this.cant_ambientes = cant_ambientes;
    }

    public void setPrecio_metrocuadrado(Double precio_metrocuadrado) {
        this.precio_metrocuadrado = precio_metrocuadrado;
    }

   
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    

    public String getTipo() {
        return tipo;
    }

    public abstract void MostrarDatos();

    public abstract void CalcularPrecio();

}
