
package cuadratica;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Cuadratica {

    
    public static void main(String[] args) {
        DecimalFormat formato = new DecimalFormat("#.##");
        Scanner entrada = new Scanner(System.in);
        double a, b, c, x1, x2, dentroRaiz, raiz;
        System.out.print("Cálculo de una Raiz Cuadrada");
        System.out.print("\n\nIngrese el valor de a: ");
        a = entrada.nextInt();
        
        if (a==0){
            System.out.println("ERROR: El valor de \"a\" tiene que ser distinto a 0");
        
        }else{
            
            System.out.print("\nIngrese el valor de b: ");
            b = entrada.nextInt();
            
            System.out.print("\nIngrese el valor de c: ");
            c = entrada.nextInt();
            
            dentroRaiz = ((Math.pow(b, 2)) - (4*a*c));
            
            if (dentroRaiz<0) {
                System.out.println("ERROR: Intento de calcular una raiz con base negativa");
            
            }else{
                raiz = Math.sqrt(dentroRaiz);
                x1 = ((-b) + raiz)/ (2*a);
                x2 = ((-b) - raiz)/(2*a);
                
                System.out.println("\n Valores: \na: "+a+" \nb: "+b+" \nc: "+c);
                System.out.println("\n Respuesta: \nX1: "+formato.format(x1)+" \nX2: "+formato.format(x2));
            }
            
        }
        
    }
}
