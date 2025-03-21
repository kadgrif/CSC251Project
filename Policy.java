public class Policy
   {
      
      private String providerName;  // Insurance Provider Name
      private String firstName;     // First name of policyholder
      private String lastName;      // Last name of policyholder
      private String smokingStatus; // Are you a smoker or non-smoker? 
      
      private int policyNumber;  // Insurance Policy Number
      private int age;              // Age of the policyholder
      private double height;           // Height of the policyholder
      private double weight;           // Weight of the policyholder
      
      public Policy()
         {
            
            providerName  = "";
            firstName     = "";
            lastName      = "";
            smokingStatus = "";
            
            policyNumber  = 0;
            age           = 0;
            height        = 0;
            weight        = 0;
         }
         
      public Policy(int pPolicyNumber, String pProviderName, String pFirstName,
                    String pLastName, String pSmokingStatus, int pAge, double pHeight, double pWeight)
         {
            policyNumber  = pPolicyNumber;
            providerName  = pProviderName;
            firstName    = pFirstName;
            lastName      = pLastName;
            smokingStatus = pSmokingStatus;
            
            age           = pAge;
            height        = pHeight;
            weight        = pWeight;
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
         The setFirstName method mutates the value of the firstName variable.
      */
      public void setFirstName(String pFirstName)
         {
            firstName = pFirstName;
         } 

      /**
         The getFirstName method returns the value of the firstName variable.
         @return The user's first name.
      */
      public String getFirstName()
         {
            return firstName;
         }

      /**
         The setLastName method mutates the value of the lastName variable.
      */
      public void setLastName(String pLastName)
         {
            lastName = pLastName;
         } 

      /**
         The getLastName method returns the value of the lastName variable.
         @return The user's last name.
      */
      public String getLastName()
         {
            return lastName;
         }
      
      /**
         The setSmokingStatus method mutates the value of the smokingStatus variable.
      */   
      public void setSmokingStatus(String pSmokingStatus)
         {
            smokingStatus = pSmokingStatus;
         }   

      /**
         The getSmokingStatus method returns the value of the smokingStatus variable.
         @return The smoking status of the user.
      */
      public String getSmokingStatus()
         {
            return smokingStatus;
         }

      /**
         The setAge method mutates the value of the age variable.
      */
      public void setAge(int pAge)
         {
            age = pAge;
         }    

      /**
         The getAge method returns the value of the age variable.
         @return The age of the user.
      */
      public int getAge()
         {
            return age;
         }  

      /**
         The setHeight method mutates the value of the height variable.
      */
      public void setHeight(double pHeight)
         {
            height = pHeight;
         }     

      /**
         The getHeight method return the value of the height variable.
         @return The height of the user.
      */
      public double getHeight()
         {
            return height;
         }

      /**
         The setWeight method mutates the value of the weight variable.
      */
      public void setWeight(double pWeight)
         {
            weight = pWeight;
         } 

      /**
         The getWeight method returns the value of the weight variable.
         @return The weight of the user.
      */
      public double getWeight()
         {
            return weight;
         }

      /**
         The calculateBMI method returns the value of the BMI variable.
         @return The calculation of Body Mass Index based of user age and weight.
      */
      public double calculateBMI()
         {
            double BMI = 0;
            BMI = (weight * 703)/Math.pow(height,2);
            
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
            
            if(age > 50)
               {
                  if(smokingStatus.equalsIgnoreCase("smoker"))
                     {
                        if(calculateBMI() > 35)
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
                  if(smokingStatus.equalsIgnoreCase("smoker"))
                     {
                        if(calculateBMI() > 35)
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
               
           return total_cost;
         }              
   }