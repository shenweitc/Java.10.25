package 第四题;
/*
设计两个信息管理接口StudentManage和TeacherManage。
其中StudentManage接口包括setFee(double f) 和getFee()方法，分别用于设置和获取学生的学费；
TeacherManage接口包括setPay(double p)和getPay()方法，分别用于设置和获取教师工资。
 */
public interface ManageInterface extends StudentManage,TeacherManage{
}
interface StudentManage{
    void setFee(double f);
    int getFee();
}
interface TeacherManage{
    void setPay(double p);
    int getPay();
}

