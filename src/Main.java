import javax.swing.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String msj = JOptionPane.showInputDialog(null, "Bienevenido ingrese un numero del 1 al 23  para seleccionar que ejercicio deseado");

        switch (msj) {

            case "1":
                System.out.println("Ingrese un numero decimal");
                Double num = sc.nextDouble();


                /*int numEntero=(int) num; */
//                int numEntero=(int)Math.round(num);
                int numEntero = num.intValue();

                /*long numLong=(long) num;*/
                Long numLong =num.longValue();
                String numString = String.format("%.4f", num);/* Con este casteo podemos legir la cantidad de decimales que admitiremos para ser expresado como cadena*/
                Short numShort = num.shortValue();
                float numFloat = num.floatValue();

                System.out.println(num + " en entero: " + numEntero);
                System.out.println(num + " en long: " + numLong);
                System.out.println(num + " en String: " + numString);
                System.out.println(num + " en short: " + numShort);
                System.out.println(num + " en float: " + numFloat);
                break;

            case "2":
                System.out.println("Ingrese un numerito ");
                Long numL = sc.nextLong();
                System.out.println(numL );
                //si se ingresa una numero de tamaño mayor a long nos arroja un error de tipo ; "java.util.InputMismatchException"
                // se podria solucionar haciendo una verificacion con while o previamente casteando el resultado siempre y cuando tomar un valor mas grande del especificado no interfiera con el correcto compartamiento del programa
                break;

            case "3":
                System.out.println("Ingrese un numero ");
                int numIngresado= sc.nextInt();
                if(numIngresado<100 || numIngresado>=1000){
                    do {
                        System.out.println("el numero ingresado no es de 3 cifras, por favor");
                        System.out.println("Ingrese un numero de 3 cifras");
                        numIngresado = sc.nextInt();
                    }while(numIngresado<100 || numIngresado>=1000);
                }
                int suma = 0;
                int x = numIngresado;
                suma= suma + (x%10);
                x = x/10;
                suma= suma + (x%10);
                x = x/10;
                suma= suma + (x%10);
                System.out.println("la suma de los digitos del numero "+numIngresado+" es: "+suma);

        }


    }
}