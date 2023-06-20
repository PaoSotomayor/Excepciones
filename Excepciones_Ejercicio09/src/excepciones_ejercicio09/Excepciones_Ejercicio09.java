/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepciones_ejercicio09;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Excepciones_Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("""
                                    Dado el  metodoC de la clase C, indique:
                           a) Qué sentencias y en qu\u00e9 orden se ejecutan si se produce la excepción MioException?
                           b) Qué sentencias y en qu\u00e9 orden se ejecutan si no se produce la excepción MioException?
                           c) Qué sentencias y en qu\u00e9 orden se ejecutan si se produce la excepción TuException?""");

        System.out.println("");
        System.out.println("""
                           class C {
                           void metodoC() throws TuException{
                                        sentencia_c1
                                        try {
                                               sentencia_c2
                           sentencia_c3
                           } catch (MioException e){
                           //    }
                           sentencia_c4
                           } catch (TuException e){
                                  sentencia_c5
                           throw (e) } MUESTRA LA RUTA DEL ERROR!!
                           finally
                                  sentencia_c6
                               }
                           }""");
        System.out.println("");
        System.out.println("-----RESPUESTA--------");
        System.out.println("a) - imprime c1, c2 o c3, c4, c6\n" +
"b) - imprime c1, c2, c4, c6\n" +
"c) - imprime c1, c2 o c3, c5, c6");


    }
    
}
