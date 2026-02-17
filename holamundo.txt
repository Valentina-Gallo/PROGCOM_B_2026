/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundov;
import java.util.*;

/**
 *
 * @author B11
 */
public class Holamundov {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String lluvia;
        // saludar mundo
        System.out.println("Hola mundo. Bienvenidos a PROGCOM-B");
        System.out.println("Esta lloviendo?");
        //estamos definiendo un objeto de tipo Scanner
        Scanner play= new Scanner (System.in);
        lluvia=play.nextLine();
        System.out.println("Tu respuesta fue: " +lluvia );
        if(lluvia.equals("si")){
            System.out.println("use sombrilla. Guarde la ropa");
        }    else{
            System.out.println("Salga tranquilo");
        }
    }
    
}
