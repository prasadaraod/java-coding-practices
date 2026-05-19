public class DataTypesExample {
    public static void main(String[] args) {
        // Primitive Data Types
        byte b = 100;
        short s = 10000;
        int i = 100000;
        long l = 100000L;
        float f = 234.5f;
        double d = 123.4;
        boolean bool = true;
        char c = 'A';

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("boolean: " + bool);
        System.out.println("char: " + c);
        
        // Operators
        int result = i + 50;
        System.out.println("Addition: " + result);
        System.out.println("Modulus: " + (result % 3));
    }
}
