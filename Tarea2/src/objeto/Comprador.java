package objeto;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Comprador {
    private String sabor;
    private int tipo, vueltocompleto = 0, serie;
    public Comprador(Moneda M, Expendedor e, int x) {      
        serie = e.getSerie(x);
        try {
            sabor = e.comprarBebida(M, x).beber();
        } catch (PagoIncorrectoException | NoHayBebidaException | PagoInsuficienteException ex) {
            ex.printStackTrace();
        }
        
        
        while(e.DepSize() != true){          
            vueltocompleto += e.getVuelto().getValor();
        }
       
    }
    
    public String queBebiste(){
        return sabor;
        
    }
    
    public int cuantoVuelto(){
        return vueltocompleto;
      
    }
    public int getSerie(){
        return serie;
    }
    
}