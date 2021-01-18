package puerto;
public class Yate extends Barco{
    
    // Atributos
    public int camarotes;
    public int potencia;
    
    // Constructor
    public Yate (int matricula, int metrosEslora, int anioFabricacion, int camarotes, int potencia) {
        super(matricula, metrosEslora, anioFabricacion);
        this.camarotes = camarotes;
        this.potencia = potencia;  
        }

    @Override
    int calcularModulo() {
        return (metrosEslora*10)+(potencia + camarotes);
    }
}
