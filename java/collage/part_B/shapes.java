import java.awt.*;
public class drawings extends Canvas{
    public void paint(Graphics g)
    {
        g.drawRect(50,75,100,50);
    }
    public static void main(String [] args){
        drawings d=new drawings();
        Frame f=new Frame("shapes");
        f.add(d);
        f.setSize(300,450);
        f.setVisible(true);
    }
}