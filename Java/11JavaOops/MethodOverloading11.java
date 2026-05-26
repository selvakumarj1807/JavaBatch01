class Calculater {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloading11 {
    public static void main(String[] args) {
        Calculater calc = new Calculater();
        
        int sum1 = calc.add(5, 10);
        double sum2 = calc.add(3.5, 4.5);

        System.out.println("Sum of integers: " + sum1);
        System.out.println("Sum of doubles: " + sum2);
    }
}
