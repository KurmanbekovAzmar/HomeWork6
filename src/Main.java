public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setPi(3.14);
        circle.setRadius(20);
        Circle.area(circle.getPi(), circle.getRadius());
        Circle.circumference(circle.getPi(), circle.getRadius());
    }
}