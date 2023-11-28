import java.util.Scanner;

// Calcular el volumen y la superficie de una esfera

public class Main {

    static int radio;                                                // Introducimos la variable radio

        static double calculaSuperficie () {                        // Iniciamos la funcion que caluclará la superficie
            double superficie;

            superficie = 4 * Math.PI * Math.pow(radio, 2);          // Le asignamos a la superficie su fórmula

            return (superficie);                                       // Decimos que nos devuelva el valor de superficie
        }

        static double calculaVolumen () {                                // Iniciamos la funcion que caluclará el volumen
            double volumen;

            volumen = ((4 * Math.PI) / 3) * Math.pow(radio, 3);         //Le asignamos al volumen su fórmula

            return (volumen);                                            // Le decimos que nos devuelva el valor del volumen
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Introduzca el radio (real): ");           // Le pedimos al usuario que nos asigne el valor del radio
            radio = sc.nextInt();

            System.out.println("La superficie de la esfera es = " + calculaSuperficie());           //Imprimimos el resultado de nuestras funciones
            System.out.println("El volumen de la esfera es = " + calculaVolumen());
        }




    }
