// ============================================================================
//                         ALGORITMO REALIZADO POR:
//                              BRAYAN CARO.
// ============================================================================

package calificaciones;

import java.util.Scanner;

public class Calificaciones {

    Scanner teclado;
    double nota1,nota2,nota3,prom;
    
    
    public void calcular(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa la nota del corte 1: ");
        nota1 = teclado.nextDouble();
        System.out.println("Ingresa la nota del corte 2: ");
        nota2 = teclado.nextDouble();
        System.out.println("Ingresa la nota del corte 3: ");
        nota3 = teclado.nextDouble();
        
        prom = (nota1+nota2+nota3) / 3;
        System.out.println("La nota final del ciclo es: "+prom);
        
    }
    
    public static void main(String[] args) {
        Calificaciones c = new Calificaciones();
        c.calcular();
    }
    
}
