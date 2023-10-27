import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class MyTest {
    public static void main(String[] args) {
        /*先定义变量*/
        /*第一个：输入设备*/
        Scanner scanner=new Scanner(System.in);
        /*第二个变量：姓名和考号，不清楚就只写类型和变量名，防止输入出错，赋初值，这里初始值为空*/
        String name="";
        String no="";
        /*第三个变量：成绩。对于成绩，一个用户每答对就是0分，需要赋初始值*/
        int sum=0;
        /*正式进入程序流程*/
        /*输出语句是一个提示：1、   用户输入   准考证号    姓名  准考证号变量前面有，姓名变量前面有，前面没有名称随意*/
        System.out.println("请输入准考证号");
        no=scanner.next();
        if ((no.indexOf("~") != -1) || (no.indexOf("!") != -1) || (no.indexOf("#") != -1)){
            System.out.println("非法用户，退出");
            /*此处应该是程序结束代码*/
        }else
        System.out.println("请输入姓名");
        name=scanner.next();
        /*2、进入考试界面（1——数学，2——英语两门课）这种格式是命令行菜单*/
        System.out.println("        考   试   系   统");
        System.out.println("1———————————————————数学");
        System.out.println("2———————————————————英语");
        System.out.println("*****************************************");
        //3、用户输入数学或者英语的代表数字
        System.out.println("请选择考试科目对应的序号：");
        String select_no= scanner.next();
        /*判断用户的序号内容，因为是字符串，等于使用equals，如果是数值，直接使用双等，字符串一定加双引号*/
        if (select_no.equals("1")){
            //    4、系统出题（暂时题目是固定的）  限定选择题
            System.out.println("1+1=");
            System.out.println("A、1     B、2     C、算不出来      D、不确定");
            //5、用户输入答案，判断答案，对的话加十分，错的话不得分
            String ans1= scanner.next();
            if (ans1.toLowerCase().equals("b")){
                sum=sum+10;
            }
            //    4、系统出题（暂时题目是固定的）  限定选择题
            System.out.println("2+2=");
            System.out.println("A、1     B、4     C、算不出来      D、不确定");
            //5、用户输入答案，判断答案，对的话加十分，错的话不得分
            String ans2= scanner.next();
            if (ans2.toLowerCase().equals("b")){
                sum=sum+10;
            }
            System.out.println("准考证号："+no+",姓名:"+name+"，成绩："+sum);
        }else if (select_no.equals("2")){
            //    4、系统出题（暂时题目是固定的）  限定选择题
            System.out.println("this is ___  apple");
            System.out.println("A、an     B、a     C、shit      D、不确定");
            //5、用户输入答案，判断答案，对的话加十分，错的话不得分
            String ans1= scanner.next();
            if (ans1.toLowerCase().equals("a")){
                sum=sum+10;
            }
            //    4、系统出题（暂时题目是固定的）  限定选择题
            System.out.println("how  ___   you?");
            System.out.println("A、are     B、is     C、fk      D、不确定");
            //5、用户输入答案，判断答案，对的话加十分，错的话不得分
            String ans2= scanner.next();
            if (ans2.toLowerCase().equals("a")){
                sum=sum+10;
            }
            //6、限定每个科目中两个题目，最后输出用户的考试成绩
            System.out.println("准考证号："+no+",姓名:"+name+"，成绩："+sum);
        }else{
            System.out.println("输入错误");
        }





    }
}
