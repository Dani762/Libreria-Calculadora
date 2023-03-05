import java.util.InputMismatchException;
public class Operaciones {


    /**
     * De esta manera, hacemos las operaciones. El n1 es un valor que nos da el usuario desde main, así como el n2. A través del número
     * operación, podemos saber qué operación quiere realizar.
     * @param n1 Valor dado por el usuario
     * @param n2 El segundo número dado por el usuario
     * @param operacion De esta manera, sabemos si es suma, resta, multiplicación o división
     * @return devolvemos el número
     */
    public final double operacion(double n1, double n2, int operacion){
        double resultado = 0;
        try{
            switch(operacion){
                case 1:
                    resultado = n1+n2;
                break;
                case 2:
                    resultado = n1-n2;
                    break;
                case 3:
                    resultado = n1*n2;
                    break;
                case 4:
                    resultado = n1/n2;
                    break;
                case 5:
                    resultado = Math.pow(n1,1.0/n2);
          }
        }catch(InputMismatchException ex){
            System.out.println(ex);
            System.out.println("Operación no válida, ingrese un número");
            resultado = 0.000000143546456543234212;
        }

        return resultado;
    }
}
