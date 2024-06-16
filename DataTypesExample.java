public class DataTypesExample {

    public static void main(String[] args) {
        // Integer data types
        byte byteVar = 127;          // 8-bit signed integer
        short shortVar = 32767;      // 16-bit signed integer
        int intVar = 2147483647;     // 32-bit signed integer
        long longVar = 9223372036854775807L; // 64-bit signed integer

        // Floating-point data types
        float floatVar = 3.14f;      // 32-bit floating point
        double doubleVar = 3.141592653589793; // 64-bit floating point

        // Character data type
        char charVar = 'A';          // 16-bit Unicode character

        // Boolean data type
        boolean booleanVar = true;   // true or false

        // String (not a primitive data type, but very commonly used)
        String stringVar = "Hello, World!"; // Sequence of characters

        // Print the values
        System.out.println("Byte value: " + byteVar);
        System.out.println("Short value: " + shortVar);
        System.out.println("Int value: " + intVar);
        System.out.println("Long value: " + longVar);
        System.out.println("Float value: " + floatVar);
        System.out.println("Double value: " + doubleVar);
        System.out.println("Char value: " + charVar);
        System.out.println("Boolean value: " + booleanVar);
        System.out.println("String value: " + stringVar);

        // Demonstrating type casting
        double doubleFromInt = intVar; // Implicit casting (int to double)
        int intFromDouble = (int) doubleVar; // Explicit casting (double to int)

        System.out.println("Double from Int (implicit casting): " + doubleFromInt);
        System.out.println("Int from Double (explicit casting): " + intFromDouble);

        // Demonstrating the use of Wrapper classes
        Integer wrappedInt = Integer.valueOf(intVar); // Boxing
        int unwrappedInt = wrappedInt.intValue(); // Unboxing

        System.out.println("Wrapped Integer: " + wrappedInt);
        System.out.println("Unwrapped Integer: " + unwrappedInt);
    }
}
