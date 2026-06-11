
import java.util.Scanner;

public class Ejercicio2_9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double compra;
        double descuento;
        double precio_final;
        
        System.out.println("Digite la cantidad a pagar:");
        compra = Double.parseDouble(entrada.nextLine());
        
        if (compra > 100) {
            descuento = compra * 0.2;
        } else {
            descuento = 0;
        }
        
        precio_final = compra - descuento;
        
        System.out.println("El precio a pagar es: " + precio_final);
    }
}