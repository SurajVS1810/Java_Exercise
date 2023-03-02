import java.io.*;
public class Slot12_p3Engine implements Serializable{
    String engine;
    Slot12_p2Vehicle v=new Slot12_p2Vehicle("Bike","Blue",2);
    public Slot12_p3Engine(String engine){
        this.engine=engine;
    }
    public void disp(){
        v.disp();
        System.out.println("Engine = "+this.engine);
    }
}


