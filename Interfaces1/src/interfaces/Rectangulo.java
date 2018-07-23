/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.io.Serializable;

/**
 *
 * @author chalosalvador
 */
public class Rectangulo extends ClaseBase implements Figura, Serializable {
    
    private double lado1;
    private double lado2;

    public Rectangulo(String atributo1, String atributo2, String atributo3) {
        super(atributo1, atributo2, atributo3);
    }
    
    @Override
    public double calcularPerimetro(){
        return 0.0;
    }
    
    @Override
    public double calcularArea(){
        return 0.0;
    }
    
    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    
    
    
    
    
}
