package objeto;


public class Expendedor {
    
private int precio,vuelto;
private DepositoVuelto dep;
public static final int COCA=1;
public static final int SPRITE=2;
public static final int FANTA=3;
private Deposito coca,sprite,fanta;


    public Expendedor(int numBebidas,int precioBebidas) {
        dep = new DepositoVuelto();
        coca = new Deposito();
        sprite=new Deposito();
        fanta = new Deposito();
        this.precio= precioBebidas;
        
        
        for(int i=0;i<numBebidas;i++){  //Etiquetando bebidas
        
        coca.addBebida(new CocaCola(i+100)); //Numero de serie 
        sprite.addBebida(new Sprite(i+200));
        fanta.addBebida(new Fanta(i+300));
        }
    }    
    
    public int NoHayBebidaException(Moneda m, int Tipo){
        if(m!=null){
            if(Tipo == COCA && coca.empty() == true){
                vuelto = m.getValor();
                return vuelto;
            }
            if(Tipo == SPRITE && sprite.empty() == true){
                vuelto = m.getValor();
                return vuelto;
            }
            if(Tipo == FANTA && fanta.empty() == true){
                vuelto = m.getValor();
                return vuelto;
            }
        }
    return 0;
    }
    public int PagoInsuficienteException(Moneda m, int Tipo){
        if(m!= null){
            if(Tipo == COCA && precio > m.getValor() && coca.empty() == false){
                vuelto = m.getValor();
                return m.getValor();
            }
            if(Tipo == SPRITE && precio > m.getValor() && sprite.empty() == false){
                vuelto = m.getValor();
                return m.getValor();
            }
            if(Tipo == FANTA && precio > m.getValor() && fanta.empty() == false){
                vuelto = m.getValor();
                return m.getValor();
            }
        }
    return 0;
    }
    public String PagoIncorrectoExeption(Moneda m, int Tipo){
        if(m == null){
            return "Pago incorrecto";
        }
    return null;
    }
    
    public Bebida comprarBebida(Moneda m, int Tipo){ //Creacion de Metodo del tipo Bebida para comprar una bebida
        
        if(m != null ){
            if(Tipo == COCA && m.getValor() >= precio && coca.empty() == false){
                vuelto = m.getValor() - precio;
             
                while(true){
                    if(vuelto <= 0){
                        break;
                    }
                    vuelto = vuelto - 100;
                    for(int i = 0; i < vuelto/100; ++i){
                        dep.addMoneda(new Moneda100());
                    }
                    
                    
                }
  
                
                return coca.getBebida();
            }else if(Tipo == SPRITE && m.getValor() >= precio && sprite.empty() == false){
                vuelto = m.getValor() - precio;
                
                while(true){
                    if(vuelto <= 0){
                        break;
                    }
                    vuelto = vuelto - 100;
                    for(int i = 0; i < vuelto/100; ++i){
                        dep.addMoneda(new Moneda100());
                    }
                    
                }
              
                return sprite.getBebida();
                }else if(Tipo == FANTA && m.getValor() >= precio && fanta.empty() == false){
                vuelto = m.getValor() - precio;
                
                while(true){
                    if(vuelto <= 0){
                        break;
                    }
                    vuelto = vuelto - 100;
                    for(int i = 0; i < vuelto/100; ++i){
                        dep.addMoneda(new Moneda100());
                    }
                    
                }
                
                return fanta.getBebida();
            }else{
                return null;
            }
            
        }else{
            return null;
        }
        
        
    }
    
    
    public Moneda getVuelto(){
        return dep.getMoneda();
    }
    
        
            
   
   

}
 
