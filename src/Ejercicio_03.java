
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * 
 */
public class Ejercicio_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String linea = "Alicia:Romero:Garcia:08/11/1979";
        String nombreCompleto ="";
        int edadActual;
        
        String[] almacenArray = linea.split(":");
        for (int i = 0; i < almacenArray.length-1; i++) {
            nombreCompleto = nombreCompleto +almacenArray[i]+" ";
            
        }
        System.out.println(nombreCompleto);
        
        String fechaNacimiento = almacenArray[3];
        
        String[] arrayNacimiento = fechaNacimiento.split("/");
        
        String diaCadena = arrayNacimiento[0];
        String mesCadena = arrayNacimiento[1];
        String yearCadena = arrayNacimiento[2];
        
        int dia = Integer.parseInt(diaCadena);
        int mes = Integer.parseInt(mesCadena);
        int year = Integer.parseInt(yearCadena);
        
        edadActual = (2020-year); 
        
        System.out.println("Dime el mes de hoy en numero: ");
        int mesHoy = Integer.parseInt(entrada.nextLine());
        System.out.println("Dime el dia de hoy en numero: ");
        int diaHoy = Integer.parseInt(entrada.nextLine());
        
        if (mesHoy>=mes && diaHoy>=dia){
            edadActual=edadActual+1;
            System.out.println("Edad actual: "+edadActual);
        }
        
        
    }
    
}
