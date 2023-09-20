import java.awt.*;
public class MenuDemo{
    MenuDemo(){
        Frame fr=new Frame();
        MenuBar mb=new MenuBar();
        Menu fileMenu=new Menu("File");
        mb.add(fileMenu);
        MenuItem a1=new MenuItem("new");
        fileMenu.add(a1);
        fr.setMenuBar(mb);
        fr.setSize(300,300);
        fr.setLayout(null);
        fr.setVisible(true);
    }
    public static void main(String []args){
        new MenuDemo();
    }
}