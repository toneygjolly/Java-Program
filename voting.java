import java.util.Scanner;

public class voting {
    public static void main(String[] args){
        System.out.println("EWnter your age");
        Scanner T=new Scanner(System.in);
        int age =T.nextInt();
        if(age>18){
            System.out.println("Eligible for voting");

        }
        else if(age<0){
            System.out.println("Invalid number");
        }
        else{
            System.out.println("notEligible for voting");
        }

    }
}
