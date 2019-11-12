/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicacuadrosdialogo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author chiky
 */
public class ListenerBotones implements ActionListener{

    public ListenerBotones() {
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton aux = (JButton) e.getSource();
        switch(aux.getActionCommand()){
            case "btnConfirmarDia":{
                switch(JOptionPane.showConfirmDialog(null, "Elija una opcion:")){
                    case 0: 
                        aux.setText("SI");
                        break;
                    case 1: 
                        aux.setText("NO");
                        break;
                    case 3: 
                        aux.setText("OLVIDAR");
                        break;
                }
                break;
            }
            case "btnInput":{
                aux.setText(JOptionPane.showInputDialog("Ingresa una palabra u oracion: "));
                break;
            }
            case "btnInterno":{
                JOptionPane.showInternalConfirmDialog(aux, "I");
                break;
            }
            case "btn4":{
                JOptionPane.showMessageDialog(null, "HI >:c");
                break;
            } 
            case "btn5":{
                break;
            }
            case "btn6":{
                JOptionPane.showMessageDialog(null, "BIENVENIDO");
            }
        }
        
    }
    
}
