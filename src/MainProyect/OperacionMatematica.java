package MainProyect;

public class OperacionMatematica {

    double valor1;
    double valor2;
    String operacion;

    public double getvalor1() {
        return valor1;
    }

    public void setvalor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getvalor2() {
        return valor2;
    }

    public void setvalor2(double valor2) {
        this.valor2 = valor2;
    }

    private double sumarNumeros(){
        return valor1 + valor2;
    }
    private double restarNumeros(){
        return valor1 - valor2;
    }
    private double multiplicarNumeros(){
        return valor1 * valor2;
    }
    private double dividirNumeros(){
        return valor1 / valor2;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
    public double aplicarOperacion(String operacion){

        if(operacion.equals("+")){
            return sumarNumeros();
        }else if(operacion.equals("-")){
            return restarNumeros();
        }else if(operacion.equals("*")){
            return multiplicarNumeros();
        }else{
            return dividirNumeros();
        }

    }

}
