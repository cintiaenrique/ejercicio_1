package puerto;
public class Calculos extends Barco{
    
    // Atributos
    public int moduloEspecial = 0;
    public int alquiler = 0;
    public int nDias = 0;
    public int listaAlquileres[];
    
    // Métodos   
    public int calcularAlquiler (int fechaInicio, int fechaFinal, int metrosEslora, int mastiles, int potencia, int camarotes, String tipoBarco)      {
       nDias= (fechaFinal-fechaInicio)+1;
       switch(tipoBarco.toLowerCase()) {
           case "velero":
               moduloEspecial = (metrosEslora*10)+mastiles;
               alquiler = nDias*2*moduloEspecial;
               break;
           case "deportivo":
               moduloEspecial = (metrosEslora*10)+potencia;
               alquiler = nDias*2*moduloEspecial;
               break;
           case "yate":
               moduloEspecial = (metrosEslora*10)+(potencia + camarotes);
               alquiler = nDias*2*moduloEspecial;
               break;
       }
       return alquiler;
    }
    
    
    public int mayorAlquiler() {}
    
    public int menorAlquiler() {}
    
    public int promedioAnual() {}
    
    public int promedioMensual() {}
}
