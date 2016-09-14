package userinput;
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("What's your name?");
       
        String answername = sc.nextLine();
        
        System.out.println("What's your age?");
    
        String answerage = sc.nextLine();
        
        System.out.println("What's your user login?");
          
        String answeruser = sc.nextLine();
        
        System.out.println("What's your student ID?");
         
        String answerstudent = sc.nextLine();
        
        System.out.println("What year are you in?");
    
        String answeryear = sc.nextLine();
     
        System.out.println("Name: " + answername );  
        System.out.println("Age: " + answerage);
        System.out.println("ID: " + answeruser);
        System.out.println("Year: " + answeryear);
       
    
    }
    
}
