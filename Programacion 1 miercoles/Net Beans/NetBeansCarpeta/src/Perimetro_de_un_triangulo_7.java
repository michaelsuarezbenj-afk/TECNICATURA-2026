import java.util.Scanner;

public class Perimetro_de_un_triangulo_7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite la base del rectangulo: ");
        double base = Double.parseDouble(entrada.nextLine());

        System.out.print("Digite la altura del rectangulo: ");
        double altura = Double.parseDouble(entrada.nextLine());

        double area = base * altura;
        double perimetro = 2 * (base + altura);

        System.out.println("El area del rectangulo es: " + area);
        System.out.println("El perimetro del rectangulo es: " + perimetro);
    }
}