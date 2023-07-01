class TestOverloading
{
void sum()
{
    System.out.println("In sum function");
}
void sum(int x,int y)
{
     System.out.println("x+y"+(x+y));
}
void sum(float x,float y)
{
     System.out.println("x+y"+(x+y));
}
} 
public class methodOverloading {
    public static void  main(String[] args){
    TestOverloading test =  new TestOverloading();
    test.sum(); 
    test.sum(3,2);
    test.sum(12.22,34.44);
    }
}
