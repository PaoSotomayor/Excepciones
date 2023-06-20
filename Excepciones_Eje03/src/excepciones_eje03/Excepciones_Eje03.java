
package excepciones_eje03;

import Entidades.DivisionNumero;
import java.util.Scanner;

/*Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos números en forma de cadena. 
A continuación, utilice el método parseInt() de la clase Integer, para convertir las cadenas al tipo int y guardarlas en dos 
variables de tipo int. Por ultimo realizar una división con los dos numeros y mostrar el resultado.
 */
public class Excepciones_Eje03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        DivisionNumero d = new  DivisionNumero();
        
        System.out.println("-----División-----");
        System.out.println("Ingrese un número: ");
        String num = leer.next();
        
    
        System.out.println("Ingrese otro número: ");
        String num2 = leer.next();
        d.conversor(num, num2);
       
   
    }
    
}
