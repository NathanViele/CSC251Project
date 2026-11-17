/**
 * The Policy class models an insurance policy for one person.
 */
public class Policy
{
    // Instance variables
    private int policyNumber;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height;
    private double weight;

    // No-argument constructor
    /**
     *constructor that initializes fields.
     */
    public Policy()
    {
        policyNumber = 0;
        providerName = "";
        firstName = "";
        lastName = "";
        age = 0;
        smokingStatus = "non-smoker";
        height = 0.0;
        weight = 0.0;
    }

    // Constructor with arguments
    /**
     * Constructor that accepts arguments for each field.
     */
    public Policy(int policyNumber, String providerName,
                  String firstName, String lastName,
                  int age, String smokingStatus,
                  double height, double weight)
    {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;
    }

    // Setters (Mutators)
    // Setters

    /**
     * Sets the policy number
     */
    public void setPolicyNumber(int policyNumber)
    {
        this.policyNumber = policyNumber;
    }

    /**
     * Sets the provider name
     */
    public void setProviderName(String providerName)
    {
        this.providerName = providerName;
    }

    /**
     * Sets the policy holder's first name
     */
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    /**
     * Sets the policy holder's last name
     */
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    /**
     * Sets the policy holder's age
     */
    public void setAge(int age)
    {
        this.age = age;
    }

    /**
     * Sets the policy holder's smoking status
     */
    public void setSmokingStatus(String smokingStatus)
    {
        this.smokingStatus = smokingStatus;
    }

    /**
     * Sets the policy holder's height
     */
    public void setHeight(double height)
    {
        this.height = height;
    }

    /**
     * Sets the policy holder's weight
     */
    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    // Getters (Accessors)
    // retrievers

    /**
     * Gets the policy number
     */
    public int getPolicyNumber()
    {
        return policyNumber;
    }

    /**
     * Gets the provider name
     */
    public String getProviderName()
    {
        return providerName;
    }

    /**
     * Gets the policy holder's first name
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * Gets the policy holder's last name
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * Gets the policy holder's age
     */
    public int getAge()
    {
        return age;
    }

    /**
     * Gets the policy holder's smoking status
     */
    public String getSmokingStatus()
    {
        return smokingStatus;
    }

    /**
     * Gets the policy holder's height
     */
    public double getHeight()
    {
        return height;
    }

    /**
     * Gets the policy holder's weight
     */
    public double getWeight()
    {
        return weight;
    }

    // Calculate and return BMI
    /**
     * Calculates and returns the policy holder's BMI
     */
    public double calculateBMI()
    {
        return (weight * 703) / (height * height);
    }

    // Calculate and return policy price
    /**
     * Calculates and returns the price of the insurance policy
     */
    public double calculatePolicyPrice()
    {
        double price = 600.00;

        if (age > 50)
        {
            price += 75.00;
        }

        if (smokingStatus.equalsIgnoreCase("smoker"))
        {
            price += 100.00;
        }

        if (calculateBMI() > 35)
        {
            price += (calculateBMI() - 35) * 20;
        }

        return price;
    }
}