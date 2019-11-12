/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teclado;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author depot
 */
public class JFrameTeclado extends JFrame{
   private static final JPanel panelNumeros = new JPanel(new GridLayout(1, 10));
   private static final JPanel panelLetras = new JPanel(new GridLayout(4, 7));
   private static final JPanel panelFlechas = new JPanel(new GridLayout(4, 1));
   
    public JFrameTeclado(){
       initComponentes(); 
    }

    private void initComponentes() {
        ListenerNumeros auxNum = new ListenerNumeros();
        ListenerLetras letrasOidos = new ListenerLetras();
        
        Dimension dimension = new Dimension(30, 20);
        JButtonC btnUno = new JButtonC("1",dimension, Color.yellow);
        auxNum.obtenerNumeros(btnUno);
        panelNumeros.add(btnUno);
        btnUno.addKeyListener(auxNum);
        JButtonC btnDos = new JButtonC("2",dimension, Color.yellow);
        panelNumeros.add(btnDos);
         auxNum.obtenerNumeros(btnDos);
        btnDos.addKeyListener(auxNum);
        JButtonC btnTres = new JButtonC("3",dimension, Color.yellow);
        panelNumeros.add(btnTres);
        auxNum.obtenerNumeros(btnTres);
        btnTres.addKeyListener(auxNum);
        JButtonC btnCuatro = new JButtonC("4",dimension, Color.yellow);
        panelNumeros.add(btnCuatro);
        auxNum.obtenerNumeros(btnCuatro);
        btnCuatro.addKeyListener(auxNum);
        JButtonC btnCinco = new JButtonC("5",dimension, Color.yellow);
        panelNumeros.add(btnCinco);
        auxNum.obtenerNumeros(btnCinco);
        btnCinco.addKeyListener(auxNum);
        JButtonC btnSeis = new JButtonC("6",dimension, Color.yellow); 
        panelNumeros.add(btnSeis);
        auxNum.obtenerNumeros(btnSeis);
        btnSeis.addKeyListener(auxNum);
        JButtonC btnSiete = new JButtonC("7",dimension, Color.yellow); 
        panelNumeros.add(btnSiete);
        auxNum.obtenerNumeros(btnSiete);
        btnSiete.addKeyListener(auxNum);
        JButtonC btnOcho = new JButtonC("8",dimension, Color.yellow); 
        panelNumeros.add(btnOcho);
        auxNum.obtenerNumeros(btnOcho);
        btnOcho.addKeyListener(auxNum);
        JButtonC btnNueve = new JButtonC("9",dimension, Color.yellow);
        panelNumeros.add(btnNueve);
        auxNum.obtenerNumeros(btnNueve);
        btnNueve.addKeyListener(auxNum);
        JButtonC btnCero = new JButtonC("0",dimension, Color.yellow);
        panelNumeros.add(btnCero);
        auxNum.obtenerNumeros(btnCero);
        btnCero.addKeyListener(auxNum);
        
        
        Dimension dim = new Dimension(10,15);
        
        JButtonLetras btnQ = new JButtonLetras("Q", dim, Color.red,"q");
         panelLetras.add(btnQ);
        letrasOidos.obtenerLetras(btnQ);
        btnQ.addKeyListener(letrasOidos);
        JButtonLetras btnW = new JButtonLetras("W", dim, Color.red,"w");
        panelLetras.add(btnW);
        btnW.addKeyListener(letrasOidos);
        letrasOidos.obtenerLetras(btnW);
        JButtonLetras btnE = new JButtonLetras("E", dim, Color.red,"e");
        panelLetras.add(btnE);
        btnE.addKeyListener(letrasOidos);
        letrasOidos.obtenerLetras(btnE);
        JButtonLetras btnR = new JButtonLetras("R", dim, Color.red,"r");
        panelLetras.add(btnR);
        btnR.addKeyListener(letrasOidos);
        letrasOidos.obtenerLetras(btnR);
        JButtonLetras btnT = new JButtonLetras("T", dim, Color.red,"t");
        panelLetras.add(btnT);
        btnT.addKeyListener(letrasOidos);
        letrasOidos.obtenerLetras(btnT);
        JButtonLetras btnY = new JButtonLetras("Y", dim, Color.red,"y");
        panelLetras.add(btnY);
        btnY.addKeyListener(letrasOidos);
        letrasOidos.obtenerLetras(btnY);
        JButtonLetras btnU = new JButtonLetras("U", dim, Color.red,"u");
        panelLetras.add(btnU);
        btnU.addKeyListener(letrasOidos);
        letrasOidos.obtenerLetras(btnU);
        JButtonLetras btnI = new JButtonLetras("I", dim, Color.red,"i");
        panelLetras.add(btnI);
        btnI.addKeyListener(letrasOidos);
        letrasOidos.obtenerLetras(btnI);
        JButtonLetras btnO = new JButtonLetras("O", dim, Color.red,"o");
        panelLetras.add(btnO);
        btnO.addKeyListener(letrasOidos);
        letrasOidos.obtenerLetras(btnO);
        JButtonLetras btnP = new JButtonLetras("P", dim, Color.red,"p");
        panelLetras.add(btnP);
        btnP.addKeyListener(letrasOidos);
        letrasOidos.obtenerLetras(btnP);
        JButtonLetras btnA = new JButtonLetras("A", dim, Color.red,"a");
        panelLetras.add(btnA);
        btnA.addKeyListener(letrasOidos);
        letrasOidos.obtenerLetras(btnA);
        JButtonLetras btnS = new JButtonLetras("S", dim, Color.red,"s");
        panelLetras.add(btnS);
        btnS.addKeyListener(letrasOidos);
        letrasOidos.obtenerLetras(btnS);
        JButtonLetras btnD = new JButtonLetras("D", dim, Color.red,"d");
        panelLetras.add(btnD);
        btnD.addKeyListener(letrasOidos);
        letrasOidos.obtenerLetras(btnD);
        JButtonLetras btnF = new JButtonLetras("F", dim, Color.red,"f");
        panelLetras.add(btnF);
        btnF.addKeyListener(letrasOidos);
        letrasOidos.obtenerLetras(btnF);
        JButtonLetras btnG = new JButtonLetras("G", dim, Color.red,"g");
        panelLetras.add(btnG);
        btnG.addKeyListener(letrasOidos);
        letrasOidos.obtenerLetras(btnG);
        JButtonLetras btnH = new JButtonLetras("H", dim, Color.red,"h");
        panelLetras.add(btnH);
        btnH.addKeyListener(letrasOidos);
        letrasOidos.obtenerLetras(btnH);
        JButtonLetras btnJ = new JButtonLetras("J", dim, Color.red,"j");
        panelLetras.add(btnJ);
        btnJ.addKeyListener(letrasOidos);
        letrasOidos.obtenerLetras(btnJ);
        JButtonLetras btnK = new JButtonLetras("K", dim, Color.red,"k");
        panelLetras.add(btnK);
        btnK.addKeyListener(letrasOidos);
        letrasOidos.obtenerLetras(btnK);
        JButtonLetras btnL = new JButtonLetras("L", dim, Color.red,"l");
        panelLetras.add(btnL);
        btnL.addKeyListener(letrasOidos);
        letrasOidos.obtenerLetras(btnL);
        JButtonLetras btnÑ = new JButtonLetras("Ñ", dim, Color.red,"ñ");
        panelLetras.add(btnÑ);
        btnÑ.addKeyListener(letrasOidos);
        letrasOidos.obtenerLetras(btnÑ);
        JButtonLetras btnZ = new JButtonLetras("Z", dim, Color.red,"z");
        panelLetras.add(btnZ);
        btnZ.addKeyListener(letrasOidos);
        letrasOidos.obtenerLetras(btnZ);
        JButtonLetras btnX = new JButtonLetras("X", dim, Color.red,"x");
        panelLetras.add(btnX);
        btnX.addKeyListener(letrasOidos);
        letrasOidos.obtenerLetras(btnX);
        JButtonLetras btnC = new JButtonLetras("C", dim, Color.red,"c");
        panelLetras.add(btnC);
        btnC.addKeyListener(letrasOidos);
        letrasOidos.obtenerLetras(btnC);
        JButtonLetras btnV = new JButtonLetras("V", dim, Color.red,"v");
        panelLetras.add(btnV);
        btnV.addKeyListener(letrasOidos);
        letrasOidos.obtenerLetras(btnV);
        JButtonLetras btnB = new JButtonLetras("B", dim, Color.red,"b");
        panelLetras.add(btnB);
        btnB.addKeyListener(letrasOidos);
        letrasOidos.obtenerLetras(btnB);
        JButtonLetras btnN = new JButtonLetras("N", dim, Color.red,"n");
        panelLetras.add(btnN);
        btnN.addKeyListener(letrasOidos);
        letrasOidos.obtenerLetras(btnN);
        JButtonLetras btnM = new JButtonLetras("M", dim, Color.red,"m");
        panelLetras.add(btnM);
        btnM.addKeyListener(letrasOidos);
        letrasOidos.obtenerLetras(btnM);
        JButtonLetras btnPunto = new JButtonLetras(".", dim, Color.red,".");
        panelLetras.add(btnPunto);
        
        Dimension dimF = new Dimension(50,60);
        ListenerFlechas listenerFlechas = new ListenerFlechas();
        
        JButtonFlechas btnUp = new JButtonFlechas("UP", dimF, Color.yellow,38);
        panelFlechas.add(btnUp, BorderLayout.NORTH);
        btnUp.addKeyListener(listenerFlechas);
        btnUp.setActionCommand(""+38);
        listenerFlechas.obtenerBotones(btnUp);
        JButtonFlechas btnDown = new JButtonFlechas("DOWN", dimF, Color.yellow,40);
        panelFlechas.add(btnDown, BorderLayout.CENTER);
        btnDown.addKeyListener(listenerFlechas);
        btnDown.setActionCommand(""+40);
        listenerFlechas.obtenerBotones(btnDown);
        JButtonFlechas btnLeft = new JButtonFlechas("LEFT", dimF, Color.yellow,37);
        panelFlechas.add(btnLeft, BorderLayout.WEST);
        btnLeft.setActionCommand(""+37);
        btnLeft.addKeyListener(listenerFlechas);
        listenerFlechas.obtenerBotones(btnLeft);
        JButtonFlechas btnRight = new JButtonFlechas("RIGTH", dimF, Color.yellow,39);
        panelFlechas.add(btnRight, BorderLayout.EAST);
        btnRight.setActionCommand(""+39);
        btnRight.addKeyListener(listenerFlechas);
        listenerFlechas.obtenerBotones(btnRight);
        
        
        
        add(panelNumeros,BorderLayout.NORTH);
        add(panelLetras,BorderLayout.CENTER);
        add(panelFlechas,BorderLayout.EAST);
        setVisible(true);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    
}
