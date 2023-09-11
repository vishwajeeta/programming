import java.io.RandomAccessFile;
import java .io.IOException;

public class Sample1{
    public static void main(String [] args) throws IOException
    {
        RandomAccessFile raf=new RandomAccessFile("index.txt","rw");
        while(true){
            String s=raf.readLine();
            if(s==null){
                break;
            }
            System.out.println(s);
            
        }

    }
}