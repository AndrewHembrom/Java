import java.lang.String;

public class Variables {
    public static void main(String[] args) {

        // Primitive Types
        byte b = 100; // 8-bit signed two's complement integer -128 to 127 (can be useful in saving memory in large arrays)
        short s = 100; // 16-bit signed two's complement integer -32768 to 32767
        int i = 26; // 32-bit signed two's complement integer -2^31 to (2^31)-1
        int hexInt = 0x1a; // Hexadeciaml Int - starts with 0x
        int binInt = 0b11010; // Binary Int - starts with 0b
        long l = 100; // 64-bit signed two's complement integer -2^63 to (2^63)-1
        float f = 100.301f; // single precision 32-bit floating point
        double d = 100.321; //  double precision 64 bit floating point
        boolean bool = true; // Can be either true or false
        char c = 'a'; // single 16-bit unicode
        String st = "This is a String"; // Not a primitive type but java supports it usng java.lang.String. THey are immutable

        
        System.out.println("Byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Int: " + i);
        System.out.println("hexInt: " + hexInt);
        System.out.println("binInt: " + binInt);
        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("Boolean: " + bool);
        System.out.println("Char: " + c);
        System.out.println("String: " + st);
    }
}