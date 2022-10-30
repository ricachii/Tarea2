
package objeto;

import java.util.ArrayList;

public class Deposito {
    private ArrayList<Bebida> a1;
    private int vuelto;
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
    public int getSerie(){
        return a1.get(0).getserie();
    }
    
    public boolean empty(){
       return a1.isEmpty();
    }
}
    
