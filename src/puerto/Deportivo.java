package puerto;
public class Deportivo extends Barco {
    
    // Atributos
    public int potencia;
    
    // Constructor
    public Deportivo (int matricula, int metrosEslora, int anioFabricacion, int potencia) {
        super(matricula, metrosEslora, anioFabricacion);
        this.potencia = potencia;        
        }

    @Override
    int calcularModulo() {
        return (metrosEslora*10)+potencia;
    }
    
    
}
