package MainProyect;

public class Fraccion {

    private int numerador;
    private int denominador;

    public Fraccion() {
        numerador = 0;
        denominador = 0;

    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public Fraccion sumarFraccion(Fraccion fraccion1, Fraccion fraccion2) {

        int denom1 = fraccion1.getDenominador();
        int denom2 = fraccion2.getDenominador();
        int numerador1 = fraccion1.getNumerador();
        int numerador2 = fraccion2.getNumerador();
        int numResultado = ((denom1*denom2) /numerador1) + ((denom2*denom1)/numerador2);
        Fraccion fraccion = new Fraccion();
        fraccion.setDenominador(denom2*denom1);
        fraccion.setNumerador(numResultado);
        return fraccion;

    }

    public Fraccion restarFraccion(Fraccion fraccion1, Fraccion fraccion2) {

        int denom1 = fraccion1.getDenominador();
        int denom2 = fraccion2.getDenominador();
        int numerador1 = fraccion1.getNumerador();
        int numerador2 = fraccion2.getNumerador();
        int numResultado = ((denom1*denom2) /numerador1) - ((denom2*denom1)/numerador2);
        Fraccion fraccion = new Fraccion();
        fraccion.setDenominador(denom2*denom1);
        fraccion.setNumerador(numResultado);
        return fraccion;

    }

    public Fraccion multiplicacionFraccion(Fraccion fraccion1, Fraccion fraccion2) {

        int denom1 = fraccion1.getDenominador();
        int denom2 = fraccion2.getDenominador();
        int numerador1 = fraccion1.getNumerador();
        int numerador2 = fraccion2.getNumerador();
        Fraccion fraccion = new Fraccion();
        fraccion.setDenominador(denom2*denom1);
        fraccion.setNumerador(numerador1*numerador2);
        return fraccion;

    }

    public Fraccion dividirFraccion(Fraccion fraccion1, Fraccion fraccion2) {
        int denom1 = fraccion1.getDenominador();
        int denom2 = fraccion2.getDenominador();
        int numerador1 = fraccion1.getNumerador();
        int numerador2 = fraccion2.getNumerador();
        Fraccion fraccion = new Fraccion();
        fraccion.setDenominador(denom1*numerador2);
        fraccion.setNumerador(denom2*numerador1);
        return fraccion;


    }




}
