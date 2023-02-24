//  Create a class “height” having a foot and inch part. Provide functions for read, display, add and multiplying two heights
import java.io.*;
import java.lang.*;
class height{
    int foot;
    int inch;
    public void read()
    {
         try{
            DataInputStream dis = new DataInputStream(System.in);
            System.out.print("Enter the foot of the height : ");
            foot=Integer.parseInt(dis.readLine());
            System.out.print("\nEnter the inch of the height : ");
            inch=Integer.parseInt(dis.readLine());
        }catch(IOException e){System.out.println(e);}
    }
    public void disp(){
        System.out.println("The height is "+foot+" foot and "+inch+" inches");
    }
}
class Slot4_p5
{
    public static void main(String args[]){
       height h1= new height();
       System.out.println("Enter height 1 details ");
        h1.read();
        h1.disp();
        height h2= new height();
        System.out.println("Enter height 2 details ");
        h2.read();
        h2.disp();
    }
}