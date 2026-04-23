import java.util.Scanner;

class ATMCashier
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount to be withdrawn: ");
        int amount = sc.nextInt();

        int hundred, fifty, ten, five, two, one;

        hundred = amount / 100;
        amount = amount % 100;

        fifty = amount / 50;
        amount = amount % 50;

        ten = amount / 10;
        amount = amount % 10;

        five = amount / 5;
        amount = amount % 5;

        two = amount / 2;
        amount = amount % 2;

        one = amount / 1;

        System.out.println("Currency notes to be given:");

        System.out.println("100 : " + hundred);
        System.out.println("50  : " + fifty);
        System.out.println("10  : " + ten);
        System.out.println("5   : " + five);
        System.out.println("2   : " + two);
        System.out.println("1   : " + one);

        sc.close();
    }
}
