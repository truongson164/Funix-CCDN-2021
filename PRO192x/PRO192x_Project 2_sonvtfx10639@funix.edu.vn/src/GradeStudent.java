import java.util.Scanner;

public class GradeStudent {
    static int weight1;
    static int weight2;
    static int weight3;
//  Description of program
    public static void begin() {

        System.out.println("This program read exam/homework scores and reports your overall course grade.\n");

    }

//  Midterm
    public static double midterm(Scanner sc) {

        int shiftAmount = 0;

        do {
            System.out.print("Weight (0-100)? ");
            weight1 = sc.nextInt();
            if (weight1 >= 99 || weight1 <= 0) {
                System.out.println("Out of range! ");
            }
        } while (weight1 >= 99 || weight1 <= 0);

        System.out.print("Score earned? ");
        int earnScore = sc.nextInt();
        System.out.print("Were scores shifted (1=yes, 2=no)? ");
        int shifted = sc.nextInt();

        if (shifted == 1) {
            System.out.print("Shift amount? ");
            shiftAmount = sc.nextInt();
        }
        int totalPoint = earnScore + shiftAmount;
        if (totalPoint > 100) {
            totalPoint = 100;
        }

        System.out.println("Total point = " + totalPoint + " /100");
        double weightScore1 = (double) totalPoint / 100 * weight1;
        System.out.printf("Weighted score %.1f / " + weight1 +"\n\n",weightScore1);
        return weightScore1;

    }

//  Final term
    public static double finalTerm(Scanner sc) {

        int shiftAmount = 0;

        do {
            System.out.print("Weight (0-100)? ");
            weight2 = sc.nextInt();
            if ((weight2 >= 99 || weight2 <= 0) || ((weight1 + weight2) > 99)) {
                System.out.println("Out of range! ");
            }
        } while (weight2 >= 99 || weight2 <= 0 || (weight1 + weight2) > 99);

        System.out.print("Score earned? ");
        int earnScore = sc.nextInt();
        System.out.print("Were scores shifted (1=yes, 2=no)? ");
        int shifted = sc.nextInt();

        if (shifted == 1) {
            System.out.print("Shift amount? ");
            shiftAmount = sc.nextInt();
        }
        int totalPoint = earnScore + shiftAmount;
        if (totalPoint > 100) {
            totalPoint = 100;
        }
        System.out.println("Total point = " + totalPoint + " /100");
        double weightScore2 = (double) totalPoint / 100 * weight2;
        System.out.printf("Weighted score %.1f / " + weight2 + "\n\n",weightScore2);
        return weightScore2;

    }

//  Homework
    public static double homework(Scanner sc){

        int totalPoint = 0;
        int totalMax = 0;

        do {
            System.out.print("Weight (0-100)? ");
            weight3 = sc.nextInt();
            if (weight1 + weight2 + weight3 != 100) {
                System.out.println("Total weight != 100");
            }
        } while ((weight1 + weight2 + weight3) != 100 || weight3 <= 0 || weight3 > 99);


        System.out.print("Number of assignments? ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.print("Assignment " + i + "score and max? ");
            int score = sc.nextInt();
            int max = sc.nextInt();
            totalPoint += score;
            totalMax += max;

        }
        if (totalMax > 150) {
            totalMax = 150;
        }

        System.out.print("How many sections did you attend? ");
        int sections = sc.nextInt();
        int points = sections * 5;

        if (points > 30) {
            System.out.println("Section points = 30 / 30");
            points = 30;
        } else {
            System.out.println("Section points = " + points +" / 30");
        }
        totalPoint += points;
        totalMax += 30;

        System.out.println("Total points = " + totalPoint + " / " + totalMax);
        double weightScore3 = (double) totalPoint / totalMax * weight3;
        System.out.printf("Weighted score = %.1f \n\n", weightScore3);
        return weightScore3;

    }

//  Result
    public static void report(double weightScore1, double weightScore2, double weightScore3) {

        double minGPA;
        double overallScore = weightScore1 + weightScore2 + weightScore3;

        System.out.printf("Overall percentage = %.1f \n", overallScore);
        if (overallScore < 60.0) {
            minGPA = 0.0;
        } else if (overallScore >= 60.0 && overallScore < 75.0) {
            minGPA = 0.7;
        } else if (overallScore >= 75.0 && overallScore < 85.0) {
            minGPA = 2.0;
        } else {
            minGPA = 3.0;
        }
        System.out.printf("Your grade will be at least: %.1f \n", minGPA);
        System.out.println("<< your custom grade message here >>");

    }

//  Main program
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        begin();
        report(midterm(sc), finalTerm(sc), homework(sc));

    }
}
