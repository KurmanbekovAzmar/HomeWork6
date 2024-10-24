public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setPi(3.14);
        circle.setRadius(20);
        circle.area();
        Circle.circumference(circle.getPi(), circle.getRadius());
    }
}