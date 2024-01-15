import java.awt.*;
public class vishwajeet extends canvas{
    public void paint(Graphics g)
    {
        g.drawRect(50,75,100,50);
    }
    public static void main(String []args)
    {
        vishwajeet d=new vishwajeet();
        Frame f=new Frame("Shapes");
         f.add(d);
         f.setSize(300,450);
         f.setVisible(true);
        
    }
}