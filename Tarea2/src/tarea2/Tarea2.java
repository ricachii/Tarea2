package tarea2;
import objeto.Moneda;
import objeto.Moneda100;
import objeto.Moneda500;
import objeto.Moneda1000;
import objeto.CocaCola;
import objeto.Fanta;
import objeto.Sprite;
import objeto.Expendedor;
import objeto.Deposito;
import objeto.Comprador;


public class Tarea2 {  
    public static void main(String[] args) {
        
        Moneda500 m = new Moneda500();
        Expendedor E = new Expendedor(2, 200);
        Comprador C = new Comprador(m, E, 1);
        
        
        System.out.println(m.getValor() + " " +  m.getSerie());
        System.out.println(C.queBebiste());
        System.out.println(C.cuantoVuelto());
       
       
    }   
}
