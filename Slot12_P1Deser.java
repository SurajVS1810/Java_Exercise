import java.io.*;
public class Slot12_P1Deser {
    public static void main(String args[])
    {
        Slot12_p1Student s=null;
        try{
            FileInputStream fin=new FileInputStream("D:\\javarecord\\Slot 12\\student.txt");
            ObjectInputStream ois=new ObjectInputStream(fin);
            s=(Slot12_p1Student)ois.readObject();
            fin.close();
            ois.close();
            s.disp();
        }catch(IOException e){System.out.println(e);}
        catch(ClassNotFoundException f){System.out.println(f);}
    }
}
