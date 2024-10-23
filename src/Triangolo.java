public class Triangolo extends Forma {


    public Triangolo(TipoForma tipo, double base, double altezza) {
        super(TipoForma.Triangolo, base, altezza);
    }

    @Override
    public void calcolaArea() {

        System.out.println("L'area del " + TipoForma.Triangolo + " è: " + ((getBase()*getAltezza())/2));

    }
}
