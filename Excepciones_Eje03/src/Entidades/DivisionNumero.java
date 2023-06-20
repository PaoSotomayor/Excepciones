/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class DivisionNumero {

    Scanner leer = new Scanner(System.in);

    private double num1, num2;

    public DivisionNumero() {
    }


    public void conversor(String n1, String n2) {

        try {

            num1 = Integer.parseInt(n1);
            num2 = Integer.parseInt(n2);
            System.out.println("La división de los números es: " + (num1 / num2));

        } catch (NumberFormatException  e) {
          
            System.err.println("Ingrese 2 números!!!");
            
             } catch (ArithmeticException  e) {
                 System.err.println("No se puede dividir un número por cero");

        } finally {
            System.out.println("------------------------");
        }
    }

}
