enum TipoForma{
    Triangolo, Rettangolo


}

public abstract class Forma {
private TipoForma tipo;
private double base;
private double altezza;

    public Forma(TipoForma tipo, double base, double altezza) {
        this.tipo = tipo;
        this.base = base;
        this.altezza = altezza;
    }

    public TipoForma getTipo() {
        return tipo;
    }

    public void setTipo(TipoForma tipo) {
        this.tipo = tipo;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public abstract void calcolaArea();
}
