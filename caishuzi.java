import java.util.Scanner;
public class cai {
    public static void main(String[] args) {
        //定义全局变量
        float num;
        float com_num = 0.0f;
        int i = 3;
        String reg = "^[0-9][0-9]$";

        //输入数字
        Scanner input= new Scanner(System.in);
        com_num = Math.round(Math.random()*100);

        while (i >= 0){
            System.out.println("请输入数字：");
            num = input.nextFloat();
            if (num < com_num){
                System.out.println("猜小了！你还有" + i + "次机会");
            }else if(num > com_num){
                System.out.println("猜大了！你还有" + i + "次机会");
            }else {
                System.out.println("恭喜你猜对了！");
                i = 0;
            }
            i--;
        }



    }
}