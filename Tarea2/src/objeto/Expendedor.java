package objeto;


public class Expendedor {
    
private int precio,vuelto;
public static final int COCA=1;
public static final int SPRITE=2;
public static final int FANTA=3;
private Deposito coca,sprite,fanta;


    public Expendedor(int precio) {
        coca = new Deposito();
        sprite=new Deposito();
        fanta = new Deposito();
        this.precio= precio;
        
        
    for(int i=0;i<6;i++){  //Etiquetando bebidas
        
        coca.addBebida(new CocaCola(i+100)); //Numero de serie 
        sprite.addBebida(new Sprite(i+200));
        fanta.addBebida(new Fanta(i+300));
        
            }
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
                    
                }
                return coca.getBebida();
            }else if(Tipo == SPRITE && m.getValor() >= precio && sprite.empty() == false){
                vuelto = m.getValor() - precio;
                
                while(true){
                    if(vuelto <= 0){
                        break;
                    }
                    vuelto = vuelto - 100;
                    
                }
                return sprite.getBebida();
                }else if(Tipo == FANTA && m.getValor() >= precio && fanta.empty() == false){
                vuelto = m.getValor() - precio;
                
                while(true){
                    if(vuelto <= 0){
                        break;
                    }
                    vuelto = vuelto - 100;
                    
                }
                return fanta.getBebida();
            }else{
                return null;
            }
        }else{
            return null;
        }
    }

}
 