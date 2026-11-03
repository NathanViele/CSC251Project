import java.util.Scanner;

public class Project_nathan_viele
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int policyNumber;
        String providerName;
        String firstName;
        String lastName;
        int age;
        String smokingStatus;
        double height;
        double weight;

        // Get policy information
        System.out.print("Please enter the Policy Number: ");
        policyNumber = keyboard.nextInt();
        keyboard.nextLine();

        System.out.print("Please enter the Provider Name: ");
        providerName = keyboard.nextLine();

        System.out.print("Please enter the Policyholder's First Name: ");
        firstName = keyboard.nextLine();

        System.out.print("Please enter the Policyholder's Last Name: ");
        lastName = keyboard.nextLine();

        System.out.print("Please enter the Policyholder's Age: ");
        age = keyboard.nextInt();
        keyboard.nextLine();

        System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
        smokingStatus = keyboard.nextLine();

        System.out.print("Please enter the Policyholder's Height (in inches): ");
        height = keyboard.nextDouble();

        System.out.print("Please enter the Policyholder's Weight (in pounds): ");
        weight = keyboard.nextDouble();

        // Create Policy object
        Policy policy = new Policy(policyNumber, providerName,
                                   firstName, lastName, age,
                                   smokingStatus, height, weight);

        // Display policy information
        System.out.println();
        System.out.println("Policy Number: " + policy.getPolicyNumber());
        System.out.println("Provider Name: " + policy.getProviderName());
        System.out.println("Policyholder's First Name: " + policy.getFirstName());
        System.out.println("Policyholder's Last Name: " + policy.getLastName());
        System.out.println("Policyholder's Age: " + policy.getAge());
        System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStatus());
        System.out.println("Policyholder's Height: " + policy.getHeight() + " inches");
        System.out.println("Policyholder's Weight: " + policy.getWeight() + " pounds");

        System.out.printf("Policyholder's BMI: %.2f%n", policy.calculateBMI());

        System.out.printf("Policy Price: $%.2f%n", policy.calculatePolicyPrice());

        keyboard.close();
    }
}