public class Circle {
    private double radius;
    private static final double PI = 3.14; // 使用3.14作为PI

    // 构造函数
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter 方法
    public double getRadius() {
        return radius;
    }

    // Setter 方法
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // 计算面积
    public double area() {
        return PI * radius * radius;
    }

    // 计算周长
    public double circumference() {
        return 2 * PI * radius;
    }
}