import java.util.Scanner;
import java.util.InputMismatchException;
public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operaciones operaciones = new Operaciones();


        /** Probamos que el usuario introduzca datos correctos (números), para poder operar con ellos**/
        try{ System.out.println("Indica qué operación quieres realiza:\n 1.- Suma\n 2.- Resta\n 3.- Multiplicación\n 4.- División");
            final int operacion = sc.nextInt();
            System.out.println("Dame el primer número");
            final double  n1 = sc.nextInt();
            System.out.println("Dame el segundo número");
            final double  n2 = sc.nextInt();
            final double resultado = operaciones.operacion(n1,n2,operacion);
            if (resultado != 0.000000143546456543234212) {
                System.out.println("El resultado es " + resultado);
            }



        }catch(Exception ex){
            System.out.println("Por favor, introduzca una cifra");
        }



    }
}
