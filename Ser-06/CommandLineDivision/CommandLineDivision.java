public class CommandLineDivision {
    public static void main(String[] args) {
        System.out.println("Hetva-25");
        try {
            if (args.length < 2) {
                throw new ArrayIndexOutOfBoundsException("Please provide numerator and denominator");
            }

            double numerator = Double.parseDouble(args[0]);
            double denominator = Double.parseDouble(args[1]);
            double result = numerator / denominator;

            if (Double.isInfinite(result) || Double.isNaN(result)) {
                throw new ArithmeticException("Invalid arithmetic operation");
            }

            System.out.println("Numerator: " + numerator);
            System.out.println("Denominator: " + denominator);
            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric input");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}
