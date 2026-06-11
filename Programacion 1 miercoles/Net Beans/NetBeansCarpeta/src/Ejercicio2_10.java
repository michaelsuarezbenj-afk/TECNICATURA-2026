import java.util.Scanner;

public class Ejercicio2_10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Pedir valores de a y b
        System.out.print("Ingrese el valor de a: ");
        int a = entrada.nextInt();

        System.out.print("Ingrese el valor de b: ");
        int b = entrada.nextInt();

        // Calcular (a+b)^2 usando Math.pow
        double resultado = Math.pow(a + b, 2);

        // Mostrar resultado
        System.out.println("La fórmula (a+b)^2 = a^2 + b^2 + 2ab");
        System.out.println("El resultado de (" + a + " + " + b + ")^2 es: " + resultado);

        entrada.close();
    }
}
