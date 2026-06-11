import java.util.Scanner;

public class Ejercicio_4_9_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese una calificación (0-10): ");
        int nota = entrada.nextInt();

        String resultado;

        switch (nota) {
            case 10:
            case 9:
                resultado = "A (Excelente) ";
                break;
            case 8:
                resultado = "B (Muy bien) ";
                break;
            case 7:
                resultado = "C (Bien) ";
                break;
            case 6:
                resultado = "D (Regular) ️";
                break;
            case 5: case 4: case 3: case 2: case 1: case 0:
                resultado = "F (Reprobado) ";
                break;
            default:
                resultado = "Calificación inválida ";
        }

        System.out.println("La nota ingresada corresponde a: " + resultado);

        entrada.close();
    }
}
