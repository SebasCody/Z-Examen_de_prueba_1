
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Sebas_work
 */
public class Ejercicio_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        String[] nombresArray = new String[5];
        String name;
        int[] edadesArray = new int[5];
        int edad;
        
        
        for (int i = 0; i < nombresArray.length; i++) {
            
        
            System.out.print("Introduce el nombre de un alumno (* para salir): ");
            name = entrada.nextLine();
            nombresArray[i] = name;
            
            if (name.equals("*")){
                break;
            }
        }
        
        
        
        for (int j = 0; j < 5; j++) {
            
        
            System.out.print("Introduce la edad de un alumno ( -1 para salir): ");
            edad = Integer.parseInt(entrada.nextLine());
            edadesArray[j] = edad;
           
            if (edad == -1) {
                break;
            }
        }
        
        
        for (int i = 0; i < nombresArray.length; i++) {
            
            
            System.out.print(nombresArray[i]+" ");
            
        }
        System.out.println("");
        
        for (int i = 0; i < edadesArray.length; i++) {
            System.out.print(edadesArray[i]+"   ");
            
        }
        System.out.println("");
        
        int posicion = 0;
        int maximo = edadesArray[0];
        for (int i = 0; i < edadesArray.length; i++) {
            
            if (edadesArray[i] > maximo){
                maximo = edadesArray[i];
                posicion = i;           
            }
        }
        
        String mayor = nombresArray[posicion];
        System.out.println("El mayor es: "+mayor);
        System.out.println("Edad del primer mayor: "+maximo);
        
        
        
        String[] auxiliarNombres = new String[nombresArray.length];
        int[] auxiliarEdades = new int[edadesArray.length];
        

        for (int i = 0; i < auxiliarEdades.length; i++) {
             
            if (edadesArray[i] >= maximo){
                maximo = edadesArray[i];
                auxiliarEdades[i] = maximo;
                auxiliarNombres[i] = nombresArray[i];
                System.out.println("Nombres de todos los mayores: "+auxiliarNombres[i]+"  ");
            }
        }
        
        for (int i = 0; i < auxiliarEdades.length; i++) {
            if (auxiliarEdades[i] != 0){
                System.out.println("Edades de todos los mayores: "+auxiliarEdades[i]+"  ");
            }
        }
        
        
        

    }
    
}
