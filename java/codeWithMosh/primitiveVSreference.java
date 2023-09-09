import java.awt.*;
class sample1{
    public static void main(String [] args){
        System.out.println("primitive type");
        int x=10;
        int y=x;
        x=2;
        //x and y are completely independent on each other
        System.out.println(y);
        System.out.println("Reference type");
        Point point1=new Point(10,20);
        //allocate some memory to store point object
        //point1 store address/reference of point object
        Point point2=point1;
        System.out.println(point2);
        point1.x=2;
        System.out.println(point2);
        System.out.println(point1);

    }
}