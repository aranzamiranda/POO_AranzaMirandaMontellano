/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boton;

/**
 *
 * @author chiky
 */
import java.awt.Component;
import javax.swing.*;
import java.awt.event.*;

public class Formulaario extends JFrame implements ActionListener{

  JButton boton1; 
  public Formulaario(){
  setLayout(null);
  boton1 = new JButton("Cerrar");
  boton1.setBounds(300,250,100,30);
      Component add = add(boton1);
  boton1.addActionListener(this);
 }

  @Override
  public void actionPerformed(ActionEvent Ari){
   if(Ari.getSource() == boton1){
     System.exit(0);
   }
  }

 public static void main(String args[]){
 Formulaario formulario1 = new Formulaario();
 formulario1.setBounds(0,0,450,350);
 formulario1.setVisible(true);
 formulario1.serResizable(false);
 formulario1.setLocationRelativeTo(null);
} 

    private void serResizable(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
