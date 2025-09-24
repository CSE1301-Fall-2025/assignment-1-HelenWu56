import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter your name: ");
    String name = in.nextLine();
    System.out.println("CSE131 Grade for: " + name);
    System.out.println("Enter studios attended: ");
    int studiosAttended = in.nextInt();
    double weightedStudioGrade = studiosAttended / 8.0 * 15;
    System.out.println("Weighted studio grade(out of 15): " + weightedStudioGrade + "%");

    System.out.println("Enter average quiz grade: ");
    double averageQuizGrade = in.nextDouble();
    double weightedQuizGrade = averageQuizGrade / 100 * 25;
    System.out.println("Weighted quiz grade(out of 25): " + weightedQuizGrade + "%");
    
    System.out.println("Enter average exam grade: ");
    double averageExamGrade = in.nextDouble();
    double weightedExamGrade = averageExamGrade / 100 * 60;
    System.out.println("Weighted exam grade(out of 60): " + weightedExamGrade + "%");

    double totalGrade = weightedStudioGrade + weightedQuizGrade +weightedExamGrade;
    System.out.println("Total Grade: "+ totalGrade + "%");

    in.close();
    }
}