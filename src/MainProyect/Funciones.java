package MainProyect;

public class Funciones {

    public void contar(double monto) {

        double[] denominaciones= {200, 100, 50, 20, 10,5, 1, 0.50, 0.25, 0.10, 0.05};
        double saldo = monto;


        for (double i :denominaciones){

            if (saldo>0.05){
                int x=0;

                while(saldo>=i){
                    saldo-=i;
                    x=x+1;
                }
                if (x>0){
                    if (i>0){
                        System.out.println(x +" billetes de "+ i +" pesos" );
                    }else {
                        System.out.println(x +" monedas de "+ i +" centavos" );
                    }
                }

            }else{
                break;
            }



        }



    }

}
