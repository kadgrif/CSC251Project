public class Policy
   {
      private final int AGE_LIMIT = 50;       // Age limit to help calculate a fee for any age over this number
      private final int BMI_LIMIT = 35;       // BMI limit to help calculate a fee for anyone over it
        
      private String providerName;        // Insurance Provider Name   
      private int policyNumber;           // Insurance Policy Number
      private PolicyHolder policyholder;  // Creating an object or instance of the policy holder class
      
      // Constructor
      
      /**
         Default Constructor
      */
      public Policy()
         {
            providerName  = "";         
            policyNumber  = 0;
            policyholder = new PolicyHolder();
         }
      
      /**
         Constructor that accepts agruments
      */   
      public Policy(int pPolicyNumber, String pProviderName, PolicyHolder pObject)
         {
            policyNumber  = pPolicyNumber;
            providerName  = pProviderName;
            policyholder  = new PolicyHolder(pObject);
         }

      /**
         The setPolicyNumber method mutates the value of policyNumber variable.
      */
      public void setPolicyNumber(int pPolicyNumber)
         {
            policyNumber = pPolicyNumber;
         }     
      
      /**
         The getPolicyNumber method returns the value of the policyNumber variable.
         @return The user's policy number.
      */
      public int getPolicyNumber()
         {
            return policyNumber;
         } 

      /**
         The setProviderName method mutates the value of the providerName variable.
      */
      public void setProviderName(String pProviderName)
         {
            providerName = pProviderName;
         } 

      /**
         The getProviderName method returns the value of the providerName variable.
         @return The user's provider name.
      */
      public String getProviderName()
         {
            return providerName;
         }

      /**
         The calculateBMI method returns the value of the BMI variable.
         @return The calculation of Body Mass Index based of user age and weight.
      */
      public double calculateBMI()
         {
            double BMI = 0;
            BMI = (policyholder.getWeight() * 703)/Math.pow(policyholder.getHeight(),2);
            
            return BMI;
         }

      /**
         The calculatePrice method returns the value of the total_cost variable.
         @return The calculation of the total cost based off user input.
      */

      public double calculatePrice()
         {
            double base_fee       = 600.00;
            double age_fee = 75.00;
            double smoker_fee     = 100.00;
            double BMI_fee        = (calculateBMI() - 35) * 20;
            double total_cost     = 0;
            
            if(policyholder.getAge() > AGE_LIMIT)
               {
                  if(policyholder.getSmokingStatus().equalsIgnoreCase("smoker"))
                     {
                        if(calculateBMI() > BMI_LIMIT)
                           {
                              total_cost = base_fee + age_fee + smoker_fee + BMI_fee; 
                           }
                        else
                           {
                              total_cost = base_fee + age_fee + smoker_fee;
                           }
                     }
                  else
                     {
                        total_cost = base_fee + age_fee; 
                     }
               }
               
            else
               {
                  if(policyholder.getSmokingStatus().equalsIgnoreCase("smoker"))
                     {
                        if(calculateBMI() > BMI_LIMIT)
                           {
                              total_cost = base_fee + smoker_fee + BMI_fee; 
                           }
                        else
                           {
                              total_cost = base_fee + smoker_fee;
                           }
                     }
                  else
                     {
                        if(calculateBMI() > BMI_LIMIT)
                           {
                              total_cost = base_fee + BMI_fee; 
                           }
                        
                        else
                           {
                              total_cost = base_fee;
                           }
                     }
               }
               
           return total_cost;
         } 
     
      public void ToString()
         {
            System.out.printf("%n%nPolicy Number: %d %nProvider Name: %s %n%s %nPolicyholder's BMI: %,.2f %nPolicy Price: $%,.2f", policyNumber, providerName, policyholder.ToString(), calculateBMI(), calculatePrice());  
         }                 
   }
