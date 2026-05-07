// Method Overloading (Same Name, Different Parameters)

class Area{
    // Method to calculate area of a circle
    double area(double radius){
        return 3.14 * radius * radius;
    }

    // Method to calculate area of a rectangle
    double area(double length, double width){
        return length * width;
    }

    // Method to calculate area of a triangle
    double area(double base, double height, String shape){
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Area a = new Area();

        double circleArea = a.area(5.0);
        System.out.println("Area of Circle: " + circleArea);

        double rectangleArea = a.area(4.0, 6.0);
        System.out.println("Area of Rectangle: " + rectangleArea);

        double triangleArea = a.area(4.0, 5.0, "triangle");
        System.out.println("Area of Triangle: " + triangleArea);
    }
}