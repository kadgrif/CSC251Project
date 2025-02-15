import java.util.Scanner;

public class Policy
   {
      private String policyNumber;  // Insurance Policy Number
      private String providerName;  // Insurance Provider Name
      private String firstName;     // First name of policyholder
      private String lastName;      // Last name of policyholder
      private boolean smokingStatus; // Are you 
      
      private int age;              // Age of the policyholder
      private int height;           // Height of the policyholder
      private int weight;           // Weight of the policyholder
      
      public Policy()
         {
            policyNumber  = "";
            providerName  = "";
            firstName    = "";
            lastName      = "";
            smokingStatus = "";
            
            age           = 0;
            height        = 0;
            weight        = 0;
         }
         
      public Policy(String pPolicyNumber, String pProviderName, String pFirstName,
                    String pLastName, boolean pSmokingStatus, int pAge, int pHeight, int pWeight)
         {
            policyNumber  = pPolicyName;
            providerName  = pProviderName;
            firstName    = pFirstName;
            lastName      = pLastName;
            smokingStatus = pSmokingStatus;
            
            age           = pAge;
            height        = pHeight;
            weight        = pWeight;
         }
         
      public void setPolicyNumber(String pPolicyNumber)
         {
            policyNumber = pPolicyNumber;
         }          
      
      public String getPolicyNumber()
         {
            return policyNumber;
         } 
      
      public void setProviderName(String pProviderName)
         {
            providerName = pProviderName;
         } 
      
      public String getProviderName()
         {
            return providerName;
         }
         
      public void setFirstName(String pFirstName)
         {
            firstName = pFirstName;
         } 
      
      public String getFirstName()
         {
            return firstName;
         }
         
      public void setLastName(String pLastName)
         {
            lastName = pLastName;
         } 
      
      public String getLastName()
         {
            return lastName;
         }
         
      public void setSmokingStatus(boolean pSmokingStatus)
         {
            smokingStatus = pSmokingStatus;
         }   
      
      public boolean getSmokingStatus()
         {
            return smokingStatus;
         }
         
      public void setAge(int pAge)
         {
            age = pAge;
         }    
      
      public int getAge()
         {
            return age;
         }  
         
      public void setHeight(int pHeight)
         {
            height = pHeight;
         }     
      
      public int getHeight()
         {
            return height;
         }
         
      public void setWeight(int pWeight)
         {
            weight = pWeight;
         } 
         
      public int getWeight()
         {
            return weight;
         }
         
      public double calculateBMI()
         {
            double BMI = 0;
            BMI = (weight * 703)/height;
            
            return BMI;
         }
         
     public double calculatePrice()
         {
            double base_fee       = 600.00;
            double age_fee = 75.00;
            double smoker_fee     = 100.00;
            double BMI_fee        = (calculateBMI() - 35) * 20;
            double total_cost     = 0;
            
            if(age > 50)
               {
                  if(smokerStatus == TRUE)
                     {
                        if(calculateBMI() > 35)
                           {
                              total_cost = base_fee + age_fee + smoker_fee + BMI_fee; 
                           }
                     }
                  else
                     {
                        if(calculateBMI() > 35)
                           {
                              total_cost = base_fee + age_fee + BMI_fee; 
                           }
                     }
               }
               
            else
               {
                  if(smokerStatus == TRUE)
                     {
                        if(calculateBMI() > 35)
                           {
                              total_cost = base_fee + smoker_fee + BMI_fee; 
                           }
                     }
                  else
                     {
                        if(calculateBMI() > 35)
                           {
                              total_cost = base_fee + BMI_fee; 
                           }
                        
                        else
                           {
                              total_cost = base_fee;
                           }
                     }
               }
         }              
   }