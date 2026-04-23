public class AverageCalculator {
    public static double average(String[] values) throws NullPointerException, NumberFormatException {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("Input array must not be null or empty");
        }

        double sum = 0.0;
        for (String value : values) {
            if (value == null) {
                throw new NullPointerException("Null value found in input array");
            }
            sum += Double.parseDouble(value);
        }

        return sum / values.length;
    }

    public static void main(String[] args) {
        System.out.println("Hetva-25");
        String[][] testData = {
            {"10.5", "20", "30.5"},
            {"12", null, "18"},
            {"5", "abc", "15"}
        };

        for (int i = 0; i < testData.length; i++) {
            try {
                double avg = average(testData[i]);
                System.out.println("Test " + (i + 1) + " average: " + avg);
            } catch (NullPointerException e) {
                System.out.println("Test " + (i + 1) + " error: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Test " + (i + 1) + " error: Invalid number format");
            } catch (IllegalArgumentException e) {
                System.out.println("Test " + (i + 1) + " error: " + e.getMessage());
            } finally {
                System.out.println("Execution for test " + (i + 1) + " completed");
            }
        }
    }
}
