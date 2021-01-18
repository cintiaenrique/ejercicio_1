package puerto;
public class Alquiler {
    
    // Atributos
    public String nombre;
    public int dni;
    public int fechaInicio;
    public int fechaFinal;
    public int posicionAmarre;
    public Barco barco;
       
    // Métodos
    public Alquiler(String nombre, int dni, int fechaInicio, int fechaFinal, int posicionAmarre, Barco barco) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }
       
    public int calcularAlquiler() {
        int nDias = (fechaFinal - fechaInicio)+1;
        return nDias*2*barco.calcularModulo();
    }
}
