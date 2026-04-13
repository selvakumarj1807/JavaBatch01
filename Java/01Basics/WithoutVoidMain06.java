public class WithoutVoidMain06 {
    int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        WithoutVoidMain06 obj01 = new WithoutVoidMain06();
        int result01 = obj01.add(10, 2);
        System.out.println("The sum is: " + result01);

        WithoutVoidMain06 obj02 = new WithoutVoidMain06();
        int result02 = obj02.add(10, 5);
        System.out.println("The sum is: " + result02);
    }
}
