/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la base: ");
        double base = teclado.nextDouble();

        System.out.print("Introduce la altura: ");
        double altura = teclado.nextDouble();

        // El operador ternario sigue igual
        double area = (base > 0 && altura > 0) ? (base * altura) / 2 : 0;

        System.out.println((area > 0) 
            ? "El área es: " + area 
            : "Datos inválidos.");
        
        teclado.close();
    }
}