package puerto;
public abstract class Barco {
    
    // Atributos
    public int matricula;
    public int metrosEslora;
    public int anioFabricacion;
    
    // Constructor
    public Barco (int matricula, int metrosEslora, int anioFabricacion) {}
    
    abstract int calcularModulo ();
}
