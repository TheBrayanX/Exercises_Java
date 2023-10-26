// ============================================================================
//                         ALGORITMO REALIZADO POR:
//                              BRAYAN CARO.
// ============================================================================
package cantidad_los3;

import java.util.Scanner;

public class Cantidad_los3 {
    
    float guillermo, luis, juan;

    public void calcular(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de dinero que tiene Guillermo: ");
        guillermo = teclado.nextInt();
        
        luis = guillermo / 2;
        juan = (guillermo + luis) / 2;
        
        System.out.println("Guillermo tiene una cantidad de: "+guillermo);
        System.out.println("Luis tiene la mitad de Guillermo que es: "+luis);
        System.out.println("Juan tiene la mitad de lo que poseen Guillermo y Luis: "+juan);
        
        float total = guillermo + luis + juan;
        System.out.println("La cantidad total que tienen los 3 es: "+total);
    }
    
    public static void main(String[] args) {
        Cantidad_los3 total = new Cantidad_los3();
        total.calcular();
    }
    
}
