package objeto;

public class Comprador {
    private String sabor;
    private int tipo, vueltocompleto = 0;
    public Comprador(Moneda M, Expendedor e, int x){      
        sabor = e.comprarBebida(M, x).beber();
        while(e.getVuelto() != null){
            vueltocompleto += 100;
        }
       
    }
    
    public String queBebiste(){
        return sabor;
        
    }
    
    public int cuantoVuelto(){
        return vueltocompleto;
      
    }
}