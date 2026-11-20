import java.io.*;

public class M8A1 {

    public static void main(String[] args) {

        // File names
        String inputFile = "pay.csv";
        String outputFile = "pay_output.csv";

        try {
            // Open files
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));

            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            reader.readLine();
            writer.write("EmpID, PayRate, HoursWorked, WeeklyPay");
            writer.newLine();

            String line;

            // Read each employee info

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                //Convert CSV data into nums
                String empID = data[0];
                double payRate = Double.parseDouble(data[1]);
                double hours = Double.parseDouble(data[2]);

                double weeklyPay;

                // Calculate regular pay and overtimr
                if (hours > 40) {
                    weeklyPay = (40 * payRate) + ((hours - 40) * payRate * 1.5);
                } else {
                    weeklyPay = hours * payRate;
                }

                //Format weekly pay
                String formattedPay = String.format(java.util.Locale.US, "$%.2f", weeklyPay);

                // Writethe results of the outpot
                writer.write(empID + "," + payRate + "," + hours + "," + formattedPay);
                writer.newLine();
            }
            // Close
            reader.close();
            writer.close();

            System.out.println("File processed successfully");
            System.out.println("Output saved to output.csv");

        }

        catch(IOException e) {
            System.out.println("File error: " + e.getMessage());
        }

        catch (NumberFormatException e) {
            System.out.println("Error reading input file");
        }



    }
}