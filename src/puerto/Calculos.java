package puerto;
import java.util.ArrayList;
public class Calculos {
    
    public int mayorAlquiler(ArrayList<Alquiler> listaAlq) {
        int mayor = 0;
       for(int i=0; i<listaAlq.size(); i++) {
           if (listaAlq.get(i).calcularAlquiler()>mayor){
               mayor = listaAlq.get(i).calcularAlquiler();
           }        
        }
       return mayor;
    }
      
    public int menorAlquiler(ArrayList<Alquiler> listaAlq) {
       int menor = listaAlq.get(0).calcularAlquiler();
      
       for (int i=0; i<listaAlq.size(); i++) {
           if (listaAlq.get(i).calcularAlquiler()<menor){
               menor = listaAlq.get(i).calcularAlquiler();
           }         
        }
        return menor;
    }
       
    public int promedioAnual(ArrayList<Alquiler> listaAlq) {
        int suma = 0, promedioAnual = 0;
        int totalAlquileres = listaAlq.size();
        for (int i=0; i<totalAlquileres; i++) {
            suma += listaAlq.get(i).calcularAlquiler();
        }
        return promedioAnual = suma/365;
    }
    
    public int promedioMensual(ArrayList<Alquiler> listaAlq) {
        int suma = 0, promedioMensual = 0;
        int totalAlquileres = listaAlq.size();
        for (int i=0; i<totalAlquileres; i++) {
            suma += listaAlq.get(i).calcularAlquiler();
        }
        return promedioMensual = suma/30;
    }
}
