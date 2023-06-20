
package excepciones_ejercicio07;

public class Excepciones_Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("""
                           Dado el  metodoB de la clase B, indique:
                           a) Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?"
                           b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?""");
      
        
        System.out.println("");
        System.out.println("      class B {\n" +
"      public void metodoB() {\n" +
"sentencia_b1 try {\n" +
"sentencia_b2\n" +
"} catch (MioException e){\n" +
"         sentencia_b3\n" +
"      }\n" +
"finally\n" +
"         sentencia_b4\n" +
"        }\n" +
"}\n" +
"    }\n" +
"    \n" +
"} ");
        
        System.out.println("");
        System.out.println("-------RESPUESTA---------");
        System.out.println("a)Se ejecutan de b1 a b4");
        System.out.println("b) Se ejecutan b1, b2 y b4");
    }  
    
}
