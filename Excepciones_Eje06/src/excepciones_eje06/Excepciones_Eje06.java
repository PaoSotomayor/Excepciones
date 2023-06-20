package excepciones_eje06;

import java.util.Scanner;


public class Excepciones_Eje06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("""
                           Dado el método de la clase A, indique:
                           a) Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?                                                    
                           b) Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?""");
        System.out.println("");
        System.out.println("""
                               class A {
                               public void metodoA() {
                               sentencia_a1
                               sentencia_a2 try {
                               sentencia_a3 (Si el error esta aca no ejecuta a4)
                               sentencia_a4
                               } catch (MioException e){
                                 sentencia_a6
                                 }
                                 sentencia_a5
                                 }
                                 }""");
        
        System.out.println("-------RESPUESTAS-------");
        System.out.println("a) a1,a2,a3 ó a4, 06, a5");
        System.out.println("b) a1, a2, a3, a4, a5");
    }
    

    
    



    
    }
        