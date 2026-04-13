public class WithOutStatic04 {
    void show() {
        System.out.println("With Out Static04 show() method");
    }

    public static void main(String[] args) {
        WithOutStatic04 obj01 = new WithOutStatic04();  // create object
        obj01.show();                                   // call method

        WithOutStatic04 obj02 = new WithOutStatic04();  // create object
        obj02.show();                                   // call method
    }

}
