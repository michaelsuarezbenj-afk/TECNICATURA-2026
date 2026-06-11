import java.util.Scanner;

public class Ejercicio1_10{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Pedir el total de horas
        System.out.print("Ingrese el número total de horas: ");
        int totalHoras = entrada.nextInt();

        // Calcular semanas, días y horas
        int semanas = totalHoras / (7 * 24); // 1 semana = 7 días * 24 horas
        int horasRestantes = totalHoras % (7 * 24);

        int dias = horasRestantes / 24;      // 1 día = 24 horas
        int horas = horasRestantes % 24;

        // Mostrar resultado
        System.out.println(totalHoras + " horas equivalen a:");
        System.out.println(semanas + " semanas, " + dias + " días y " + horas + " horas.");

        entrada.close();
    }
}
