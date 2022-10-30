package objeto;

public class Expendedor {

    private int precio, vuelto;
    private DepositoVuelto dep;
    public static final int COCA = 1;
    public static final int SPRITE = 2;
    public static final int FANTA = 3;
    private Deposito coca, sprite, fanta;

    public Expendedor(int numBebidas, int precioBebidas) {
        dep = new DepositoVuelto();
        coca = new Deposito();
        sprite = new Deposito();
        fanta = new Deposito();
        this.precio = precioBebidas;

        for (int i = 0; i < numBebidas; i++) {  //Etiquetando bebidas

            coca.addBebida(new CocaCola(i + 100)); //Numero de serie 
            sprite.addBebida(new Sprite(i + 200));
            fanta.addBebida(new Fanta(i + 300));
        }
    }

 

    public Bebida comprarBebida(Moneda m, int Tipo) throws PagoIncorrectoException, objeto.NoHayBebidaException, objeto.PagoInsuficienteException {//Creacion de Metodo del tipo Bebida para comprar una bebida
        if (m == null) {
            throw new PagoIncorrectoException("Metodo de pago incorrecto, Moneda no tiene valor");
        } else {
            if (m.getValor() < precio) {
                dep.addMoneda(m);
                throw new PagoInsuficienteException("Cantidad de pago insuficiente");

            } else {

                if (m != null) {
                    if ((Tipo == COCA && coca.empty() == true) || (Tipo == SPRITE && sprite.empty() == true) || (Tipo == FANTA && fanta.empty() == true)) {
                        dep.addMoneda(m);
                        throw new NoHayBebidaException("Deposito Vacio no se puede entregar una bebida");

                    } else {
                        if (Tipo == COCA && m.getValor() >= precio && coca.empty() == false) {
                            vuelto = m.getValor() - precio;

                            while (true) {
                                if (vuelto <= 0) {
                                    break;
                                }
                                vuelto = vuelto - 100;
                                for (int i = 0; i < vuelto / 100; ++i) {
                                    dep.addMoneda(new Moneda100());
                                }

                            }

                            return coca.getBebida();
                        } else if (Tipo == SPRITE && m.getValor() >= precio && sprite.empty() == false) {
                            vuelto = m.getValor() - precio;

                            while (true) {
                                if (vuelto <= 0) {
                                    break;
                                }
                                vuelto = vuelto - 100;
                                for (int i = 0; i < vuelto / 100; ++i) {
                                    dep.addMoneda(new Moneda100());
                                }

                            }

                            return sprite.getBebida();
                        } else if (Tipo == FANTA && m.getValor() >= precio && fanta.empty() == false) {
                            vuelto = m.getValor() - precio;

                            while (true) {
                                if (vuelto <= 0) {
                                    break;
                                }
                                vuelto = vuelto - 100;
                                for (int i = 0; i < vuelto / 100; ++i) {
                                    dep.addMoneda(new Moneda100());
                                }

                            }

                            return fanta.getBebida();

                        } else {
                            return null;
                        }

                    }

                } else {
                    return null;

                }

            }
        }
    }

  

    public boolean DepSize(){
       return dep.empty();
    }

    

    public Moneda getVuelto() {
        return dep.getMoneda();
    }

}
