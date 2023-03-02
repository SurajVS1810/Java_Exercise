import java.io.*;
public class Slot12_p3hasDeser {
    public static void main(String args[])
    {
        Slot12_p3Engine m=null;

        try{
            FileInputStream fin=new FileInputStream("D:\\javarecord\\Slot 12\\engine.txt");
            ObjectInputStream ois=new ObjectInputStream(fin);
            m=(Slot12_p3Engine)ois.readObject();
            fin.close();
            ois.close();
            m.disp();
        }catch(IOException e){System.out.println(e);}
        catch(ClassNotFoundException f){System.out.println(f);}
    }
}

