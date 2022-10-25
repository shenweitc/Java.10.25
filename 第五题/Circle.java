package 第五题;

public class Circle extends Shape{
    //Circle类声明一个radius（半径）属性
    private int radius;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }
}
