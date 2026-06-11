import java.util.Scanner;

public class LibroNetBeans_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Pedir el nombre del libro
        System.out.print("Digite el nombre del libro: ");
        String nombreLibro = entrada.nextLine();

        // Pedir el autor del libro
        System.out.print("Digite el autor del libro: ");
        String nombreAutor = entrada.nextLine();

        // Mostrar resultado
        System.out.println(nombreLibro + " fue escrito por " + nombreAutor);

        entrada.close();
    }
}
