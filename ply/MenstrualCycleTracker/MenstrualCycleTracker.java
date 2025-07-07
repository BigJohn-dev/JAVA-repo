import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MenstrualCycleTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Input: Last period start date
        System.out.println("Enter the start date of your last period (yyyy-MM-dd): ");
        String lastPeriodInput = scanner.nextLine();
        LocalDate lastPeriodDate = LocalDate.parse(lastPeriodInput, formatter);

        // Input: Average cycle length
        System.out.println("Enter your average cycle length (days, e.g., 28): ");
        int cycleLength = scanner.nextInt();

        // Validate cycle length
        if (cycleLength < 21 || cycleLength > 35) {
            System.out.println("Warning: Cycle length is unusual. Typical range is 21–35 days.");
        }

        // Calculate next period
        LocalDate nextPeriodDate = lastPeriodDate.plusDays(cycleLength);
        System.out.println("Next period expected on: " + nextPeriodDate);

        // Calculate ovulation (approximately mid-cycle)
        int ovulationDay = cycleLength / 2;
        LocalDate ovulationDate = lastPeriodDate.plusDays(ovulationDay);
        System.out.println("Estimated ovulation date: " + ovulationDate);

        // Calculate fertile window (ovulation ± 2-3 days)
        LocalDate fertileStart = ovulationDate.minusDays(3);
        LocalDate fertileEnd = ovulationDate.plusDays(2);
        System.out.println("Fertile window: " + fertileStart + " to " + fertileEnd);

        // Calculate safe days (approximate)
        LocalDate cycleEnd = nextPeriodDate;
        System.out.println("Relatively safe days (lower pregnancy risk):");
        System.out.println("- Before fertile window: " + lastPeriodDate + " to " + fertileStart.minusDays(1));
        System.out.println("- After fertile window: " + fertileEnd.plusDays(1) + " to " + cycleEnd);

        scanner.close();
    }
}