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

            // Skip blank line between policies if another line exists
            if (inputFile.hasNext())
            {
                inputFile.nextLine();
                inputFile.nextLine();
            }

            // Create a Policy object and add it to the ArrayList
            Policy policy = new Policy(policyNumber, providerName,
                                       firstName, lastName, age,
                                       smokingStatus, height, weight);
            policies.add(policy);
        }

        inputFile.close();
    }
}