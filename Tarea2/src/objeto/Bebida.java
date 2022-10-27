package objeto;

abstract class Bebida{
    private int Serie;
    
    public Bebida(int serie) {
        this.Serie = serie;
    }
    public int getserie(){
        return Serie;
    }
}