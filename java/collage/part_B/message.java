import java.awt.*;

public class FrameDemo{
    FrameDemo(){
        Frame fm=new Frame();
        fm.setTitle("hello world");
        Label lb=new Label("hello sir");
        fm.add(lb);
        fm.setSize(300,300);
        fm.setVisible(true);
    }
public static void main(String []args)
{
    FrameDemo fd=new FrameDemo();
}
}