package objeto;

public abstract class Moneda {
    
    public Moneda(){
        
    }
    
    public String getSerie(){
        return this.toString();
    }

   
    public abstract int getValor();
    
    
}

class Moneda1000 extends Moneda{
    public Moneda1000(){
        super();
    }
    public int getValor(){
        return 1000;
    }
    
}
