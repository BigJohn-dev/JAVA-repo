import java.util.*;

public class GradeManagementSystem {
    private static Scanner scanner = new Scanner(System.in);

    // Get valid positive integer input
    private static int getValidNumber(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                int value = Integer.parseInt(scanner.nextLine());
                if (value <= 0) {
                    System.out.println("Please enter a positive number.");
                    continue;
                }
                return value;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }

    // Get valid score between 0 and 100
    private static int getValidScore(String student, String subject) {
        while (true) {
            try {
                System.out.printf("Enter score for %s in %s: ", student, subject);
                int score = Integer.parseInt(scanner.nextLine());
                if (score >= 0 && score <= 100) {
                    return score;
                }
                System.out.println("Score must be between 0 and 100.");
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }

    // Calculate letter grade
    private static String calculateGrade(double score) {
        if (score >= 90) return "A";
        if (score >= 80) return "B";
        if (score >= 70) return "C";
        if (score >= 60) return "D";
        return "F";
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Lagbaja Schools Grade Management System");

        // Get number of students and subjects
        int numStudents = getValidNumber("Enter the number of students: ");
        int numSubjects = getValidNumber("Enter the number of subjects: ");

        // Get subject names
        List<String> subjects = new ArrayList<>();
        for (int i = 0; i < numSubjects; i++) {
            System.out.printf("Enter name of subject %d: ", i + 1);
            subjects.add(scanner.nextLine().trim());
        }

        // Initialize grade storage
        Map<String, Map<String, Integer>> grades = new HashMap<>();

        // Collect scores for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("Enter name of student %d: ", i + 1);
            String studentName = scanner.nextLine().trim();
            grades.put(studentName, new HashMap<>());

            for (String subject : subjects) {
                int score = getValidScore(studentName, subject);
                grades.get(studentName).put(subject, score);
            }
        }

        // Display class summary
        System.out.println("\n=== CLASS SUMMARY ===");
        System.out.printf("Total Students: %d%n", numStudents);
        System.out.printf("Total Subjects: %d%n", numSubjects);
        System.out.println("\nSubject Averages:");

        // Calculate and display subject averages
        for (String subject : subjects) {
            double total = 0;
            for (String student : grades.keySet()) {
                total += grades.get(student).get(subject);
            }
            double average = total / numStudents;
            System.out.printf("%s: %.2f%n", subject, average);
        }

        // Display individual student performance
        System.out.println("\nStudent Performance:");
        Map<String, Double> studentAverages = new HashMap<>();
        
        for (String student : grades.keySet()) {
            System.out.printf("\n%s's Grades:%n", student);
            double totalScore = 0;
            for (String subject : subjects) {
                int score = grades.get(student).get(subject);
                String grade = calculateGrade(score);
                totalScore += score;
                System.out.printf("%s: %d (%s)%n", subject, score, grade);
            }
            double average = totalScore / numSubjects;
            studentAverages.put(student, average);
            System.out.printf("Student Average: %.2f (%s)%n", average, calculateGrade(average));
        }

        // Find highest and lowest performing students
        String highestStudent = Collections.max(studentAverages.entrySet(), 
            Map.Entry.comparingByValue()).getKey();
        String lowestStudent = Collections.min(studentAverages.entrySet(), 
            Map.Entry.comparingByValue()).getKey();

        System.out.println("\nClass Performance Summary:");
        System.out.printf("Highest Performing Student: %s (%.2f)%n", 
            highestStudent, studentAverages.get(highestStudent));
        System.out.printf("Lowest Performing Student: %s (%.2f)%n", 
            lowestStudent, studentAverages.get(lowestStudent));
    }
}