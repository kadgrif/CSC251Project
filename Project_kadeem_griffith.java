import java.util.Scanner;

public class Project_kadeem_griffith
   {
      public static void main(String[] args)
         {
            String policy_number, provider_name, first_name, last_name, smoking_status;
            double height, weight, BMI, policy_price;
            int age; 
            
            Scanner keyboard = new Scanner(System.in);
            
            System.out.println();
            
            System.out.print("Please enter the Policy Number: ");
            policy_number = keyboard.nextLine();
            
            System.out.print("Please enter the Provider Name: ");
            provider_name = keyboard.nextLine();
            
            System.out.print("Please enter the Policyholder's First Name: ");
            first_name = keyboard.nextLine();
            
            System.out.print("Please enter the Policyholder's Last Name: ");
            last_name = keyboard.nextLine();
            
            System.out.print("Please enter the Policyholder's Age: ");
            age = keyboard.nextInt();
            keyboard.nextLine();
            
            System.out.print("Please enter the Policyholder's Smkoing Status (smoker/non-smoker): ");
            smoking_status = keyboard.nextLine();
            
            System.out.print("Please enter the Policyholder's Height (in inches): ");
            height = keyboard.nextDouble();
            
            System.out.print("Please enter the Policyholder's Weight (in pounds): ");
            weight = keyboard.nextDouble();
            
            Policy policy = new Policy(policy_number, provider_name, first_name, last_name, smoking_status, age, height, weight);
            
            System.out.printf("%nPolicy Number: %s%nProvider Name: %s%nPolicyholder's First Name: %s", policy.getPolicyNumber(), policy.getProviderName(), policy.getFirstName());
            System.out.printf("%nPolicyholder's Last Name: %s%nPolicyholder's Age: %d%nPolicyholder's Smoking Status: %s", policy.getLastName(), policy.getAge(), policy.getSmokingStatus());
            System.out.printf("%nPolicyholder's Height: %,.2f%nPolicyholder's Weight: %,.2f", policy.getHeight(), policy.getWeight());
            System.out.printf("%nPolicyholder's BMI: %,.2f%nPolicy Price: $%,.2f", policy.calculateBMI(), policy.calculatePrice()); 
            
            keyboard.close();
         }
   }
   
   