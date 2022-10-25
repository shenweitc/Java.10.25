package 第四题;

public class Test {
    public static void main(String[] args) {
        Graduate graduate=new Graduate("张三",20);
        graduate.setFee(7000);
        graduate.setPay(800);
        int result=graduate.getFee()-graduate.getPay()*12;
        if(result<2000){
            //显示“需要贷款”信息
            System.out.println("需要贷款");
        }else {
            //显示“无需贷款”信息
            System.out.println("无需贷款");
        }
    }
}
