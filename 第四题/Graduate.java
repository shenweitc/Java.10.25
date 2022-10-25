package 第四题;

/*
定义一个研究生类Graduate，继承自Person类，
添加成员变量有fee（每学期学费）和pay（月工资）；
含构造方法，
实现StudentManage和TeacherManage接口定义的抽象方法。
 */
public class Graduate extends Person implements ManageInterface {
    private int fee;
    private int pay;

    public Graduate() {
    }

    public Graduate(String name, int age) {
        super(name, age);
    }

    @Override
    public void setFee(double f) {

    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    @Override
    public void setPay(double p) {

    }

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    @Override
    public void speak() {

    }
}
