import java.util.Scanner;

public class game1 {
    public static void main(String[] args) {
        //定义全局变量 玩家名字：player_name，电脑名字：com_name 玩家出拳：player_choice 电脑出拳:com_choice
        String player_name;
        String com_name;
        int player_choice = 0;
        int com_choice;
        //按照流程写程序
        //欢迎界面
        System.out.println("************************");
        System.out.println("    游戏：剪刀石头布");
        System.out.println("            作者:XXXXXXX");
        System.out.println("    欢迎进入此游戏     请输入玩家名字");
        //获取输入设备
        Scanner scanner = new Scanner(System.in);
        //结合上下文的变量来决定当前等式的变量
        player_name=scanner.nextLine();
        //选择一个电脑玩家
        System.out.println("******************");
        System.out.println("1------丁真");
        System.out.println("2------唐妞");
        System.out.println("3------虎哥");

        System.out.println("==================");
        //需要用户选择玩家
        String com_no=scanner.next();
        switch (com_no) {
            case "1":
                com_name = ("丁真");
                break;
            case "2":
                com_name = ("唐妞");
                break;
            case "3":
                com_name = ("虎哥");
                break;
            default:
                com_name = "匿名用户";
                break;
        }

        //玩家出拳
        System.out.println("**********请玩家选择出拳代表的数字**************");
        System.out.println("1----------剪刀");
        System.out.println("2----------石头");
        System.out.println("3----------布");
        System.out.println("*********************************************");
        //玩家出拳为了运算方便
        String middle=scanner.next();
        if (middle.equals("1")||middle.equals("2")||middle.equals("3")){
            player_choice=Integer.parseInt(middle);
        }else{
            player_choice=(int) Math.round(Math.random()*2+1);
        }
        System.out.println(player_choice);
        //电脑出拳
        com_choice=(int) Math.round(Math.random()*2+1);
        System.out.println(com_choice);
        //判断数值计算用==
        if (player_choice-com_choice==1||player_choice-com_choice==-2){
            System.out.println("玩家:"+player_name+"赢");
        }else if (com_choice-player_choice==1||com_choice-player_choice==-2){
            System.out.println("电脑:"+com_name+"赢");
        }else {
            System.out.println("平局");
        }

    }
}
