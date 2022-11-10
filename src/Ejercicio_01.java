
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * 
 */
public class Ejercicio_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("*****PALINDROMOS*****");
        System.out.println("Introduce una palabra: ");
        String palabra = entrada.nextLine();
        
        int tamañoPalabra = palabra.length();
        char[] arrayNormal = new char[tamañoPalabra];
        char[] arrayReves = new char[tamañoPalabra];
        char caracter;
        int k;
        boolean esPalindromo = false;
        
        
        
        System.out.println("-----------------------------------------------------");
        
        for (int i = 0; i < tamañoPalabra; i++) {
            caracter = palabra.charAt(i);
            arrayNormal[i] = caracter;
        }
        System.out.print("Normal: ");
        System.out.println(arrayNormal);
        
        k=tamañoPalabra-1;
        for (int i = 0; i < tamañoPalabra; i++) {
            arrayReves[i] = arrayNormal[k];
            k--;
        }
        System.out.print("Reves: ");
        System.out.println(arrayReves);
        
        
        for (int i = 0; i < arrayReves.length; i++) {
            
            if (arrayNormal[i] == arrayReves[i]) {
                esPalindromo = true;
            }
            else{
                esPalindromo = false;
            }
        }
        
        if (esPalindromo == true){
            System.out.println("Es palíndromo");
            
        }else{
            System.out.println("No es palíndromo");
        }
    }
    
}
