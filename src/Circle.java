public class Circle {
    private double radius = 1.0;
    private String color = "red";
    Circle(){
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return radius;
    }

    double getArea(){
        double area = Math.PI * Math.pow(radius,2);
        return area;
    }
}
