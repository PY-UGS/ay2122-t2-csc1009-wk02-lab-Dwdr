import java.util.Scanner;

public class Lab02Q2 {

    public static void main(String[] args) {

        double no1,no2,no3,avg;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        no1 = input.nextDouble();
        no2 = input.nextDouble();
        no3 = input.nextDouble();
        input.close();

        avg = (no1+no2+no3) /3;

        System.out.println("The average of " + no1 + " " + no2 + " " + no3 + " is " + avg );
    }
}
