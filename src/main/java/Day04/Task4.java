package Day04;

public class Task4 {
    public static void main(String[] args) {

        int [] array = {1, 456, 1025, 65, 954, 5789, 4, 8742, 1040, 3254};
        int maxSum=0;
        int numberPos=0;
        for (int i = 0; i < 8; i++) {
            int sum = 0;
            sum = array[i]+array[i+1]+array[i+2];
            if (sum>maxSum){
                maxSum=sum;
                numberPos=i;
            }

        }
        System.out.println(numberPos);
        System.out.println(maxSum);


    }
}
