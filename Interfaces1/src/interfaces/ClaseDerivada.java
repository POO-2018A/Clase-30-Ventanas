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
public class ClaseDerivada extends ClaseBase implements Interface1, Interface2{
    private String atributoD1;
    private String atributoD2;

    public ClaseDerivada(String atributo1, String atributo2, String atributo3) {
        super(atributo1, atributo2, atributo3);
    }
    
    public ClaseDerivada(String atributo1, String atributo2, String atributo3, String atributoD1, String atributoD2) {
        super(atributo1, atributo2, atributo3);
        this.atributoD1 = atributoD1;
        this.atributoD2 = atributoD2;
    }

    public String getAtributoD2() {
        return atributoD2;
    }

    public void setAtributoD2(String atributoD2) {
        this.atributoD2 = atributoD2;
    }

    public String getAtributoD1() {
        return atributoD1;
    }

    public void setAtributoD1(String atributoD1) {
        this.atributoD1 = atributoD1;
    }

    @Override
    public void metodoInterfaz1() {
        System.out.println("metodo Interfaz 1 desde Clase Derivada");
    }

    @Override
    public int metodoInterfaz2(String p1) {
        return ATRIBUTO_INTERFAZ2;
    }
    
    public int metodoInterfaz2(String p1, String p2) {
        return 1;
    }

    @Override
    public String metodoInterfaz3(String p1, int i1) {
        return "Dato devuleto por metodoInterfaz3 desde ClaseDerivada";
    }
    
    public void metodoBase1(int i){
        System.out.println("Este es el metodo base 1");
    }

    @Override
    public void metodo1Inteface2() {
        System.out.println("metodo1Inteface2"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int metodo2Inteface2(String a) {
        return 22;
    }

    @Override
    public String metodoInterfaz3(String p1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
