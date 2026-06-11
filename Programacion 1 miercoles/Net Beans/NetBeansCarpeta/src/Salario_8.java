import java.util.Scanner;

public class Salario_8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final double salarioBase = 1000;
        final double comisionPorCarro = 150;
        double carrosVendidos, precioCarro;
        double totalVentas, comisionVentas, salarioMensual;

        System.out.print("Digite la cantidad de carros vendidos: ");
        carrosVendidos = Double.parseDouble(entrada.nextLine());

        System.out.print("Digite el precio de un carro: ");
        precioCarro = Double.parseDouble(entrada.nextLine());

        totalVentas = carrosVendidos * precioCarro;
        comisionVentas = carrosVendidos * comisionPorCarro;
        salarioMensual = salarioBase + comisionVentas + (totalVentas * 0.05);

        System.out.println("\nEl salario mensual es: $" + salarioMensual);
    }
}