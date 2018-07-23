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
public class ClaseDerivada1 extends ClaseBase implements Interface1, Interface2 {
    
    public ClaseDerivada1(String atributo1, String atributo2, String atributo3) {
        super(atributo1, atributo2, atributo3);
    }

    @Override
    public void metodoInterfaz1(){
        
    }
    
    @Override
    public int metodoInterfaz2(String s1){
        return 0;
    }
    
    @Override
    public String metodoInterfaz3(String p1){
        return "";
    }
    
    @Override
    public String metodoInterfaz3(String p1, int i1){
        return "";
    }

    @Override
    public void metodo1Inteface2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int metodo2Inteface2(String a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
