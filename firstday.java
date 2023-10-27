import java.util.Scanner;

public class firstday {


        public static void main(String[] args) {


            System.out.println("请选择你要参加的测试！");
            System.out.println("A、性格测试      B、心理测试");
            System.out.println("---------------------");
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.next();



            if (choice.toUpperCase().equals("A")){


                System.out.println("欢迎参加性格测试！");
                System.out.println("---------------------");
                System.out.println("问题1：你更喜欢什么颜色？");
                System.out.println("a) 红色");
                System.out.println("b) 蓝色");
                System.out.println("c) 黄色");
                System.out.println("d) 绿色");
                System.out.print("请输入你的答案：");
                String ans1 = scanner.next();
                System.out.println("问题2：在空闲时间，你更喜欢？");
                System.out.println("a) 阅读");
                System.out.println("b) 锻炼");
                System.out.println("c) 看电影");
                System.out.println("d) 旅行");
                System.out.print("请输入你的答案：");
                String ans2 = scanner.next();
                String personalityType = generatePersonalityType(ans1, ans2);

                System.out.println("---------------------");
                System.out.println("测试结果：你的性格类型是 " + personalityType + "。");

            }


            else if (choice.toUpperCase().equals("B")){


                        System.out.println("欢迎来到心理测试程序！");
                        System.out.println("请回答以下问题：");

                        System.out.println("问题1: 你喜欢独自工作还是与他人合作？（单独输入 1 或者 2）");
                        int answer1 = scanner.nextInt();

                        System.out.println("问题2: 你更倾向于安静的活动还是充满活力的活动？（单独输入 1 或者 2）");
                        int answer2 = scanner.nextInt();

                        // 分析回答并给出结论
                        if (answer1 == 1 && answer2 == 1) {
                            System.out.println("根据你的回答，你可能是一个喜欢独立工作且安静活动的人。");
                        } else if (answer1 == 1 && answer2 == 2) {
                            System.out.println("根据你的回答，你可能是一个喜欢独立工作但也喜欢充满活力的活动的人。");
                        } else if (answer1 == 2 && answer2 == 1) {
                            System.out.println("根据你的回答，你可能是一个喜欢与他人合作且喜欢安静活动的人。");
                        } else if (answer1 == 2 && answer2 == 2) {
                            System.out.println("根据你的回答，你可能是一个喜欢与他人合作且喜欢充满活力的活动的人。");
                        } else {
                            System.out.println("你的回答无效，无法给出结论。");
                        }

                        System.out.println("谢谢参与心理测试！");
                        scanner.close();
            }else System.out.println("错误，退出");
        }


    public static String generatePersonalityType (String ans1, String ans2){
        if (ans1.equalsIgnoreCase("a") && ans2.equalsIgnoreCase("a")) {
            return "AA型";
        } else if (ans1.equalsIgnoreCase("b") && ans2.equalsIgnoreCase("b")) {
            return "BB型";
        } else if (ans1.equalsIgnoreCase("c") && ans2.equalsIgnoreCase("c")) {
            return "CC型";
        } else if (ans1.equalsIgnoreCase("d") && ans2.equalsIgnoreCase("d")) {
            return "DD型";
        } else if (ans1.equalsIgnoreCase("a") && ans2.equalsIgnoreCase("b")) {
            return "AB型";
        } else if (ans1.equalsIgnoreCase("a") && ans2.equalsIgnoreCase("d")) {
            return "AD型";
        } else if (ans1.equalsIgnoreCase("a") && ans2.equalsIgnoreCase("c")) {
            return "AC型";
        } else if (ans1.equalsIgnoreCase("b") && ans2.equalsIgnoreCase("a")) {
            return "BA型";
        } else if (ans1.equalsIgnoreCase("b") && ans2.equalsIgnoreCase("c")) {
            return "BC型";
        } else if (ans1.equalsIgnoreCase("b") && ans2.equalsIgnoreCase("d")) {
            return "BD型";
        } else if (ans1.equalsIgnoreCase("c") && ans2.equalsIgnoreCase("a")) {
            return "CA型";
        } else if (ans1.equalsIgnoreCase("c") && ans2.equalsIgnoreCase("b")) {
            return "CB型";
        } else if (ans1.equalsIgnoreCase("c") && ans2.equalsIgnoreCase("d")) {
            return "CD型";
        } else if (ans1.equalsIgnoreCase("d") && ans2.equalsIgnoreCase("a")) {
            return "DA型";
        } else if (ans1.equalsIgnoreCase("d") && ans2.equalsIgnoreCase("b")) {
            return "DB型";
        } else if (ans1.equalsIgnoreCase("d") && ans2.equalsIgnoreCase("c")) {
            return "DC型";
        }else{ return "未知";
        }
    }
}


