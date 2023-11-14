import java.util.Arrays;

public class shuzu {
    public static void main(String[] args) {
        int[] arr={1,20,30,14,51,78,94,54};
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    arr[j]=arr[j]+arr[j+1];
                    arr[j+1]= arr[j]-arr[j+1];
                    arr[j]=arr[j]-arr[j+1];

                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
