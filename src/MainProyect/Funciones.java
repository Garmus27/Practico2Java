package MainProyect;

import java.sql.Array;
import java.util.Arrays;

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

    public int sumatoriaRecursiva (int num){

        if (num==1){
            return 1;
        }else {
            return num + sumatoriaRecursiva(num-1);
        }
    }

    public int sumatoriaDigitos (int num) {
        if (num==0){
            return 0;
        }else {
            return  sumatoriaDigitos(num/10)+num%10;
        }

    }

    public String cadenaInversa (String cadena){

        ;

        if (cadena.length() == 8){


        }else{

            cadena.concat(String.valueOf(cadena.charAt(cadena.length()-1)));
            System.out.println(cadena.charAt(cadena.length()-1));

            return cadena.concat();

        }


    }
}
