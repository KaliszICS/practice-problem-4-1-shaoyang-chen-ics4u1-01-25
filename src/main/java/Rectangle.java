public class Rectangle {
    private double length;
    private double width;

    // 构造函数
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Getter 方法
    public double getLength() {
        return length;
    }

    // Setter 方法
    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    // 计算面积
    public double area() {
        return length * width;
    }

    // 计算周长
    public double perimeter() {
        if (length == 0 || width == 0) {
            return 0;
        }
        return 2 * (length + width);
    }
}
