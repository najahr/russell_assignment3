package russell_problem1;

import java.util.*;
public class Quiz {
   public static void main(String[] args) {
           quiz();
       }
   public static void quiz() {
       Random rand = new Random();
       Scanner sc=new Scanner(System.in);
       int i=1,c=0,r=0;
       while (i<=10) {
           int num1 = rand.nextInt(10);
           int num2 = rand.nextInt(10);
           int val1 = askQuestion(num1, num2);
           int val2 = readResponse();
           if (val1 == val2) {
               displayCorrectResponse();
               c++;       //it will count the no.of correct answers
               // break;
           }
           else{
               displayIncorrectResponse();
               r++;   //counts the no.of wrong answers
           }
           i++;
       }
       displayCompletionMessage(c);   //calling displayCompletionMessage() by taking no.of correct answers as parameter
       System.out.println("Do you want to solve another new problem(Y/N)?");
       char ch=sc.next().charAt(0);
       if(ch=='Y')
           quiz();       //reseting the game
       else
           System.exit(0);   //terminate the program
   }
   public static int readResponse() {
       Scanner scn = new Scanner(System.in);
       int val = scn.nextInt();
       return val;
   }
   public static int askQuestion(int num1, int num2) {
       System.out.println("How much is " + num1 + " times " + num2);
       return num1 * num2;
   }
   public static boolean isAnswerCorrect(int val1, int val2) {
       if (val1 == val2) {
           return true;
       }
       return false;
   }
   public static void displayCorrectResponse() {
       Random rand = new Random();//make here random function and then
       int ForRep = rand.nextInt(4)+1;//it will generate one random number with 1 to 4
       switch (ForRep) {
           case 1:
           System.out.println("Very Good!");//output display
           break;
           case 2:
           System.out.println("Excellent!");//output display
           break;
           case 3:
           System.out.println("Nice Work!");//output display
           break;
           case 4:
           System.out.println("Keep Up The Good Work");//output display
           break;
       }
   }
   public static void displayIncorrectResponse() {
           Random rand = new Random();//make here random function and then
           int ForRep = rand.nextInt(4)+1;//it will generate one random number with 1 to 4
           switch (ForRep) {//display here
               case 1:
               System.out.println("No. Please try again.");//output display
               break;
               case 2:
               System.out.println("Wrong.Try Once More.");//output display
               break;
               case 3:
               System.out.println("Don't Give Up!");//output display
               break;
               case 4:
               System.out.println("No Keep Trying.");//output display
               break;
           }
   }
   public static void displayCompletionMessage(int c)
   {
       float p=(float)c/10*100;   //calculation of score percentage
       System.out.println("Your Score is"+p+"%");
       if(p>=75)
           System.out.println("Congratulations, you are ready to go to the next level!");
       else
           System.out.println("Please ask your teacher for extra help.");
   }
}