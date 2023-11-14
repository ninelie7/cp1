public class onehundred {
    public static void main(String[] args) {
        int i;
        int j;
        for (i=0;i<34;i++){
            for (j=0;j<100;j++) {
                if (3 * i + j / 3 == 100&&i+j==100) {
                    System.out.println("i=" + i + "j=" + j);
                }
            }
        }
    }
}
