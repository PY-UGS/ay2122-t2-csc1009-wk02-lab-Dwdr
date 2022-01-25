import java.util.Scanner;

public class Lab02Q1 {

    public static void main(String [] args) {

        double radius, area;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        radius = input.nextDouble();
        input.close();

        area = Math.PI * radius * radius;

        System.out.println("Area of the Circle of radius " +radius +" is " +area);
    }
}