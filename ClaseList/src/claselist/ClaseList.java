/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claselist;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Random;
/**
 *
 * @author chiky
 */
public class ClaseList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           List<Persona> lp = new ArrayList<Persona>(); // El tipo es List y lo implementamos con ArrayList

            Random r = new Random();

            Persona temp = null;

            int sumaaltura = 0;

            for(int i=0;i<1000;i++)

            {lp.add(new Persona(i,"Persona"+i,r.nextInt(100)+100));}

            Iterator<Persona> it = lp.iterator();

 

            while(it.hasNext())

            {

                temp = it.next();

                System.out.println(temp);

                sumaaltura += temp.getAltura();

            }

 

            System.out.println("La media de altura del conjunto de Personas es: "+sumaaltura/lp.size());
            
            
            //Clase LinkedList
            List<Persona> listaarray = new ArrayList<Persona>();

            List<Persona> listalinked = new LinkedList<Persona>();

            long antes;

            for(int i=0;i<10000;i++)

            {

               listaarray.add(new Persona(i,"Persona"+i,i));  // En este ejemplo cada persona lleva datos ficticios

                listalinked.add(new Persona(i,"Persona"+i,i));

            }

            System.out.println("Tiempo invertido en insertar una persona en listaarray (en nanosegundos):");

            antes = System.nanoTime();

            listaarray.add(0,new Persona(10001,"Prueba",10001)); // Inserción en posicion 0 de una persona

            System.out.println(System.nanoTime()- antes); 

            System.out.println("Tiempo invertido en insertar una persona en listalinked (en nanosegundos):");

            antes = System.nanoTime();

            listalinked.add(0,new Persona(10001,"Prueba",10001));  // Inserción en posicion 0 de una persona

            System.out.println(System.nanoTime()- antes);
    }
    
}
