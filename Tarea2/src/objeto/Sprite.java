package objeto;

public class Sprite extends Bebida{   
    public Sprite(int Serie){
        super(Serie);
    }
    public String beber(){
        return new String("Has comprado una Sprite");
    }
}

