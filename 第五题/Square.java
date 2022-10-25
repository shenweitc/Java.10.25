package 第五题;

public class Square extends Shape{
    //Square类中声明一个border（边长）属性。
    private int border;

    public Square() {
    }

    public Square(int border) {
        this.border = border;
    }

    public int getBorder() {
        return border;
    }

    public void setBorder(int border) {
        this.border = border;
    }

    public double getArea(){
        return border*border;
    }
}
