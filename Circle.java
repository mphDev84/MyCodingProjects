import java.util.Scanner;
class AreaOfCircle 
{
   public static void main(String args[]) 
    {   
       
	   //simple program that calculates the area of a circle, given user input of radius
	   
      Scanner s= new Scanner(System.in);
        
         System.out.println("Enter the radius:");
         double r= s.nextDouble();
         double  area=(22*r*r)/7 ;
         System.out.println("Area of Circle is: " + area);      
   }
}