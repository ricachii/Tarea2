package objeto;
import java.util.ArrayList;

public class DepositoVuelto {
    private ArrayList<Moneda> a1;
    private int vuelto;
    public DepositoVuelto(){
        a1 = new ArrayList();
    }
    
    public void addMoneda(Moneda v){
        a1.add(v);
        
    }
    
    public Moneda getMoneda(){
        if(a1.size() == 0){
            return null;
        }else{
            return a1.remove(0);
        }
        
    }
   
    public boolean empty(){
       return a1.isEmpty();
    }
}
   
