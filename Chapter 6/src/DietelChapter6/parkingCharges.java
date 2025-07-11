package DietelChapter6;

public class parkingCharges {
    private static double ParkingCharges = 2.0;
    private static double additionalCharges = 0.50;
    private static double maximumCharge = 10.0;

    public parkingCharges(double ParkingCharges, double additionalCharges, double maximumCharge, int hoursCarPark) {
        this.ParkingCharges = ParkingCharges;
        this.additionalCharges = additionalCharges;
        this.maximumCharge = maximumCharge;
    }
    public static double getParkingCharges() {
        return ParkingCharges;
    }
    public static double getAdditionalCharges() {
        return additionalCharges;
    }
    public static double getMaximumCharge() {
        return maximumCharge;
    }

    public static String calculateCharges(int numberOfHours){
        double result = 0.0;
        if (numberOfHours < 0) return "Invalid time input!";
        else
            if (numberOfHours <= 3) result += numberOfHours * getParkingCharges();
            else if (numberOfHours < 24) result += 3 * getParkingCharges() + (numberOfHours - 3) * getAdditionalCharges();
            else result += 3 * getParkingCharges() + 21 * getAdditionalCharges() + (double) (numberOfHours - 24) / 24 * getMaximumCharge();
        return "Your parking charge is $" + result;
    }
}
