import java.util.Scanner;

public class PackageDimensions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of the package: ");
        double length = sc.nextDouble();

        System.out.print("Enter width of the package: ");
        double width = sc.nextDouble();

        System.out.print("Enter height of the package: ");
        double height = sc.nextDouble();

        double volume = length * width * height;

        System.out.println("The total volume of the package is: " + volume + " cubic units");
    }
}
