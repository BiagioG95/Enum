public class Rettangolo extends Forma{
    public Rettangolo(TipoForma tipo, double base, double altezza) {
        super(TipoForma.Rettangolo, base, altezza);
    }

    @Override
    public void calcolaArea() {

        System.out.println("L'area del " + TipoForma.Rettangolo + " è: " + (getBase()*getAltezza()));

    }
}
