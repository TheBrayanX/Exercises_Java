// ============================================================================
//                         ALGORITMO REALIZADO POR:
//                              BRAYAN CARO.
// ============================================================================
package empresa;

import java.util.Scanner;

public class Empresa {
    Scanner teclado;
    int cantidad, monto;
    double comision, sal;

    public void Salario(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite la cantidad de carros vendidos: ");
        cantidad = teclado.nextInt();
        System.out.println("Digite el monto total de los carros vendidos: ");
        monto = teclado.nextInt();
        
       comision = monto * 0.05;
       sal = 100 + (150 * cantidad) + comision;
       System.out.println("El salario del empleado a cobrar es: "+sal);
       
    }
    
    public static void main(String[] args) {
        Empresa e = new Empresa();
        e.Salario();
    }
    
}
