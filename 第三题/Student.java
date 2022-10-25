package 第三题;
/*
Student类继承Person类，
有语文，数学，英语三门课程成绩chinese,math,english。
有构造方法，计算总分方法sum，可以显示各科成绩和总分。
 */
public class Student extends Person{
    private int chinese;
    private int math;
    private int english;

    public Student() {
    }

    public Student(String banji, String name) {
        super(banji, name);
    }

    public Student(int chinese, int math, int english) {
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    public Student(String banji, String name, int chinese, int math, int english) {
        super(banji, name);
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    //计算总分方法sum
    public void sum(){
        int sum=chinese+math+english;
        System.out.println("姓名："+super.getName()+" 班级："+super.getBanji());
        System.out.println("语文："+chinese+" 数学："+math+" 英语："+english+" 总分："+sum);
    }


}
