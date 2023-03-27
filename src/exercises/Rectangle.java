package exercises;
import java.util.Scanner;

public class Rectangle {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Length of Rectangle:");
        Integer length = input.nextInt();

        System.out.println("Enter width of Rectangle:");
        Integer width = input.nextInt();

        Integer area = length * width;

        System.out.println("Rectangle's area is " + area);
    }
}
