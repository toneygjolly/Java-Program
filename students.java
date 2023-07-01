import java.util.Scanner;
import java.util.TooManyListenersException;

public class students {
 public static void main(String[] args){
    System.out.println("Enter the  Student Name");
    Scanner scanner=new Scanner(System.in);
    String name = scanner.next();
    System.out.println("enter the student roll number");
    int roll=scanner.nextInt();
    System.out.println("Percentage of the student");
    float percentage=scanner.nextFloat();
    System.out.println("Name: "+name);
     System.out.println("rollnumber: "+roll);
     System.out.println("Percentage: "+percentage);
 }   
}