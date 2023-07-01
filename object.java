import javax.swing.text.AbstractDocument.LeafElement;

class Box{
    double length;
    double width;
    double height;

    public Box(){
    length =1;
    height =1;
    width  =1;  
     
    }
    public Box(double l,width w,height h){
        length =l;
        height =h;
        width  =w;
    }
    public void volume()
    {
        System.out.println("Volume: "+(height*length*width));
    }
    public void equal(Box b1){
        if(b1.height==height && b1.width==width && b1.length==length){
            System.out.println("Equal");
        }
        else{
            System.out.println("not Equal");
        }
    }
}







public class object {
    public static void main(String[]args){
    Box b1=new Box();
    b1.volume();
      Box b2=new Box(10,45.99,32,21);
    b2.volume();
    b1.equal(b2);


    }
}
