package objeto;

public abstract class Moneda {
    
    public Moneda(){
        
    }
    
    public int getSerie(){
        return this.hashCode();
    }

   
    public abstract int getValor();
    
  
    

    
   
    
    
}

