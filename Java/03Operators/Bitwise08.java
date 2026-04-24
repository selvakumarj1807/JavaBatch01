public class Bitwise08 {
    public static void main(String[] args) {
        int a = 10; 
        int b = 2; 

        // Bitwise AND
        int result = a & b; 
        System.out.println("Bitwise AND : " + result); 

        // Bitwise OR
        int result2 = a | b;
        System.out.println("Bitwise OR : " + result2);

        // Bitwise XOR
        int result3 = a ^ b;
        System.out.println("Bitwise XOR : " + result3);

        // Bitwise NOT

        int result4 = ~a;
        System.out.println("Bitwise NOT : " + result4);
    }
}


/*

// Bitwise AND

a = 10 -> 1010
b = 2  -> 0010 // 0 = False, 1 = True. Any One have False Then Everything will be False. Only Both have True Then It will be True.
--------------
a & b =>  0010 -> 2

// Bitwise OR

a = 10 -> 1010
b = 2  -> 0010 // 0 = False, 1 = True. Any One have True Then Everything will be True.
--------------
a | b =>  1010 -> 10

// Bitwise XOR

a = 10 -> 1010
b = 2  -> 0010 // 0 = False, 1 = True. Both values are True or False Then return False. Any One have different value Then return True.
--------------
a ^ b =>  1000 -> 8

// Bitwise NOT

a = 10

~a = -(a + 1)
~a = -(10 + 1) = -11

*/