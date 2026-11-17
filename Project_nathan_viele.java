import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

public class Project_nathan_viele
{
    public static void main(String[] args) throws IOException
    {
        // Declare variables
        int policyNumber;
        String providerName;
        String firstName;
        String lastName;
        int age;
        String smokingStatus;
        double height;
        double weight;
        int numSmokers = 0;
        int numNonSmokers = 0;

        // ArrayList to store Policy objects
        ArrayList<Policy> policies = new ArrayList<Policy>();

        // Open the PolicyInformation.txt file
        File file = new File("PolicyInformation.txt");
        Scanner inputFile = new Scanner(file);

        // Read all policies from the file
        while (inputFile.hasNext())
        {
            policyNumber = inputFile.nextInt();
            inputFile.nextLine(); 

            providerName = inputFile.nextLine();
            firstName = inputFile.nextLine();
            lastName = inputFile.nextLine();

            age = inputFile.nextInt();
            inputFile.nextLine(); 

            smokingStatus = inputFile.nextLine();
            height = inputFile.nextDouble();
            weight = inputFile.nextDouble();

            // Consume the newline after weight and any blank line separating records
            if (inputFile.hasNext())
            {
                inputFile.nextLine();
                inputFile.nextLine();
            }

            // Create Policy object and add to the ArrayList
            Policy policy = new Policy(policyNumber, providerName,
                                       firstName, lastName, age,
                                       smokingStatus, height, weight);
            policies.add(policy);
        }

        inputFile.close();

        // Iterate through the ArrayList and display each policy's information
        for (int i = 0; i < policies.size(); i++)
        {
            Policy policy = policies.get(i);

            System.out.println("Policy Number: " + policy.getPolicyNumber());
            System.out.println("Provider Name: " + policy.getProviderName());
            System.out.println("Policyholder's First Name: " + policy.getFirstName());
            System.out.println("Policyholder's Last Name: " + policy.getLastName());
            System.out.println("Policyholder's Age: " + policy.getAge());
            System.out.println("Policyholder's Smoking Status (smoker/non-smoker): " + policy.getSmokingStatus());
            System.out.printf("Policyholder's Height: %.1f inches%n", policy.getHeight());
            System.out.printf("Policyholder's Weight: %.1f pounds%n", policy.getWeight());
            System.out.printf("Policyholder's BMI: %.2f%n", policy.calculateBMI());
            System.out.printf("Policy Price: $%.2f%n", policy.calculatePolicyPrice());
            System.out.println();

            // Count smokers and non-smokers
            if (policy.getSmokingStatus().equalsIgnoreCase("smoker"))
            {
                numSmokers++;
            }
            else
            {
                numNonSmokers++;
            }
        }

        // Display totals
        System.out.println("The number of policies with a smoker is: " + numSmokers);
        System.out.println("The number of policies with a non-smoker is: " + numNonSmokers);
    }
}