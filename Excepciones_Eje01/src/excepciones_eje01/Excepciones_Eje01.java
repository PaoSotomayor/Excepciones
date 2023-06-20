
package excepciones_eje01;

import Entidades.Persona;

/*Inicializar un objeto de la clase Persona ejercicio 3 de la guía 8 Servicios, a null y tratar de invocar el método esMayorDeEdad() 
a través de ese objeto. Luego, englobe el código con una cláusula try-catch para probar la nueva excepción que debe ser controlada.
 */
public class Excepciones_Eje01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona = null;

        try {
            System.out.println("Es mayor de edad? " + persona.esMayorDeEdad());
        }catch (Exception e) {
            System.err.println("ERROR: Objeto no cargado");
        }
    }
       
    }

