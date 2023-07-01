import java.util.Scanner;

public class inputfunction{
public static void main(String[] args){
    System.out.println("Enter the first number");
    Scanner scanner =new Scanner(System.in);
    int fNum = scanner.nextInt();
    System.out.println("Enter the second number");
    int sNum=scanner.nextInt();
    int result =fNum + sNum;
    System.out.println("Result"+result);
    
}  
}