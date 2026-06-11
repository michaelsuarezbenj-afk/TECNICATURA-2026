import java.util.Scanner;

public class Mayor_Numeros_7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("==== MAYOR DE DOS NUMEROS ====");
        System.out.println("Digite el primer numero: ");
        int num1 = Integer.parseInt(entrada.nextLine());
        
        System.out.println("Digite el segundo numero: ");
        int num2 = Integer.parseInt(entrada.nextLine());
        
        // Operador ternario: (condicion) ? valor_true : valor_false
        int mayor = (num1 > num2) ? num1 : num2;
        
        String mensaje = (num1 == num2) ? "Los numeros son iguales" : "El mayor es: " + mayor;
        
        System.out.println("\n========== RESULTADO ==========");
        System.out.println("Numero 1: " + num1);
        System.out.println("Numero 2: " + num2);
        System.out.println(mensaje);
        System.out.println("===============================");
    }
}