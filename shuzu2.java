public class shuzu2 {
    public static void main(String[] args) {
        //快速排序
        int[] arr={10,30,25,79,48,32,6,25};

    }
    public  static void Quanopai(int arr[],int left ,int right){
        if (left>right){
            return;
        }
        int baseNumber = arr[left];
        while (left!=right){
            while(arr[left]<=baseNumber){
                left++;
            }
            while (arr[right]>=baseNumber){
                right++;
            }
            int temp=arr[left];
        }
    }
}
