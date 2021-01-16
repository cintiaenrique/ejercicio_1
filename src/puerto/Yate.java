package puerto;
public class Yate extends Barco{
    
    // Atributos
    public int camarotes;
    public int potencia;
    
    // Constructor
    public Yate (int matricula, int metrosEslora, int anioFabricacion) {
        super(matricula, metrosEslora, anioFabricacion);
        this.camarotes = camarotes;
        this.potencia = potencia;  
        }
}
