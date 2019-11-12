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
public class ListenerFlechas implements KeyListener{
    public final ArrayList<JButtonFlechas> botones = new ArrayList<>();

    public ListenerFlechas() {
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
       int letraPresionada = e.getKeyCode();
       
       for(int i=0;i<botones.size();i++){
         JButtonFlechas aux = (JButtonFlechas) e.getSource();
         if(aux.getActionCommand().equals(""+letraPresionada)){
             aux.setBackground(Color.red);
         }
       }
    }

    @Override
    public void keyReleased(KeyEvent e) {
      int letraPresionada = e.getKeyCode();
       
       for(int i=0;i<botones.size();i++){
           JButtonFlechas aux = (JButtonFlechas) e.getSource();
           if(aux.getActionCommand().equals(""+letraPresionada)){
               aux.setBackground(Color.yellow);
           }
       }  
    }
    
    public void obtenerBotones(JButtonFlechas v){
        botones.add(v);
    }
    
}
