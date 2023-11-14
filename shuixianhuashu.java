public class shuixianhuashu {
    public static void main(String[] args) {
        //只找三位数的水仙花数
        for (int i = 100; i < 1000; i++) {
            if (fk(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean fk(int num) {
        int originalNum = num;
        int sum = 0;
        int weishu = (int) Math.log10(num) + 1;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, weishu);
            num /= 10;
        }

        return sum == originalNum;
    }
}