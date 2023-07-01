import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class buffer {
    public static void main(String[] args) throws IOException{
        System.out.println("Enter the name");
        //buffered method
        InputStreamReader in =new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(in);
        String name =bufferedReader.readLine();
        
        System.out.println("Enter the total mark: ");
        int totalMark=Integer.parseInt(bufferedReader.readLine());
        
        System.out.println("Enter the pervious year percentage: ");
        float percentage=Float.parseFloat(bufferedReader.readLine());
        //display
        System.out.println("Nmae: "+name);
        System.out.println("Total mark: "+totalMark);
        System.out.println("pervious year %: "+percentage);

    }
}
