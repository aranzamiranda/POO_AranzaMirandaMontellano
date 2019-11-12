/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author chiky
 */
public class Calculadora {
    private double resultado; 

    public Calculadora() {
        resultado = 0;
    }

    public double getResultado() {
        return this.resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    public void suma(double dato){
     this.resultado += dato;   
    }
    public void resta(double dato){
     this.resultado -= dato;
    }
    public void multiplicacion(double dato){
     this.resultado *= dato; 
    }
    public void division(double dato){
     this.resultado /= dato;  
    }
    
    
}
