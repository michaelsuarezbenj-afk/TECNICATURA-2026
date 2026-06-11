import java.util.Scanner;

public class Ejercicio3_10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Pedir las calificaciones
        System.out.print("Ingrese la calificación de participación (0-10): ");
        double participacion = entrada.nextDouble();

        System.out.print("Ingrese la calificación del primer examen parcial (0-10): ");
        double primerParcial = entrada.nextDouble();

        System.out.print("Ingrese la calificación del segundo examen parcial (0-10): ");
        double segundoParcial = entrada.nextDouble();

        System.out.print("Ingrese la calificación del examen final (0-10): ");
        double examenFinal = entrada.nextDouble();

        // Calcular la nota final con ponderaciones
        double notaFinal = (participacion * 0.10) +
                           (primerParcial * 0.25) +
                           (segundoParcial * 0.25) +
                           (examenFinal * 0.40);

        // Mostrar resultado
        System.out.println("La calificación final del estudiante es: " + notaFinal);

        entrada.close();
    }
}
