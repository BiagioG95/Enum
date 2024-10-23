/*
Scrivere un programma che contenga una classe chiamata Forma ed un metodo chiamato calcolaArea() che stampi l'area della forma specifica.
Crea poi due sottoclassi Triangolo e Rettangolo che estendono Forma e che abbiano un tipo che ne identifichi la Forma in maniera univoca usando una enum.
 */
public class Main {
    public static void main(String[] args) {

        Triangolo triangolo = new Triangolo(TipoForma.Triangolo, 4, 8);
        Rettangolo rettangolo = new Rettangolo(TipoForma.Rettangolo, 6, 10);

        triangolo.calcolaArea();
        rettangolo.calcolaArea();

    }
}