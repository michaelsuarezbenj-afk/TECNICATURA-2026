import java.util.Scanner;

public class SumaEnClase_8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("=== SUMA DE TRES CALIFICACIONES ===");
        
        System.out.println("Digite la primera calificacion: ");
        double cal1 = Double.parseDouble(entrada.nextLine());
        
        System.out.println("Digite la segunda calificacion: ");
        double cal2 = Double.parseDouble(entrada.nextLine());
        
        System.out.println("Digite la tercera calificacion: ");
        double cal3 = Double.parseDouble(entrada.nextLine());
        
        // Calculamos la suma
        double suma = cal1 + cal2 + cal3;
        
        System.out.println("\n========== RESULTADO ==========");
        System.out.println("Calificacion 1: " + cal1);
        System.out.println("Calificacion 2: " + cal2);
        System.out.println("Calificacion 3: " + cal3);
        System.out.println("Suma total: " + suma);
        System.out.println("===============================");
    }
}