// ============================================================================
//                         ALGORITMO REALIZADO POR:
//                              BRAYAN CARO.
// ============================================================================
package salario_semanal2;

import java.util.Scanner;

public class Salario_Semanal2 {
    int salariotrabajado;
    double salariohorario, bono;
    Scanner teclado;
    
    public void Calcular_Sueldo(){
       teclado = new Scanner(System.in);
        System.out.println("Ingrese salario semanal del Trabajador: ");
        salariotrabajado = teclado.nextInt();
        System.out.println("Ingrese las horas semanales del Trabajador: ");  
        salariohorario = teclado.nextInt();
        
        if(salariohorario>24){
            bono = (salariotrabajado + 150000);
        } else {
            bono = (salariotrabajado + 150000) / 100;
        }
        
        double trabajado = (salariotrabajado + 150000) - salariohorario;
        
        System.out.println("Salario semanal: "+salariotrabajado);
        System.out.println("Bono semanal: "+bono);
        System.out.println("Salario total: "+trabajado);
    }
    public static void main(String[] args) {
        Salario_Semanal2 s2 = new Salario_Semanal2();
        s2.Calcular_Sueldo();
    }
}
