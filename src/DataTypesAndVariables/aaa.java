package DataTypesAndVariables;

import java.util.Scanner;

public class aaa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 97; i <97+n ; i++) {
            for (int j = 97; j <97+n; j++) {
                for (int k = 97; k <97+n ; k++) {
                    System.out.printf("%c%c%c%n",i,j,k);
                }

            }

        }



    }
}
