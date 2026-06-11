import java.util.Scanner;

public class UTN_10_Ejercicio1 {
public class UTN_10_Ejercicio1 {
    
}

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int i = 1;
        double horas, tarifa, salario;
        double suma = 0;

        while (i <= 5) {

            System.out.println("\nSalario del empleado " + i);

            System.out.print("Digite las horas trabajadas: ");
            horas = entrada.nextDouble();

            System.out.print("Digite la tarifa por hora: ");
            tarifa = entrada.nextDouble();

            salario = horas * tarifa;

            System.out.println("El salario es: $" + salario);

            suma += salario;

            i++;
        }

        System.out.println("\nLa suma de todos los salarios es: $" + suma);

        entrada.close();
    }
