/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicacuadrosdialogo;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.HeadlessException;
import javax.swing.JButton;

/**
 *
 * @author chiky
 */
public class JFrameCuadroDialogo extends JFrame{
    private final JPanel panelCentral = new JPanel(new GridLayout(5,1));
    private final ListenerBotones escuchar = new ListenerBotones();
     public JFrameCuadroDialogo(){
        inicializarComponentes();
    }
    private void inicializarComponentes(){
        Dimension dimension1 = new Dimension(45, 45);
        JButton btnConfirmarDia = new JButton("Confirmar dialogo");
        btnConfirmarDia.getSize(dimension1);
        btnConfirmarDia.setActionCommand("btnConfirmarDia");
        JButton btnInput = new JButton("Dialogo input");
        btnInput.setActionCommand("btnInput");
        btnInput.getSize(dimension1);
        JButton btnInterno = new JButton("Dialogo interno");
        btnInterno.setActionCommand("btnInterno");
        btnInterno.getSize(dimension1);
        JButton btn4 = new JButton("Dialogo mensaje");
        btn4.getSize(dimension1);
        btn4.setActionCommand("btn4");
        JButton btn5 = new JButton("Boton de opciones");
        btn5.getSize(dimension1);
        btn5.setActionCommand("btn5");
        JButton btn6 = new JButton("Boton bienvenido");
        btn6.getSize(dimension1);
        btn6.setActionCommand("btn6");
        
        panelCentral.add(btnConfirmarDia);
        panelCentral.add(btnInput);
        panelCentral.add(btnInterno);
        panelCentral.add(btn4);
        panelCentral.add(btn5);
        panelCentral.add(btn6);
        
        add(panelCentral,BorderLayout.CENTER);
        
        JTextField display = new JTextField();
        Font auxF = display.getFont();
        Font nueva = new Font(auxF.getName(), auxF.getStyle(), 50);
        display.setFont(nueva);
        display.setEditable(true);
        display.setHorizontalAlignment(JTextField.RIGHT);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        btnConfirmarDia.addActionListener(escuchar);
        btnInput.addActionListener(escuchar);
        btnInterno.addActionListener(escuchar);
        btn4.addActionListener(escuchar);
        btn5.addActionListener(escuchar);
        btn6.addActionListener(escuchar);
     
    }
    
}
