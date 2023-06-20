/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepciones_eje05;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora debe generar un número aleatorio entre 1 y 500, y 
el usuario tiene que intentar adivinarlo. Para ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si 
el número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando consiga adivinarlo, debe indicárselo e imprimir 
en pantalla el número de veces que el usuario ha intentado adivinar el número. Si el usuario introduce algo que no es un número, 
se debe controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el carácter fallido como un intento.
 */
public class Excepciones_Eje05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int nAleatorio = (int) (Math.random() * 500); //Numero a adivinar
        //System.out.println(nAleatorio);
        int cont = 0; //Contador de intentos
        int n = 0; //Numero que el usuario ingresa

        System.out.println("-----Bienvenido al adivinador!-----");
        do {            
            System.out.println("Ingrese un número entre 0 y 500: ");
            try {                
                n = leer.nextInt();

                if (n < nAleatorio) {
                    System.err.println("El número debe ser mayor!");
                    cont++;
                } else if (n > nAleatorio) {
                    System.err.println("El número debe ser menor!");
                    cont++;
                }
            } catch (InputMismatchException ex) {
                System.err.println("⚠  Error! Ingrese solo números!");
                cont++;
                leer.nextLine();
            }
        } while (nAleatorio != n);
        
        System.out.println("Has acertado! 👌");
        System.out.println("Has hecho " + cont + " intentos.");
    }
    
}
//
//do {
//            try
//            {posicion=Integer.parseInt(JOptionPane.showInputDialog("Que posiciondel vector quieres ver?"));
//            JOptionPane.showMessageDialog(null, "El nombre guardado en la posicion "+ posicion +" es: "+ nombre[posicion]);
//            }catch(ArrayIndexOutOfBoundsException e){
//                JOptionPane.showMessageDiacouchlog(null, "El indice "+ posicion +" es invalido ");
//                if(posicion<0)JOptionPane.showMessageDialog(null, "El indice es Negativo ");
//            }
//            
//        } while (posicion>5 || posicion<0);
//        JOptionPane.showMessageDialog(null, "ProgramaFinalizado! Bye!");
//        
//    }