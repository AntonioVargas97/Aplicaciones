import java.util.Scanner;

public class prac {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        double side1, side2, side3;
        String color;
        boolean isfilled;

        System.out.println("Enter side 1: ");
        side1 = sc.nextDouble();

        System.out.println("Enter side 2: ");
        side2 = sc.nextDouble();

        System.out.println("Enter side 3: ");
        side3 = sc.nextDouble();

        System.out.println("Enter a color: ");
        color = sc.nextLine();

        System.out.println("is filled? (y/n): ");
        isfilled = sc.nextBoolean();

        /* 
        System.out.println("Triangle area: " + getArea());
        System.out.println("Triangle perimeter: " + getPerimeter());
        */
        
    }
}