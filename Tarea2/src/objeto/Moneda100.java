
package objeto;

public class Moneda100 extends Moneda {
    public Moneda100(){
        super();
    }
    public int getValor(){
        return 100;
    }
    
    public String tostring(){
        return "El numero de serie de la moneda es: " + getSerie() + " Y su valor es: "+ getValor();
    }
}
