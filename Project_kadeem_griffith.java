import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.InputMismatchException; // Import this class to handle input scanner error
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList; // Import the ArrayList class to store the policy class into multiple instances objects

public class Project_kadeem_griffith
   {
      public static void main(String[] args) throws InputMismatchException
         {
            String provider_name = "", first_name = "", last_name = "", smoking_status = "";
            double height = 0.0, weight = 0.0;
            int policy_number = 0, age = 0, total_smokers = 0, total_non_smokers = 0; 

            ArrayList<Policy> policyList = new ArrayList<Policy>(); // Create an ArrayList to store the Policy Class

            try 
               {
                  File myFile = new File("PolicyInformation.txt");
                  Scanner keyboard = new Scanner(myFile);

                  while (keyboard.hasNextLine())
                     {
                        policy_number = keyboard.nextInt();
                        keyboard.nextLine();

                        provider_name = keyboard.nextLine();


                        first_name = keyboard.nextLine();

                        last_name = keyboard.nextLine();

                        age = keyboard.nextInt();
                        keyboard.nextLine();

                        smoking_status = keyboard.nextLine();

                        if(smoking_status.equalsIgnoreCase("smoker"))
                           {
                              total_smokers++;
                           }

                        else if(smoking_status.equalsIgnoreCase("non-smoker"))
                           {
                              total_non_smokers++;
                           }
                           
                        height = keyboard.nextDouble();

                        weight = keyboard.nextDouble();

                        Policy policy = new Policy(policy_number, provider_name, first_name, last_name, smoking_status, age, height, weight);
                        
                        policyList.add(policy);
                     }
 
                  keyboard.close();
               }

            catch (FileNotFoundException e)  
               {
                  System.out.println("An error occurred.");
                  e.printStackTrace();
               }


            for (int i = 0; i < policyList.size(); i++)
               {
                   Policy temp = policyList.get(i);

                   System.out.printf("%n%nPolicy Number: %s%nProvider Name: %s%nPolicyholder's First Name: %s", temp.getPolicyNumber(), temp.getProviderName(), temp.getFirstName());
                   System.out.printf("%nPolicyholder's Last Name: %s%nPolicyholder's Age: %d%nPolicyholder's Smoking Status: %s", temp.getLastName(), temp.getAge(), temp.getSmokingStatus());
                   System.out.printf("%nPolicyholder's Height: %,.2f inches%nPolicyholder's Weight: %,.2f pounds", temp.getHeight(), temp.getWeight());
                   System.out.printf("%nPolicyholder's BMI: %,.2f%nPolicy Price: $%,.2f", temp.calculateBMI(), temp.calculatePrice());
               }
            
            System.out.printf("%n%nThe number of policies with a smoker is: %,d", total_smokers);  
            System.out.printf("%nThe number of policies with a non-smoker is: %,d",total_non_smokers);   
         }
   }