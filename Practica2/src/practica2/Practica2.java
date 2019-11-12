
//Aranza Miranda Montellano 2CM1 Juego del gato y Calculadora. 
package practica2;

import clases.Gato;
import java.util.Scanner;
import clases.Calculadora;

/**
 *
 * @author chiky
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Para la clase de la calculadora
        Calculadora calculadora1 = new Calculadora();
        Scanner read = new Scanner(System.in); // Para poder ingresar datos. 
        int opc = 0, opc2 = 0;
        double num;
        do{
        System.out.println("<--------MENU CALCULADORA-------->");
        System.out.println("Elige las opciones que quieres realizar por favor");
        System.out.println("1.- Suma");
        System.out.println("2.- Resta");
        System.out.println("3.- Multiplicacion");
        System.out.println("4.- Division");
        System.out.println("Escribe el numero o accion que deseas ejecutar: ");
        opc = read.nextInt();
        switch(opc){
            case 1 : 
            {
                System.out.println("Ingrese el dato a sumar: ");
                num = read.nextDouble();
                calculadora1.suma(num);
                System.out.println(calculadora1.getResultado());
                        
                break;
            }
            case 2: 
            {
                System.out.println("Ingrese el dato a restar: ");
                num = read.nextDouble();
                calculadora1.resta(num);
                break;
            }
            case 3: 
            {
                 System.out.println("Ingrese el dato a multiplicar: ");
                 num = read.nextDouble();
                 calculadora1.multiplicacion(num);
                 break;
            }
            case 4: 
            {
                System.out.println("Ingrese el dato a dividir: ");
                num = read.nextDouble();
                calculadora1.division(num);
                break;
                
            }
        }
        System.out.println("Deseas seguir ingresando numeros?: [0-->No|1-->Si]");
        opc2 = read.nextInt();
        }while(opc2 != 0);
       
        //Para la clase del juego del gato
        Gato juego = new Gato();
        juego.jugarGato();
    }
    
}
