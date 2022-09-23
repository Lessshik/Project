package Day04;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Tesk2 {
    public static void main(String[] args) {

        int countEnds0=0;
        int summaEnds0=0;
        int [] array = new int[100];
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            array[i]=rand.nextInt(10000);
            System.out.println(array[i]);
            if (array[i]%10==0){
                countEnds0++;
                summaEnds0+=array[i];
            }

        }
        Arrays.sort(array);

        System.out.println("OTVET");
        System.out.println(array[99]);
        System.out.println(array[0]);
        System.out.println(countEnds0);
        System.out.println(summaEnds0);



    }
}
