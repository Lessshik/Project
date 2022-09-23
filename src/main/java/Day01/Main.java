package Day01;

public class Main {

    public static void main(String[] args) {
//1
        int i = 0;
        while (i<10) {
            System.out.print(i+1 + "-JAVA ");
            i++;
        }

        System.out.println();
//2
        for (int j = 0; j<10; j++){
            System.out.print(j+1 + "-JAVA ");
        }

        System.out.println();
//3
        for (int j = 0; j<10; j++){
            System.out.println(j+1 + "-JAVA ");
        }
//4
        int year = 1980;
        while (year<=2020){
            System.out.println("Олимпиада " + year);
            year+=4;
        }
//5
        year = 1980;
        for (int j = year; j <= 2020; j+=4) {
            System.out.println("-Олимпиада " + j);
        }
//6
        int k=5                ;
        for (int j = 1; j < 10; j++) {
            System.out.println(j+"x"+ k + " = "+ k*j);
        }

    }
}
