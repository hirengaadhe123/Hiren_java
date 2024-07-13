import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    private ArrayList<Double> grades;

    public Task1() {
        grades = new ArrayList<>();
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }

    public double calculateAverage() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public double findHighestGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        double highest = grades.get(0);
        for (double grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    public double findLowestGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        double lowest = grades.get(0);
        for (double grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Task1 calculator = new Task1();

        System.out.println("Enter student grades (enter -1 to finish):");

        while (true) {
            System.out.print("Grade: ");
            double grade = scanner.nextDouble();
            if (grade == -1) {
                break;
            }
            calculator.addGrade(grade);
        }

        System.out.printf("Average grade: %.2f%n", calculator.calculateAverage());
        System.out.printf("Highest grade: %.2f%n", calculator.findHighestGrade());
        System.out.printf("Lowest grade: %.2f%n", calculator.findLowestGrade());

        scanner.close();
    }
}

