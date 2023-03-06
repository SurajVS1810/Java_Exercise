import java.io.*;
public class Slot12_p4Deser {
    public static void main(String args[])
    {
        Slot12_p4Employee e=null;
        try{
            FileInputStream fin=new FileInputStream("D:\\javarecord\\Slot 12\\emp.txt");
            ObjectInputStream ois=new ObjectInputStream(fin);
            e=(Slot12_p4Employee)ois.readObject();
            fin.close();
            ois.close();
            e.disp();
        }catch(IOException m){System.out.println(m);}
        catch(ClassNotFoundException f){System.out.println(f);}
    }
}
