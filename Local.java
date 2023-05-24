
package proyectoinmobiliaria1;

public class Local extends Propiedad  {
    String rubro;
    int cantAcceso;
    boolean fondoComercio;

    public Local(String rubro, int cantAcceso, boolean fondoComercio) {
        super(String dir,int cantAmb,Double mts2,String codPostal,int id);
        this.rubro = rubro;
        this.cantAcceso = cantAcceso;
        this.fondoComercio = fondoComercio;
    }
   @override
    public void calcularPrecio(){
        precio=(mts2*1000)*(1+cantAmb/10);
        if (cantAcceso>=2){
            precio=precio*1,3;
        }
        if (fondoComercio==true){
            precio=precio*1,6;
        }
    }

    public String getRubro() {
        return rubro;
    }

    public int getCantAcceso() {
        return cantAcceso;
    }

    public boolean isFondoComercio() {
        return fondoComercio;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public void setCantAcceso(int cantAcceso) {
        this.cantAcceso = cantAcceso;
    }

    public void setFondoComercio(boolean fondoComercio) {
        this.fondoComercio = fondoComercio;
    }
    
}