package DietelChapter6;

public class parkingChargesTest {
    public static String calculateCharges(int numberOfHours){
        double result = 0.0;
        if (numberOfHours < 0){return "Invalid input!";}
        else{
            if (numberOfHours <= 3){
                result += numberOfHours * 20.0;
            } else if (numberOfHours > 3 && numberOfHours < 24){
                result += 3 * 20.0 + (numberOfHours - 3) * 0.50;
            } else{
                result += 3 * 20.0 + 21 * 0.50 + (numberOfHours - 24) / 24 * 10.0;
            }
        }
        return "Your parking charge is $" + result;
        }
}
