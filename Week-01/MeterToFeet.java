import java.util.Scanner;

class MeterToFeet
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in meters: ");
        double meter = sc.nextDouble();

        double feet;
        feet = meter * 3.28084;

        System.out.printf("Distance in feet is: %.2f", feet);

        sc.close();
    }
}
