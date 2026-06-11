import java.util.Scanner;

public class Ejercicio3_9_2 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Ingrese un número de mes (1-12): ");
            int mes = entrada.nextInt();
            
            String estacion;
            
            estacion = switch (mes) {
                case 12, 1, 2 -> "Verano ️";
                case 3, 4, 5 -> "Otoño ";
                case 6, 7, 8 -> "Invierno ️";
                case 9, 10, 11 -> "Primavera ";
                default -> "Mes inválido ";
            };
            
            System.out.println("El mes " + mes + " corresponde a la estación: " + estacion);
        }
    }
}
