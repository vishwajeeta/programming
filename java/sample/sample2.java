import java.util.Scanner;
class omg
{
    void vishwa1(int create){
        System.out.println("create ");
    }
    void vishwa1(int create,int read){
        System.out.println("create Read");
    }
    void vishwa1(int create,int read,int update){
        System.out.println("create ,read and update");
    }
    void vishwa1(int create,int read,int update,int delete){
        System.out.println("create,read,update and delete");
    }
    public static void main(String []args){
        //access methods overloading
        omg a1=new omg();
        a1.vishwa1(1);
        //acces arrayfunction class
        arrayfunction b1=new arrayfunction();
        b1.arraydisplay();
    }
}
class arrayfunction
{
    void arraydisplay(){
        //use scanner for input creation
        Scanner oh=new Scanner(System.in);
        //declare an array with size 10
        String arr[]=new String[10];
        //taking input from user [string]
        for(int i=0;i<arr.length;i++)
        {
        String data=oh.next();
        //inserting data in array
        arr[i]=data;
    }
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);
    }
}