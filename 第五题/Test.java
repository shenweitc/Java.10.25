package 第五题;
/*
分别实例化Circle和Square类，并分别打印输出类似下面的输出信息。
Circle
半径：XXX，面积XXX
Square
边长：XXX，面积XXX
 */

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入圆的半径：");
        int r1 = sc.nextInt();
        Circle circle=new Circle(r1);
        System.out.println("请输入正方形的半径：");
        int r2 = sc.nextInt();
        Square square=new Square(r2);
        double circleArea=circle.getArea();
        double squareArea=square.getArea();
        System.out.printf("Circle\n半径：%d,面积:%5.2f\n1",r1,circleArea);
        System.out.printf("square\n半径：%d,面积:%5.2f",r2,squareArea);

    }
}
