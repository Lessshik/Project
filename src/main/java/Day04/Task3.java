package Day04;

public class Task3 {
    public static void main(String[] args) {

        int [][] array = new int[12][8];
        int maxSum=0;
        int numberLine=0;
        for (int i = 0; i < 12; i++) {
            int sum=0;
            for (int j = 0; j < 8; j++) {
                array[i][j] = (int)(Math.random()*50);
                sum=sum+array[i][j];
                System.out.print(array[i][j]+" ");
            }
            System.out.print(" - summ "+sum);
            if (sum>maxSum){
                maxSum=sum;
                numberLine=i+1;
            }
            System.out.print(" MAXSUM - "+maxSum);

            System.out.println();

        }

        System.out.println("line "+numberLine);

    }
}
