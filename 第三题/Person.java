package 第三题;
/*
Person类包含属性班级banji和姓名name；
有构造方法Person(String banji,String name),
有toString方法显示信息
 */
public class Person {
    private String banji;
    private String name;

    public Person() {
    }

    public Person(String banji, String name) {
        this.banji = banji;
        this.name = name;
    }

    /**
     * 获取
     * @return banji
     */
    public String getBanji() {
        return banji;
    }

    /**
     * 设置
     * @param banji
     */
    public void setBanji(String banji) {
        this.banji = banji;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Person{banji = " + banji + ", name = " + name + "}";
    }
}
