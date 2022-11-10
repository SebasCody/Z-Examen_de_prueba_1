
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author sebastian.peralta
 */
public class TableroAjedrezAlfil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int[][] tablero = new int[8][8];
        
        int suma;
        for (int i = 0; i < 8; i++) {
            
            for (int j = 0; j < 8; j++) {
                
                suma = i+j;
            if ((suma%2==0)){
                tablero[i][j]=1;
            }
            else
                tablero[i][j] = 0;
            
        }
        
    }
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(tablero[i][j]+"   ");
                
            }
            System.out.println("");
        }
        
        
        int pos1;
        int pos2;
        System.out.println("Dime una posición: ");
        System.out.println("Posición i: ");
        pos1 = Integer.parseInt(entrada.nextLine());
        System.out.println("Posición j: ");
        pos2 = Integer.parseInt(entrada.nextLine());
        
        int sumaPosiciones;
        sumaPosiciones = pos1+pos2;
        int empiezaEN;
        empiezaEN = sumaPosiciones%2;
        if (empiezaEN == 0){
            System.out.println("Empieza en casilla blanca (valor 1)");
        }
        if (empiezaEN !=0){
            System.out.println("Empieza en casilla negra (valor 0)");
        }
        
        
        
        for (int i = pos1; i < 8 ; i++) {
            for (int j = pos2; j < i; j++) {
                
                
            }
            
        }
        
        }
    
}
