package russell_problem1;

import java.util.*;
public class Quiz{

static Scanner sc=new Scanner(System.in);
static Random rm=new Random();
static int count=0, cor=0, incor=0;

public static void main(String[] args) {

	System.out.println("Difficulty level");
   System.out.println("Enter Level number ");
   int lb=sc.nextInt();
   switch(lb){
   case 1:while(count< 10){
   count++;
   int n1=rm.nextInt(10);
   int n2=rm.nextInt(10);
Random rnum = new Random();
   mult(n1, n2);
}
   percen();
   break;
   case 2:while(count< 10){
   count++;
   int n1=rm.nextInt(100);
   int n2=rm.nextInt(100);
Random rnum = new Random();
   mult(n1, n2);
}
   percen();
   break;
}
}
    // multiplication
   static void mult(int n1, int n2){
   System.out.println("Monitor Student Performance");
   int multi=n1*n2;
   while(true){
   System.out.println("How much "+n1+" times "+n2+"?");
   int n3=sc.nextInt();
   if(n3==multi){
   cor++;
   correct();
   break;
   }
   else{
   incor++;
   incorrect();
   break;
   }
}
}
//multiplication end
   static void correct(){
   int c1=rm.nextInt(4);
   switch(c1){
   case 0: System.out.println("Very Good !");
   break;
   case 1: System.out.println("Excellent !");
   break;
   case 2: System.out.println("Nice Work !");
   break;
   case 3: System.out.println("Keep up the good work !");
   break;
}
}
   static void incorrect(){
   int c2=rm.nextInt(4);
   switch(c2){
   case 0: System.out.println("No, please try again !");
   break;
   case 1: System.out.println("wrong, try once more !");
   break;
   case 2: System.out.println("Don't give up !");
   break;
   case 3: System.out.println("No, keep trying!");
   break;
}
}
   static void percen(){
   if(cor>= 7.5){
    System.out.println("Congratulation");
}
   else {
   System.out.println("Please ask your teacher for extra help");
}
}  
}