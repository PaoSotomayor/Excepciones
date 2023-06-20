
package excepciones_eje04;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede causar una excepción de tipo InputMismatchException, el 
método Integer.parseInt() si la cadena no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un número por cero surge una 
ArithmeticException. Manipule todas las posibles excepciones utilizando bloques try/catch para las distintas excepciones
 */
public class Excepciones_Eje04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("-----División-----");
        System.out.println("Ingrese un número: ");
        String num1 = leer.next();
        System.out.println("Ingrese otro número: ");
        String num2 = leer.next();
        
        
        try{
        
            int num01 = Integer.parseInt(num1);
            int num02 = Integer.parseInt(num2);           
            System.out.println("La división da como resultado: " + (num01/num02));
        
        }catch (InputMismatchException ex) {
            System.err.println("⚠ Error! Ingrese solo números!" );
        
        }catch (NumberFormatException ex) {
            System.err.println("⚠ Error! Ingrese solo números!" );     
        
        }catch (ArithmeticException ex) {
            System.err.println("⚠ Error! No puede dividir un número por cero");

                 
            
        }
        
        
    }
    
}
