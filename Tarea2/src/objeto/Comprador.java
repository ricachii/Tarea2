package objeto;

class Comprador {
    private Expendedor E;
    private Moneda100 M;
    private Moneda500 M5;
    private Moneda1000 M10;
    private int tipo;
    public Comprador(Expendedor e, int x){
        if(x<0 || x > 3){ //En caso de que la variable x este fuera de rango se le asignará un valor aleatorio entre [1,3] 
            int y = (int)(Math.random()*(4-1)+1); //pues estos son los numeros que denontan el tipo de bebida a comprar
            x = y;
        }
        this.tipo = x;
        this.E=e;
        this.M = new Moneda100();
        this.M5 = new Moneda500();
        this.M10 = new Moneda1000();
    }
   
    public void Compra(){ //Creacion del metodo compra para que el comprador realice su compra llamando a un metodo de la clase Expendedor
        E.comprarBebida(M10, tipo);
        
    }
}