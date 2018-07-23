/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author chalosalvador
 */
public interface Interface1 {
    
    public static final String ATRIBUTO_INTERFAZ1 = "ATTR";
    int ATRIBUTO_INTERFAZ2 = 1;
    int ATRIBUTO_INTERFAZ3 = 2;
    
    public abstract void metodoInterfaz1();
    int metodoInterfaz2(String p1);
    String metodoInterfaz3(String p1);
    String metodoInterfaz3(String p1, int i1);
    
}
