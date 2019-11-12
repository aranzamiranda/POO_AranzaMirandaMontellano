/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boton;
import java.awt.Component;
import javax.swing.*;
import java.awt.event.*;

public class Boton extends JFrame implements ActionListener{
   JButton boton1;
  
  public Boton(){
  setLayout(null);
  
  boton1 = new JButton("Cerrar");
  boton1.setBounds(10,10,150,30);
       Component add =add (boton1);
  boton1.addActionListener(this);
  }
  public void actionPermorfed(ActionEvent evento){
  if(evento.getSource() == boton1){
     System.exit(0);
   }
  
 }
public static void main(String args[]){
   Boton boton2 = new Boton();
   boton2.setBounds(0,0,540,400);
   boton2.setVisible(true);
   boton2.setLocationRelativeTo(null);
   boton2.setResizable(false);
 }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
  
}
