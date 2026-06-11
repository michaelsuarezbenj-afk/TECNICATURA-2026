import java.util.Scanner;

public class Ejercicio1_9_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = entrada.nextInt();

        if (numero > 0) {
            System.out.println("El número " + numero + " es POSITIVO ");
        } else if (numero < 0) {
            System.out.println("El número " + numero + " es NEGATIVO ");
        } else {
            System.out.println("El número es CERO ️");
        }

        entrada.close();
    }
}
