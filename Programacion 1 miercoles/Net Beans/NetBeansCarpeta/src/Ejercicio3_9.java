import java.util.Scanner;

public class Ejercicio3_9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double num1, num2, resultado;
        
        System.out.println("Digite dos numeros:");
        num1 = Double.parseDouble(entrada.nextLine());
        num2 = Double.parseDouble(entrada.nextLine());
        
        if (num1 == num2) {
            resultado = num1 * num2;
        } else if (num1 > num2) {
            resultado = num1 - num2;
        } else {
            resultado = num1 + num2;
        }
        
        System.out.println("El resultado es: " + resultado);
    }
}