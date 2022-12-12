
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Sebas_work
 */
public class Ejercicio_02_examen_funciones_diciembre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        generarContraseña();
        
        
    }
    
    
    public static void generarContraseña(){
        Scanner entrada = new Scanner (System.in);
        String frase;
        boolean tieneCuatroPalabras = false;
        do {
            System.out.println("Introduce una frase de al menos 4 palabras: ");
            frase = entrada.nextLine();
            
            if (totalPalabras(frase) >= 4) {
                tieneCuatroPalabras = true;
            }else{
                System.out.println("ERROR. La contraseña que vas a generar debe tener como MÍNIMO cuatro palabras");
            }
            
        } while (tieneCuatroPalabras == false);
        
        //UNA VEZ QUE LA CONTRASEÑA TIENE AL MENOS CUATRO PALABRAS, PODEMOS CONTINUAR
        
        String password = "";
        password = password + Character.toUpperCase(frase.charAt(0));
                
        for (int i = 0; i < frase.length(); i++) {
            char caractInicialMinus;
            
            if (frase.charAt(i) == ' ' && frase.charAt(i+1) != ' ') {
                caractInicialMinus = frase.charAt(i+1);
                password = password + caractInicialMinus;
            }
        }
        
        password = password + '+';
        int digito = (int)(Math.random()*10);
        password = password + digito;
        System.out.println("Contraseña generada: "+password);
        
    }
    
    public static int totalPalabras(String cadena){
        
        cadena = cadena.trim();
        int tamano = cadena.length();
        
        //El número de palabras será igual al número de 
        //espacios de la cadena más una unidad. 
        int contadorEspacios = 0; 
        
        for (int i = 0; i < tamano; i++) {
            if (cadena.charAt(i) == ' ' && cadena.charAt(i+1) != ' ') {
                contadorEspacios++;
            }
        }
        
        int numeroPalabras = contadorEspacios + 1;
        
        return numeroPalabras;
    }
    
}
