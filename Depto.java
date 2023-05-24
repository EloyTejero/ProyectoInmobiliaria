
package ProyectoInmobiliaria;

public class depto extends Propiedad{
    private String piso;
    private String departamento;
    private double expensas;
    
    public depto(String piso, String departamento, double expensas, String direccion, double precio, double mts2, String codPostal, int id, int canAmb){
        super(direccion, mts2, codPostal, id, canAmb);
        this.piso = piso;
        this.departamento = departamento;
        this.expensas = expensas;
    }
    
    public void calcularPrecio(){
        double precio;
        precio = ((mts2*Precio)*(1+(canAmb/10)))+expensas;
    }

    public String getPiso() {
        return piso;
    }

    public String getDepartamento() {
        return departamento;
    }

    public double getExpensas() {
        return expensas;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setExpensas(double expensas) {
        this.expensas = expensas;
    }
    
    
}
