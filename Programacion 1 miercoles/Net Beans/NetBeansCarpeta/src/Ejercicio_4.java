// Ejemplo de tipos primitivos en Java

public class Ejercicio_4 {
    public static void main(String[] args) {
        
        // Tipo byte
        byte numEnteroByte = 127;
        System.out.println("numEnteroByte = " + numEnteroByte);
        System.out.println("Valor mínimo del byte: " + Byte.MIN_VALUE);
        System.out.println("Valor máximo del byte: " + Byte.MAX_VALUE);

        // Tipo short
        short numEnteroShort = 32767;
        System.out.println("numEnteroShort = " + numEnteroShort);
        System.out.println("Valor mínimo del short: " + Short.MIN_VALUE);
        System.out.println("Valor máximo del short: " + Short.MAX_VALUE);

        // Tipo int
        int numEnteroInt = 2147483647;
        System.out.println("numEnteroInt = " + numEnteroInt);
        System.out.println("Valor mínimo del int: " + Integer.MIN_VALUE);
        System.out.println("Valor máximo del int: " + Integer.MAX_VALUE);

        // Tipo long
        long numEnteroLong = 10;
        System.out.println("numEnteroLong = " + numEnteroLong);
        System.out.println("Valor mínimo del long: " + Long.MIN_VALUE);
        System.out.println("Valor máximo del long: " + Long.MAX_VALUE);

        // Tipo float
        float numFloat = 3.4028235E38F;
        System.out.println("numFloat = " + numFloat);
        System.out.println("Valor mínimo del float: " + Float.MIN_VALUE);
        System.out.println("Valor máximo del float: " + Float.MAX_VALUE);

        // Tipo double
        double numDouble = 1.7976931348623157E308D;
        System.out.println("numDouble = " + numDouble);
        System.out.println("Valor mínimo del double: " + Double.MIN_VALUE);
        System.out.println("Valor máximo del double: " + Double.MAX_VALUE);
    }
}
