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
import objeto.NoHayBebidaException;
import objeto.PagoIncorrectoException;
import objeto.PagoInsuficienteException;


public class Tarea2 {  
    public static void main(String[] args) {
        
      Expendedor e1 = new Expendedor(2,500);
      Moneda1000 m1 = new Moneda1000();
      Comprador c1 = new Comprador(m1,e1,1);
      System.out.println("1. Usted compro una: " +c1.queBebiste()+ " y su vuelto es de: " +c1.cuantoVuelto());
      
      System.out.println("");
      Moneda500 m2 = new Moneda500();
      Comprador c2 = new Comprador(m2,e1,2);
      System.out.println("2. Usted compro una: " +c2.queBebiste()+ " y su vuelto es de: " +c2.cuantoVuelto());
      
      System.out.println("");
      Moneda1000 m3 = new Moneda1000();
      Comprador c3 = new Comprador(m3,e1,3);
      System.out.println("3. Usted compro una: " +c3.queBebiste()+ " y su vuelto es de: " +c3.cuantoVuelto());
     
     Moneda500 m4 = new Moneda500();
     m4 = null;
     
     System.out.println("");
     Comprador c4 = new Comprador(m4,e1,1);
     System.out.println("4. Usted compro una: " +c4.queBebiste()+ " y su vuelto es de: " +c4.cuantoVuelto());
        
     System.out.println("");     
     Moneda100 m5 = new Moneda100();
     Comprador c5 = new Comprador(m5,e1,1);
     System.out.println("5. Usted compro una: " +c5.queBebiste()+ " y su vuelto es de: " +c5.cuantoVuelto());
     
     System.out.println("");
     Moneda1000 m6 = new Moneda1000();
     Comprador c6 = new Comprador(m6,e1,4);
     System.out.println("6. Usted compro una: " +c6.queBebiste()+ " y su vuelto es de: " +c6.cuantoVuelto());
        
     System.out.println("");
     Moneda1000 m7 = new Moneda1000();
     Comprador c7 = new Comprador(m7,e1,1);
     System.out.println("7. Usted compro una: " +c7.queBebiste()+ " y su vuelto es de: " +c7.cuantoVuelto());
     
     System.out.println("");
     Moneda1000 m8 = new Moneda1000();
     Comprador c8 = new Comprador(m8,e1,1);
     System.out.println("8. Usted compro una: " +c8.queBebiste()+ " y su vuelto es de: " +c8.cuantoVuelto());
     
     System.out.println("");
     System.out.println("9. Numero de serie moneda 1: "+m1.tostring());
     System.out.println("10. Numero de serie moneda 2: "+m2.tostring());
     
     System.out.println("11. Numero de serie bebida: " +c1.getSerie());
     
    }   
}