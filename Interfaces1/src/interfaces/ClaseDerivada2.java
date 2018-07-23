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
public class ClaseDerivada2 implements Interface1{

    @Override
    public void metodoInterfaz1() {
        System.out.println("metodoInterfaz1 desde la ClaseDerivada2");
    }

    @Override
    public int metodoInterfaz2(String p1) {
        if(p1.equals("uno")){
            return 1;
        }
        return 0;
    }

    @Override
    public String metodoInterfaz3(String p1) {
        throw new UnsupportedOperationException("Metodo no soportado en esta clase"); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String metodoInterfaz3(String p1, int i1) {
        return "p1" + i1;
    }
    
}
