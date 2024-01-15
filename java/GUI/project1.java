//set password and insert data in GUI
import java.awt.*;
import java.util.Scanner;
class vishwa3{
    public void golu(String data){
        Frame ajeet=new Frame();
        ajeet.setTitle("hello");
        ajeet.setSize(500,500);
        Label a1=new Label(data);
        ajeet.add(a1);
        ajeet.setVisible(true);
        
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Password:");
        
        int password=sc.nextInt();
        vishwa3 omg=new vishwa3();
        
        if(password == 12345678)
        {
        System.out.println("password verified!");
        System.out.println("Enter the message:");
        String data=sc.next();
            omg.golu(data);
        }
        else{
            System.out.println("invallid Password");
        }
        System.out.println("buyy");
    }
}