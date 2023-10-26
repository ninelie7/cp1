import java.util.Scanner;

public class 第一天作业 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("欢迎参加性格测试！");
        System.out.println("---------------------");

        System.out.println("问题1：你更喜欢什么颜色？");
        System.out.println("a) 红色");
        System.out.println("b) 蓝色");
        System.out.println("c) 黄色");
        System.out.println("d) 绿色");
        System.out.print("请输入你的答案：");
        String answer1 = scanner.nextLine();

        System.out.println("问题2：在空闲时间，你更喜欢？");
        System.out.println("a) 阅读");
        System.out.println("b) 锻炼");
        System.out.println("c) 看电影");
        System.out.println("d) 旅行");
        System.out.print("请输入你的答案：");
        String answer2 = scanner.nextLine();

        // 这里可以继续添加更多的问题

        // 根据答案生成性格类型
        String personalityType = generatePersonalityType(answer1, answer2);

        System.out.println("---------------------");
        System.out.println("测试结果：你的性格类型是 " + personalityType + "。");
    }

    public static String generatePersonalityType(String answer1, String answer2) {
        // 根据答案生成性格类型的逻辑，你可以根据自己的想法扩展
        // 这里只是一个示例
        if (answer1.equalsIgnoreCase("a") && answer2.equalsIgnoreCase("a")) {
            return "AA型";
        } else if (answer1.equalsIgnoreCase("b") && answer2.equalsIgnoreCase("b")) {
            return "BB型";
        } else if (answer1.equalsIgnoreCase("c") && answer2.equalsIgnoreCase("c")) {
            return "CC型";
        } else if (answer1.equalsIgnoreCase("d") && answer2.equalsIgnoreCase("d")) {
            return "DD型";
        } else if (answer1.equalsIgnoreCase("a") && answer2.equalsIgnoreCase("b")) {
            return "AB型";
        } else if (answer1.equalsIgnoreCase("a") && answer2.equalsIgnoreCase("d")) {
            return "AD型";
        } else if (answer1.equalsIgnoreCase("a") && answer2.equalsIgnoreCase("c")) {
            return "AC型";
        } else if (answer1.equalsIgnoreCase("b") && answer2.equalsIgnoreCase("a")) {
            return "BA型";
        } else if (answer1.equalsIgnoreCase("b") && answer2.equalsIgnoreCase("c")) {
            return "BC型";
        }else if (answer1.equalsIgnoreCase("b") && answer2.equalsIgnoreCase("d")) {
            return "BD型";
        } else if (answer1.equalsIgnoreCase("c") && answer2.equalsIgnoreCase("a")) {
            return "CA型";
        } else if (answer1.equalsIgnoreCase("c") && answer2.equalsIgnoreCase("b")) {
            return "CB型";
        } else if (answer1.equalsIgnoreCase("c") && answer2.equalsIgnoreCase("d")) {
            return "CD型";
        } else if (answer1.equalsIgnoreCase("d") && answer2.equalsIgnoreCase("a")) {
            return "DA型";
        }  else if (answer1.equalsIgnoreCase("d") && answer2.equalsIgnoreCase("b")) {
            return "DB型";
        } else if (answer1.equalsIgnoreCase("d") && answer2.equalsIgnoreCase("c")) {
            return "DC型";
        } else {
            return "未知";
        }
    }
}