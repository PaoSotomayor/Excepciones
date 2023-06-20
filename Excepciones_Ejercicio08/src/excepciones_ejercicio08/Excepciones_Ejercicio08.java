
package excepciones_ejercicio08;

import java.util.Scanner;

/*Indique que se mostrará por pantalla cuando se ejecute cada una de estas clases:
 */
public class Excepciones_Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Indique que se mostrará por pantalla cuando se ejecute cada una de estas clases:");
        System.out.println("\n" +
"CLASS UNO{\n" +
"private static int metodo() {\n" +
"int valor=0;\n" +
"try {\n" +
"valor = valor+1;\n" +
"valor = valor + Integer.parseInt (”42”);\n" +
"valor = valor +1;\n" +
"System.out.println(”Valor final del try:” + valor) ;\n" +
"} catch (NumberFormatException e) {\n" +
"Valor = valor + Integer.parseInt(”42”);\n" +
"System.out.println(“Valor final del catch:” + valor);\n" +
"} finally {\n" +
"valor = valor + 1;\n" +
"System.out.println(”Valor final del finally: ” + valor) ;\n" +
"}\n" +
"valor = valor +1;\n" +
"System.out.println(”Valor antes del return: ” + valor) ;\n" +
"return valor;\n" +
"}");
        System.out.println("");
        System.out.println("Se mostrará por pantalla ->11");
        
        System.out.println("");
        System.out.println("""
                           public static void main (String[] args) {
                           try {
                           System.out.println (metodo()) ;
                           }catch(Exception e) {
                           System.err.println(\u201dExcepcion en metodo() \u201d) ;
                           e.printStackTrace();
                           }
                           }
                           }""");
        System.out.println("");
         System.out.println("------RESPUESTA-------");
        System.out.println("""
                            imprime el try : \u201dValor final del try: 44\u201d 
                            imprime el finally : \u201dValor final del finally: 45\u201d 
                            imprime el "return" : \u201dValor antes del return: 46 \u201d 
                            en el MAIN : 46 """);
        
        System.out.println("");
        System.out.println("//CLASS DOS{\n" +
"//private static int metodo() {\n" +
"//int valor=0;\n" +
"//try{\n" +
"//valor = valor + 1;\n" +
"//valor = valor + Integer.parseInt (”W”);\n" +
"//valor = valor + 1;\n" +
"//System.out.println(”Valor final del try: ” + valor) ;\n" +
"//} catch ( NumberFormatException e ) {\n" +
"//valor = valor + Integer.parseInt (”42”);\n" +
"//System.out.println(”Valor final del catch: ” + valor) ;\n" +
"//} finally {\n" +
"//valor = valor + 1;\n" +
"//System.out.println(”Valor final del finally: ” + valor) ;\n" +
"//}\n" +
"//valor = valor + 1;\n" +
"//System.out.println(”Valor antes del return: ” + valor) ;\n" +
"//return valor;\n" +
"//}\n" +
"//public static void main (String[] args) {\n" +
"//try{\n" +
"//System.out.println ( metodo ( ) ) ;\n" +
"//} catch(Exception e) {\n" +
"//System.err.println ( ” Excepcion en metodo ( ) ” ) ;\n" +
"//e.printStackTrace();\n" +
"//}\n" +
"//}\n" +
"// }");
        System.out.println("");
        System.out.println("------RESPUESTA-------");
        System.out.println("12\n" +
"imprime ”Valor final del catch: 43” \n" +
"imprime ”Valor final del finally: 44”\n" +
"imprime ”Valor antes del return: 45 ” \n" +
"imprime 45");
        System.out.println("");
        System.out.println("CLASS TRES{\n" +
"private static int metodo( ) {\n" +
"int valor=0;\n" +
"try{\n" +
"valor = valor + 1;\n" +
"valor = valor + Integer.parseInt (”W”);\n" +
"valor = valor + 1;\n" +
"System.out.println(”Valor final del try: ” + valor);\n" +
"} catch(NumberFormatException e) {\n" +
"valor = valor + Integer.parseInt (”W”);\n" +
"System.out.println(”Valor final del catch: ” + valor);\n" +
"} finally{\n" +
"valor = valor + 1;\n" +
"System.out.println(”Valor final del finally:” + valor);\n" +
"}\n" +
"valor = valor + 1;\n" +
"System.out.println(”Valor antes del return: ” + valor) ;\n" +
"return valor;\n" +
"}\n" +
"public static void main (String[] args) {\n" +
"try{\n" +
"System.out.println( metodo ( ) ) ;\n" +
"} catch(Exception e) {\n" +
"System.err.println(”Excepcion en metodo ( ) ” ) ;\n" +
"e.printStackTrace();\n" +
"}\n" +
"}\n" +
"}");
        System.out.println("");
        System.out.println("");
         System.out.println("------RESPUESTA-------");
        System.out.println("""
                            imprime \u201dValor final del finally: 2\u201d 
                            MAIN 
                            imprime \u201dExcepcion en metodo ( ) \u201d
                            imprime java.lang.NumberFormatException""");
    }
   
}

