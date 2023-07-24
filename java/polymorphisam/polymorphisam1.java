public class WatsApp4
{
    public static void main(String []args)
    {
        WatsApp1 omg=new WatsApp1();
        omg.status("vishwa");
        omg.status(1.8);
        omg.status(6);
        
    
    }
}

public class WatsApp2 extends WatsApp3
{
    void status(double hii)
    {
        System.out.println("version_2 "+hii);
       
    }
}


public class WatsApp3 
{
    void status(int a)
    {
        System.out.println("version_3 "+a);
       
    }
}

public class WatsApp1 extends WatsApp2
{
    void status(String omg)
    {
        System.out.println("version_1 "+omg);
       
    }
}


