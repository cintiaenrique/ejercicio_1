package puerto;
import java.util.ArrayList;
public class Puerto {   
    public static void main(String[] args) {
        
       Calculos calculos = new Calculos();
       Deportivo deportivo = new Deportivo (123, 30, 2010, 40);
       Velero velero = new Velero (456, 20, 2009, 2);
       Yate yate = new Yate (879, 30, 2001, 4, 30);
              
       Alquiler alquiler1 = new Alquiler ("Carlos", 123, 5, 12, 3, deportivo);
       Alquiler alquiler2 = new Alquiler ("Belén", 234, 5, 16, 4, yate);
       Alquiler alquiler3 = new Alquiler ("Lorena", 567, 22, 24, 8, velero);
       
       ArrayList <Alquiler> listaAlq = new ArrayList ();
       listaAlq.add(alquiler1);
       listaAlq.add(alquiler2);
       listaAlq.add(alquiler3);     
       
        System.out.println("El mayor alquiler es "+ calculos.mayorAlquiler(listaAlq));
        System.out.println("El menor alquiler es "+ calculos.menorAlquiler(listaAlq));
        System.out.println("El promedio mensual de alquileres es "+ calculos.promedioMensual(listaAlq));
        System.out.println("El promedio anual de alquileres es "+ calculos.promedioAnual(listaAlq));        
    }
}
