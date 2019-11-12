/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teclado;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;

/**
 *
 * @author chiky
 */
public class JButtonLetras extends JButton{
    public JButtonLetras(){
        
    }
    public JButtonLetras(String etiqueta, Dimension dim, Color color, String etiqueta2){
        super(etiqueta);
            setSize(dim);
        // TODO: VAMOS A BUSCAR LA FORMA DE QUE TODOS LOS BOTONES 
        // COMPARTAN LA MISMA DIMENSION
        // TODO: CAMBIAR EL TAMAÑO DE LA ETIQUETA
        setActionCommand(etiqueta2);
        Font aux = getFont();
        String fuente = aux.getName();
        int estilo = aux.getStyle();
        Font aux2 = new Font(fuente, estilo,30);
        setFont(aux2);
        setBackground(color);
        // TODO: ver la forma en que se distribuyen los componentes dentro de el jframe
        
    }

    public boolean cambioColor(){
        if(getBackground()== Color.red){
            return true;
        }
        return false;
    }
    
    public void change(){
        if(cambioColor()==true){
                        setBackground(Color.blue);
        }
        else{
                        setBackground(Color.red);
        }
    }
    
    public void changeNum(){
        if(cambioColor()==true){
                        setBackground(Color.green);
        }
        else{
                        setBackground(Color.red);
        }
    }
    
    public void changeArr(){
        if(cambioColor()==true){
                        setBackground(Color.yellow);
        }
        else{
                        setBackground(Color.red);
        }
    }
}