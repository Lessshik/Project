package Day09.Task2;

public class Task2 {

    public static void main(String[] args) {
        Figure [] figures = {
                new Triangle("Red", 10,10,10),
                new Triangle("Green", 10,20,30),
                new Triangle("Red", 10,20,15),
                new Rectangle("Red",5,10),
                new Rectangle("Orange",40,15),
                new Circle("Red",4),
                new Circle("Red",10),
                new Circle("Blue",5),
        };

        System.out.println("Red perim - "+ calcRedPerim(figures));
        System.out.println("Red area - " + calcRedArea(figures));
    }
    public static double calcRedPerim(Figure [] figures){
        double result=0;

        for (Figure f: figures) {
            if (f.getColor().equals("Red")){
                result+=f.perimeter();
            }
        }

        return result;
    }

    public static double calcRedArea(Figure [] figures){
        double result=0;

        for (Figure f: figures) {
            if (f.getColor().equals("Red")){
                result+=f.area();
            }
        }
        return result;
    }

}
