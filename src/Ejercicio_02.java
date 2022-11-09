
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Sebas_work
 */
public class Ejercicio_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        int[] arrayUno = {2, -1, 5, 2, -3, 2, 0, 6, -2, 2};
        
        System.out.println("Array Numeros: ");
        for (int i = 0; i < arrayUno.length; i++) {
            System.out.print("| "+arrayUno[i]);
        }
        System.out.print("|\n");
        
        
        //-------------------------------------------------------------------
        
        
        int maximo = arrayUno[0];
        
        for (int i = 0; i < arrayUno.length; i++) {
            for (int j = 0; j < arrayUno.length; j++) {
                
                if (arrayUno[i]>maximo){
                    maximo = arrayUno[i];
                }
                
            }
            
        }
        System.out.println("Máximo: "+maximo);
        
        
        //-------------------------------------------------------------------
        
        
        int sumaPositivos = 0;
        
        for (int i = 0; i < arrayUno.length; i++) {
            
            if (arrayUno[i]>0){
                sumaPositivos = sumaPositivos+arrayUno[i];
            }
            
        }
        System.out.println("Suma positivos: "+sumaPositivos);
        
        
        //-------------------------------------------------------------------
        System.out.print("Introduce un número entero:");
        int valorTeclado = Integer.parseInt(entrada.nextLine());
        int contador = 0;
        for (int i = 0; i < arrayUno.length; i++) {
            if (valorTeclado == arrayUno[i]) {
                contador++;
            }
        }
        System.out.println("Apariciones del "+valorTeclado+": "+contador+" veces\n");
    }
    
}
