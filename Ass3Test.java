import java.util.*;

public class Ass3Test 
{
   public static void main(String[] args)
   {  
      /*This part identifies first if 
      the entered letter is either of the
      three choices.*/
      try 
      {  
         //Variables
         char ch;
         double parkHrs;
         double ttl;
         
         Scanner c = new Scanner(System.in);
         
         System.out.print("Choose your vehicle type");
         System.out.println(" ");
         System.out.println("C- Car / B - Bus / T- Truck: ");
         
         /*Accepts only the first character of anything entered
         because of the index 0 inside charAt. It is also converted
         to upper case.*/
         ch = c.next().toUpperCase().charAt(0);
         
        /*if else statements that identify if the input is 
        either C, B, or T. Any letter other than that is an error.*/
         if (ch == 'C' || ch == 'B' || ch == 'T')
         {
            System.out.println("Enter your parking time: ");
            parkHrs = c.nextDouble();
           
            if (ch == 'C')
            {
               ttl = 20 * parkHrs;
               System.out.println("Total fee: PHP " + String.format("%.2f", ttl));
               //String.format is used to display the total payment with two decimal places   
            }
            
            else if (ch == 'B')
            {
               ttl = 35 * parkHrs;
               System.out.println("Total fee: PHP " + String.format("%.2f", ttl));
            }
            
            else if (ch == 'T')
            {
               ttl = 50 * parkHrs;
               System.out.println("Total fee: PHP " + String.format("%.2f", ttl));
            }
         }
         
         /*The error, if the user entered a letter not from the choices.*/
         else 
         {
            System.out.println("ERROR: Please refer to the vehicle choices.");   
         }
      }
      
      /*The catch block which catches the error when the user entered a letter
      in the part where it asks for a parking duration.*/ 
      catch (Exception e)
      {
         System.out.println("ERROR: Please enter the correct parking duration.");
      }
   }
}