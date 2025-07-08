package DietelChapter6;

public class FloorAndCeil {

    public static int myFloor(double number){
        if(number < 0) return 0;
        return (int)number;
    }

    public static int myCeil(double number){
        if(number < 0) return 0;
        return (int)number + 1;
    }

    public static void main(String[] args) {
        System.out.println("Value of Floor is " + FloorAndCeil.myFloor(9.2));
        System.out.println("Value of Ceil is " + FloorAndCeil.myCeil(9.2));
    }
}
