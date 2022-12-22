package entradasalida1;
//importar libreria de Scanner
import java.util.Scanner;

/**
 *
 * @author EnriqueCocom
 */
 //Entrada y salida de datos.
public class EntradaSalida1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in); //Entrada de datos que guardaras.
       //int numero;
       //float numero;
       //double numero; 
       //String cadena;
       char letra;
       //System.out.print("Digite un número: ");
       System.out.print("Digite una cadena: ");
       //numero = entrada.nextInt(); //Guardar un valor entero.
       //numero = entrada.nextFloat();//Guardar un valor con punto decimal.
       //numero = entrada.nextDouble(); //Guardar un valor.
       //cadena = entrada.next();
       //cadena = entrada.nextLine(); //Guardar caracteres y espacios.
       letra = entrada.next().charAt(0); //Guarda el valor de la primera letra.
       //System.out.println("El número es: " + numero);
       
       System.out.println("La cadena es " + letra);
    }
}
