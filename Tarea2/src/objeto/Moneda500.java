
package objeto;

public class Moneda500 extends Moneda {
    public Moneda500(){
        super();
    }
    public int getValor(){
        return 500;
    }
      public String tostring(){
        return "El numero de serie de la moneda es: " + getSerie() + " Y su valor es: "+ getValor();
    }
    
    
}
