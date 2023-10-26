// ============================================================================
//                         ALGORITMO REALIZADO POR:
//                              BRAYAN CARO.
// ============================================================================
package salario_semanal;

import java.util.Scanner;

public class Salario_semanal {
    int salariotrabajado;
    double salariohorario, bono;
    Scanner teclado;
    
    public void Salario_Semanal(){
        teclado = new Scanner(System.in);
        System.out.println("Ingrese salario semanal del Trabajador: ");
        salariotrabajado = teclado.nextInt();
        System.out.println("Ingrese las horas semanales del Trabajador: ");  
        salariohorario = teclado.nextInt();
        
        if(salariohorario>24){
            bono = (salariotrabajado * 5) / 100;
        } else {
            bono = (salariotrabajado * 10) / 100;
        }
        
        double trabajado = (salariotrabajado + bono) - salariohorario;
        
        System.out.println("Salario semanal: "+salariotrabajado);
        System.out.println("Bono semanal: "+bono);
        System.out.println("Salario total: "+trabajado);
        
    }
    
    public static void main(String[] args) {
        Salario_semanal s = new Salario_semanal();
        s.Salario_Semanal();
    }
    
}
