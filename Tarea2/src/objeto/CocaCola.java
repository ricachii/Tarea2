package objeto;

public class CocaCola extends Bebida{
    public CocaCola(int Serie){
        super(Serie);
    }
    public String beber(){
        return new String("Coca-cola");
    }
}
