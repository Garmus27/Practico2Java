package MainProyect;

import javax.swing.*;
import java.util.Date;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Funciones funciones = new Funciones();

        String msj = JOptionPane.showInputDialog(null, "Bienevenido ingrese un numero del 1 al 23  para seleccionar que ejercicio deseado");

        switch (msj) {

            case "1":
                System.out.println("Ingrese un numero decimal");
                Double num = sc.nextDouble();


                //*int numEntero=(int) num; *//*
//                int numEntero=(int)Math.round(num);
                int numEntero = num.intValue();

                //*long numLong=(long) num;*//*
                Long numLong = num.longValue();
                String numString = String.format("%.4f", num);//* Con este casteo podemos legir la cantidad de decimales que admitiremos para ser expresado como cadena*//*
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
                System.out.println(numL);
                //si se ingresa una numero de tamaño mayor a long nos arroja un error de tipo ; "java.util.InputMismatchException"
                // se podria solucionar haciendo una verificacion con while o previamente casteando el resultado siempre y cuando tomar un valor mas grande del especificado no interfiera con el correcto compartamiento del programa
                break;

            case "3":
                System.out.println("Ingrese un numero ");
                int numIngresado = sc.nextInt();
                if (numIngresado < 100 || numIngresado >= 1000) {
                    do {
                        System.out.println("el numero ingresado no es de 3 cifras, por favor");
                        System.out.println("Ingrese un numero de 3 cifras");
                        numIngresado = sc.nextInt();
                    } while (numIngresado < 100 || numIngresado >= 1000);
                }
                int suma = 0;
                int x = numIngresado;
                suma = suma + (x % 10);
                x = x / 10;
                suma = suma + (x % 10);
                x = x / 10;
                suma = suma + (x % 10);
                System.out.println("la suma de los digitos del numero " + numIngresado + " es: " + suma);

            case "4":
                System.out.println("Ingrese un monto: ");
                double monto = sc.nextDouble();
                funciones.contar(monto);

            case "5":
                System.out.println("ingrese un numero");
                int n = sc.nextInt();

                String nString = String.valueOf(n);
                System.out.println(nString);

            case "6":
                System.out.println("Ingrese una palabra o frase cuaqluiera");
                String frase = sc.next();
                int longFrase = frase.length();
                System.out.println("la longitud de la frase es " + longFrase);

            case "7":
                System.out.println("Ingrese una cadena de texto");
                String texto = sc.next();
                int textoLength = texto.length();
                String[] vocales = {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};
                int contaadorVocales = 0;

                for (int i = 0; i < textoLength; i++) {
                    for (int j = 0; j < vocales.length; j++) {
                        if (String.valueOf(texto.charAt(i)).equals(vocales[j])) {
                            contaadorVocales++;
                        }
                    }
                }
                System.out.println(contaadorVocales);
            case "8":
                System.out.println("una palabra");
                String palabra = sc.next();
                System.out.println(palabra.replace("a", "e"));

            case "9":
                System.out.println("ingrese una cadena");
                String cadena = sc.next();
                for (int i = 0; i < cadena.length(); i++) {
                    char caracter = cadena.charAt(i);
                    int cdgASCII = (int) caracter;
                    System.out.print(cdgASCII + " ");
                }
            case "10":
                System.out.println("ingrese una cadena");
                String cadena2 = sc.next();
                int chose = 0;
                boolean out = false;
                do {
                    System.out.println(" si desea convertir la cadena a mayuscula presione 1");
                    System.out.println(" si desea convertir la cadena a minuscula presione 2");
                    chose = sc.nextInt();
                    if (chose == 1) {
                        System.out.println(cadena2.toUpperCase());
                        out = true;
                    } else if (chose == 2) {
                        System.out.println(cadena2.toLowerCase());
                        out = true;
                    } else {
                        System.out.println(" error! : Opcion ingresada no valida, intente nuevamente");

                    }

                } while (out == false);
            case "11":
                System.out.println("ingrese dos palabras");
                String word1 = sc.next();
                String word2 = sc.next();

                if (word1.equals(word2)) {
                    System.out.println("estas palabras son iguales");

                } else {
                    System.out.println("estas palabras no son iguales");
                }
                ;
            case "12":

                System.out.println("ingrese una palabra de minimo 5 caraceteres");
                String word3 = sc.next();
                if (word3.length() < 5) {
                    do {
                        System.out.println("La palabra ingresada no cumple con la lingitud minima, ingrese una nueva palabra");
                        word3 = sc.next();
                    } while (word3.length() < 5);
                }
                System.out.println(word3.substring(3, 5));
            case "13":
                System.out.println("Ingrese una cadena de texto");
                String texto2 = sc.next();
                System.out.println("ingrese una segunda cadena de texto");
                String texto3 = sc.next();

                if (texto2.contains(texto3)) {
                    System.out.println("La palabra " + texto3 + " esta contenida en la cadena " + texto2);
                } else if (texto3.contains(texto2)) {
                    System.out.println(("La palabra " + texto2 + " esta contenida en la cadena " + texto3));
                } else {
                    System.out.println("Ninguna de las dos palabras se encuentra dentro de la otra");
                }
            case "15":

                //int numero = null; //Esto produce un error porque el tipo primitivo int no admite valores nulos.
                // para solucionarlo basta con cambiarlo al tipo objeto INTEGER
                Integer numero = null;

            case "16":
                // Java permite la conversion directa entre Double y double
                Double nd = 3.14;
                double n2 = nd;

            case "17":

                Date fechaACtual = new Date();
                System.out.println(FuncionesPrograma.getFechaString((java.sql.Date) fechaACtual));

            case "18":

                System.out.println("Por favor ingrese la fecha en el siguiente formato dd/mm/aaaa");
                int dia = Integer.parseInt(sc.next());
                int mes = Integer.parseInt(sc.next());
                int año = Integer.parseInt(sc.next());
                System.out.println(FuncionesPrograma.getFechaDate(dia, mes, año));

            case "19":
                System.out.println("ingrese una operacion a realizar");
                int num1 = Integer.parseInt(sc.next());
                int num2 = Integer.parseInt(sc.next());
                OperacionMatematica om = new OperacionMatematica();
            case "20":

                Fraccion f1 = new Fraccion();
                Fraccion f2 = new Fraccion();
                Fraccion f3 = new Fraccion();

                f1.setNumerador(2);
                f1.setDenominador(5);

                f2.setNumerador(3);
                f2.setNumerador(7);

                f3.sumarFraccion(f1, f2);
                System.out.println(f3);

            case "21":

                System.out.println("ingrese un numero");
                int nmbr = Integer.parseInt(sc.next());
                int suma21 = funciones.sumatoriaRecursiva(nmbr);
                System.out.println(suma21);
            case "22":

                System.out.println("ingrese un numero de no mas de 4 cifras");
                int nmbr2 = Integer.parseInt(sc.next());

                System.out.println(funciones.sumatoriaDigitos(nmbr2));

            case "23":

                System.out.println("ingrese una cadena de texto");

                String cad = sc.next();

                System.out.println(funciones.cadenaInversa(cad));










        }

    }

}