import java.util.Scanner;

public class Lab02Q4 {
    public static void main(String [] args) {
        int year, zodiac;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        year = input.nextInt();
        input.close();
        zodiac = year % 12;
        if (zodiac == 0) {
            System.out.println("monkey");
        }
        else if (zodiac == 1){
            System.out.println("roooster");
        }
        else if (zodiac == 2){
            System.out.println("dog");
        }
        else if (zodiac == 3){
            System.out.println("pig");
        }
        else if (zodiac == 4){
            System.out.println("rat");
        }
        else if (zodiac == 5){
            System.out.println("ox");
        }
        else if (zodiac == 6){
            System.out.println("tiger");
        }
        else if (zodiac == 7){
            System.out.println("rabbit");
        }
        else if (zodiac == 8){
            System.out.println("dragon");
        }
        else if (zodiac == 9){
            System.out.println("snake");
        }
        else if (zodiac == 10){
            System.out.println("horse");
        }
        else if (zodiac == 11){
            System.out.println("sheep");
        }
        else {
            System.out.println("Error, rerun code with valid year");
        }
    
        }
        


}
