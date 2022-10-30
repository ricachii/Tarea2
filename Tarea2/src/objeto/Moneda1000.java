package objeto;


public class Moneda1000 extends Moneda{
    public Moneda1000(){
        super();
    }
    public int getValor(){
        return 1000;
    }
    public String tostring(){
        return "El numero de serie de la moneda es: " + getSerie() + " Y su valor es: "+ getValor();
    }
    
}
