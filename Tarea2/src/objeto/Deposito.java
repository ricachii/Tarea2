
package objeto;

import java.util.ArrayList;

public class Deposito {
    
    private ArrayList<Bebida> a1;
    
    public Deposito(){
        a1 = new ArrayList();
    }
    
    public void addBebida(Bebida v){
        a1.add(v);
        
    }
    
    public Bebida getBebida(){
        if(a1.size() == 0){
            return null;
        }else{
            return a1.remove(0);
        }
        
    }   
}
    
