import java.util.Scanner;

class AddOneToDigits
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a five digit number: ");
        int number = sc.nextInt();

        int d1 = number % 10;
        number = number / 10;

        int d2 = number % 10;
        number = number / 10;

        int d3 = number % 10;
        number = number / 10;

        int d4 = number % 10;
        number = number / 10;

        int d5 = number % 10;

        d1 = (d1 + 1) % 10;
        d2 = (d2 + 1) % 10;
        d3 = (d3 + 1) % 10;
        d4 = (d4 + 1) % 10;
        d5 = (d5 + 1) % 10;

        int newNumber = d5 * 10000 + d4 * 1000 + d3 * 100 + d2 * 10 + d1;

        System.out.println("New number after adding 1 to each digit: " + newNumber);

        sc.close();
    }
}
