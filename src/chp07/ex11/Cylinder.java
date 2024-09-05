package chp07.ex11;

public class Cylinder {
    int radius;
    int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    double getvolume() {
        return Math.PI * radius * radius * height;
    }

    double getsurfaceArea() {
        double circleArea = Math.PI * radius * radius;
        double rectangleArea = 2 * height * Math.PI * radius;
        return 2 * circleArea + rectangleArea;
    }
}
