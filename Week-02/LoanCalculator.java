import java.util.Scanner;

public class LoanCalculator {

    public double calculateEMI(int principal, int time, float rate) {
        double monthlyRate = rate / 12 / 100;
        int months = time * 12;
        return (principal * monthlyRate * Math.pow(1 + monthlyRate, months)) / (Math.pow(1 + monthlyRate, months) - 1);
    }

    public double calculateEMI(double principal, int time, double rate) {
        double monthlyRate = rate / 12 / 100;
        int months = time * 12;
        return (principal * monthlyRate * Math.pow(1 + monthlyRate, months)) / (Math.pow(1 + monthlyRate, months) - 1);
    }

    public double calculateEMI(int principal, int time) {
        double fixedRate = 10.0;
        double monthlyRate = fixedRate / 12 / 100;
        int months = time * 12;
        return (principal * monthlyRate * Math.pow(1 + monthlyRate, months)) / (Math.pow(1 + monthlyRate, months) - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LoanCalculator calc = new LoanCalculator();

        System.out.println("--- Home Loan EMI Calculation ---");
        System.out.print("Enter Principal (integer): ");
        int homePrincipal = scanner.nextInt();
        System.out.print("Enter Time in years (integer): ");
        int homeTime = scanner.nextInt();
        System.out.print("Enter Annual Interest Rate (float): ");
        float homeRate = scanner.nextFloat();
        
        double homeEMI = calc.calculateEMI(homePrincipal, homeTime, homeRate);
        System.out.printf("Home Loan EMI: %.2f%n%n", homeEMI);

        System.out.println("--- Vehicle Loan EMI Calculation ---");
        System.out.print("Enter Principal (double): ");
        double vehiclePrincipal = scanner.nextDouble();
        System.out.print("Enter Time in years (integer): ");
        int vehicleTime = scanner.nextInt();
        System.out.print("Enter Annual Interest Rate (double): ");
        double vehicleRate = scanner.nextDouble();

        double vehicleEMI = calc.calculateEMI(vehiclePrincipal, vehicleTime, vehicleRate);
        System.out.printf("Vehicle Loan EMI: %.2f%n%n", vehicleEMI);

        System.out.println("--- Personal Loan EMI Calculation (Fixed 10% Rate) ---");
        System.out.print("Enter Principal (integer): ");
        int personalPrincipal = scanner.nextInt();
        System.out.print("Enter Time in years (integer): ");
        int personalTime = scanner.nextInt();

        double personalEMI = calc.calculateEMI(personalPrincipal, personalTime);
        System.out.printf("Personal Loan EMI: %.2f%n", personalEMI);

        scanner.close();
    }
}