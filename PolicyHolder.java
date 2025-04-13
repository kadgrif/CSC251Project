public class PolicyHolder
   {
      private String firstName;     // First name of policyholder
      private String lastName;      // Last name of policyholder
      private String smokingStatus; // Are you a smoker or non-smoker? 
      
      private int age;              // Age of the policyholder
      private double height;           // Height of the policyholder
      private double weight;           // Weight of the policyholder
      
      // Constructors
      
      /**
         Default Constructor
      */
      public PolicyHolder()
         {
            firstName     = "";
            lastName      = "";
            smokingStatus = "";
            
            age           = 0;
            height        = 0;
            weight        = 0;
         }
      
      /**
         Constructor that accepts arguments for every field
      */   
      public PolicyHolder(String pFirstName, String pLastName, String pSmokingStatus, int pAge, double pHeight, double pWeight)
         {
            firstName    = pFirstName;
            lastName      = pLastName;
            smokingStatus = pSmokingStatus;
            
            age           = pAge;
            height        = pHeight;
            weight        = pWeight;
         }
      
      /**
         Constructor that creates a copy instance of the object
      */
      public PolicyHolder(PolicyHolder pObject)
         {
            firstName     = pObject.firstName;
            lastName      = pObject.lastName;
            smokingStatus = pObject.smokingStatus;
            
            age           = pObject.age;
            height        = pObject.height;
            weight        = pObject.weight;               
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
         The ToString method returns for string containing information about the class's methods and fields
      */
      public String ToString()
         {
            String str = "Policyholder's First Name: " + firstName + "\nPolicyholder's Last Name: " + lastName 
                         + "\nPolicyholder's Smoking Status: " + smokingStatus
                         + "\nPolicyholder's Age: " + age + "\nPolicyholder's Height: " + height + " inches\nPolicyholder's Weight: " + weight + " pounds"; 
            return str;             
         }
      
   }