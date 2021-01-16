package puerto;
import java.util.ArrayList;

public class Puerto {   
    public static void main(String[] args) {
        
        // Instanciar objetos
       Calculos calculos = new Calculos();
       int alquiler1, alquiler2, alquiler3, alquiler4, alquiler5;
        
        // Llamar métodos para obtener los resultados
        
        // Ingresar fechaInicio,fechaFinal,metrosEslora,mastiles,potencia,camarotes,tipoBarco
       alquiler1 = calculos.calcularAlquiler(5, 12, 20, 2, 300, 0, "Deportivo");
       alquiler2 = calculos.calcularAlquiler(5, 16, 50, 4, 100, 3, "Yate");
       alquiler3 = calculos.calcularAlquiler(8, 20, 10, 1, 100, 0, "Velero");
       alquiler4 = calculos.calcularAlquiler(22, 24, 15, 3, 100, 4, "Yate");
       alquiler5 = calculos.calcularAlquiler(4, 10, 30, 2, 250, 0, "Deportivo");
       
       ArrayList listaAlquileres = new ArrayList();
       listaAlquileres.add(alquiler1);
       listaAlquileres.add(alquiler2);
       listaAlquileres.add(alquiler3);
       listaAlquileres.add(alquiler4);
       listaAlquileres.add(alquiler5);
       
    }
    
}
