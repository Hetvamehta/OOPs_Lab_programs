import java.util.Scanner;

class CramersRule
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();

        System.out.print("Enter value of d: ");
        double d = sc.nextDouble();

        System.out.print("Enter value of e: ");
        double e = sc.nextDouble();

        System.out.print("Enter value of f: ");
        double f = sc.nextDouble();

        double D = (a * d) - (b * c);
        double Dx = (e * d) - (b * f);
        double Dy = (a * f) - (e * c);

        if (D == 0)
        {
            System.out.println("No unique solution exists (Denominator is zero).");
        }
        else
        {
            double x = Dx / D;
            double y = Dy / D;

            System.out.printf("Value of x = %.2f\n", x);
            System.out.printf("Value of y = %.2f\n", y);
        }

        sc.close();
    }
}
