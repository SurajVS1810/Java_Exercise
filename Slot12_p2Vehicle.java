import java.io.*;
public class Slot12_p2Vehicle implements Serializable{
    String type;
    String colour;
    int n;
    public Slot12_p2Vehicle(String type,String colour,int n){
        this.type=type;
        this.colour=colour;
        this.n=n;
    }
    public void disp(){
        System.out.println("Type = "+this.type);
        System.out.println("Colour = "+this.colour);
        System.out.println("No of wheels = "+this.n);
    }
}

