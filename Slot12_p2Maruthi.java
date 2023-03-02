import java.io.*;
public class Slot12_p2Maruthi extends Slot12_p2Vehicle{
    int model;
    public Slot12_p2Maruthi(String type,String colour,int n,int model){
        super(type,colour,n);
        this.model=model;
    }
    public void disp(){
        super.disp();
        System.out.println("Model = "+this.model);
    }
}


