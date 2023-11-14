import java.util.Arrays;
import java.util.Scanner;

public class chashu {
    public static void main(String[] args) {
        int n;

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数n：");
        n = scanner.nextInt();
        int[] arr = new int[50];
        int[] arr1 = number(n,arr);
        System.out.println(Arrays.toString(arr1));
        int max = arr[0];
        int min = arr[0];
        int count = 0;
        for (int i = 0;i < arr.length;i++){
            if(arr[i] >= max){
                max = arr[i];
            }
            if (arr[i] <= min){
                min = arr[i];
            }
            if(arr[i] >= 60){
                count += 1;
            }
        }

        System.out.println("最小值：" + min);
        System.out.println("最大值：" + max);
        System.out.println("数组中>=60的数一共有：" + count + "个");

    }

    public static int[] number(int n, int[] arr){
        for (int i = 0;i < 50;i++){
            arr[i] = (int)(Math.random()*(n+1));
        }
        return arr;
    }
}