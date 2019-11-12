/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teclado;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

/**
 *
 * @author depot
 */
public class ListenerLetras implements KeyListener{
    private final ArrayList<JButtonLetras> listaBotones = new ArrayList<>();

    public ListenerLetras() {
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {  
       char letraPresionada = e.getKeyChar();
       String letra = "" + letraPresionada;
       
       for(int i=0;i<27;i++){
           JButtonLetras aux = listaBotones.get(i);
           if(aux.getActionCommand().equals(letra)){
               aux.setBackground(Color.green);
               break;
           }
       }
    }

    @Override
    public void keyReleased(KeyEvent e) {
         char letraPresionada = e.getKeyChar();
         String letra = "" + letraPresionada;
         for(int i=0;i<27;i++){
           JButtonLetras aux = listaBotones.get(i);
           if(aux.getActionCommand().equals(letra)){
               aux.setBackground(Color.red);
               break;
           }
       } 
    }
    void obtenerLetras(JButtonLetras v){
        listaBotones.add(v);
    }
    
}
