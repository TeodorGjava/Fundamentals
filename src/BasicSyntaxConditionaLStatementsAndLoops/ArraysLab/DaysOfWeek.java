package BasicSyntaxConditionaLStatementsAndLoops.ArraysLab;

import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int n = Integer.parseInt(sc.nextLine());
        if (n > 0 && n < 8) {
            System.out.println(days[n - 1]);
        } else{
            System.out.println("Invalid day!");
        }
    }
}
