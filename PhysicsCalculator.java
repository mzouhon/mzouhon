/** This is a physics calculator that lets the user calculate
displacement, average velocity, or final velocity. It first provides
a menu for the user to choose what to calculate. Then it asks for certain
values needed to calculate whatever was chosen. There is some
error checking for the time variable and it prompts the user to enter a positive
time if they enter in a negative one. There is also error checking to ensure
one of the menu items is selected. Once the user provides all the values 
needed to calculate, the variable is then outputted. The user is then asked
if they would like to make another calculation and they can type yes or no.
Depending on their answer, the program restarts or ends.

**/

import java.util.Scanner;

public class PhysicsCalculator{
   public static void main (String[]args){
      char displacement='a';
      char averageVelocity='b';
      char finalVelocity='c';
      
      
      boolean i=true;
      
   
      Scanner x= new Scanner(System.in);
      
/** usage of a while loop to allow the user to calculate as many times as they 
would like

**/
while (i=true){
      
      System.out.println("Type in the letter of the value you would like to solve for!");
      System.out.println("a) displacement");
      System.out.println("b) average velocity");
      System.out.println("c) final velocity");
      
    /** usage of entering character to simplify experience for user
    
    **/  
      char choice= x.next().charAt(0);
      
      //process for displacement
      if (choice== displacement){
         System.out.println("What is your initial displacement?");
         double xi=x.nextDouble();
       
         System.out.println("What is your initial velocity?");
         double vi=x.nextDouble();

         System.out.println("What is your time?");
         double t=x.nextDouble();
         
          //form of error checking to enure time value isn't negative
          while (t<0){
      System.out.println("Time can't be negative. What is your time?");
       t=x.nextDouble();
       }
       

         System.out.println("What is your acceleration?");
         double a=x.nextDouble();
         
         double displacementAnswer= xi + (vi * t) + (1/2) * a * (t *t);
         
         System.out.println("Your displacement is " + displacementAnswer + ".");
        
        
        System.out.println("Would you like to make another calculation?");
        System.out.println("Type 'yes' or 'no'.");
       
       
       String answer= x.next();
       
       //way to exit "infinite" loop
       
       if (answer.equals("no")){
       break;
       
       } 

     //process for average velocity
      }else if(choice== averageVelocity){
      System.out.println("What is your change in displacement?");
      double cx=x.nextDouble();
      
      System.out.println("What is your time?");
      double t=x.nextDouble();
       
       while (t<0){
      System.out.println("Time can't be negative. What is your time?");
       t=x.nextDouble();
       }

           
      double averageVelocityAnswer= cx / t;
      
      System.out.println("Your average velocity is " + averageVelocityAnswer + ".");
      
      System.out.println("Would you like to make another calculation?");
        System.out.println("Type 'yes' or 'no'.");
       
       
       String answer= x.next();
       
       if (answer.equals("no")){
       break;
       }
       }
      
      //process for final velocity
     /**usage of 'else if' just in case user does not type any of the letters so I can insert an else statement later that
     clarifies the prompt**/
     
 
      else if (choice== finalVelocity){
       System.out.println("What is your initial velocity?");
       double vi=x.nextDouble();
       
       System.out.println("What is your acceleration?");
       double a=x.nextDouble();
       
       System.out.println("What is your time?");
       double t=x.nextDouble();
       
        while (t<0){
      System.out.println("Time can't be negative. What is your time?");
       t=x.nextDouble();
       }

       
       double finalVelocityAnswer= vi + (a * t);
       
       System.out.println("Your final velocity is " + finalVelocityAnswer + "."); 
               
        System.out.println("Would you like to make another calculation?");
        System.out.println("Type 'yes' or 'no'.");
       
       
       String answer= x.next();
       
       if (answer.equals("no")){
       break;
       }
        } else{
      System.out.println("Your options are a, b, or c.");
      }
       }
       }}



