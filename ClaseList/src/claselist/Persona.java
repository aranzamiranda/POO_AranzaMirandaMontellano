/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claselist;

/**
 *
 * @author chiky
 */
public class Persona {
    private int idPersona;

    private String nombre;

    private int altura;

 

    public Persona(int idPersona, String nombre, int altura) {

        this.idPersona = idPersona;

        this.nombre = nombre;

        this.altura = altura;}

 

    public int getAltura() { return altura; } //Omitimos otros métodos get y set para simplificar

 

    @Override

    public String toString() {

        return "Persona-> ID: "+idPersona+" Nombre: "+nombre+" Altura: "+altura+"\n";
    }
}