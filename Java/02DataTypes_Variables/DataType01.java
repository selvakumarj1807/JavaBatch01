public class DataType01 {
    public static void main(String[] args) {
        byte b = 127; // 1 byte, -128 ~ 127
        short s = 32767; // 2 bytes, -32768 ~ 32767
        int i = 2147483647; // 4 bytes, -2147483648 ~ 2147483647
        long l = 9223372036854775807L; // 8 bytes, -9223372036854775808 ~ 9223372036854775807

        float f = 3.14f; // 4 bytes, 
        double d = 3.141592653589793; // 8 bytes,

        char c = 'A'; // 2 bytes, 

        boolean bool = true; // 1 byte, true or false

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);
    }
}