import java.awt.*;
class vishwa2{
    vishwa2(){
        Frame a1=new Frame();
        a1.setTitle("hello");
        a1.setSize(300,300);
        //displaying hello world in background
        Label b=new Label("Hello World!");
        a1.add(b);
        a1.setVisible(true);
    }
    public static void main(String []args){
        vishwa2 omg=new vishwa2();
    }
}