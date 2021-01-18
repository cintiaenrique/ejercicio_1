package puerto;
public class Velero extends Barco{
    
    // Atributos
    public int mastiles;
    
    // Constructor
    public Velero (int matricula, int metrosEslora, int anioFabricacion, int mastiles) {
        super(matricula, metrosEslora, anioFabricacion);
        this.mastiles = mastiles;        
        }

    @Override
    int calcularModulo() {
        return (metrosEslora*10)+mastiles;
    }
}
