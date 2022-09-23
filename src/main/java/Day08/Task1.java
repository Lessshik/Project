package Day08;

public class Task1 {

    public static void main(String[] args) {

        String str = "";
        long before = System.currentTimeMillis();
        for (int i = 0; i < 20001; i++) {
            str = str + " " + i;
        }
        System.out.println(str);
        long after = System.currentTimeMillis();
        System.out.println(after-before);

        StringBuilder str1 = new StringBuilder();
        long before1 = System.currentTimeMillis();
        for (int i = 0; i < 20001; i++) {
            str1.append(" "+ i);
        }
        System.out.println(str1);
        long after1 = System.currentTimeMillis();
        System.out.println(after1-before1);

    }
}
