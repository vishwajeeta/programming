class getdata extends animal
{
    void pet()
    {
        System.out.println("dog");
    }
    public static void main(String []args){
        getdata a=new getdata();
        a.pet();
    }
}
class animal
{
    void pet(){
    System.out.println("cat");
    }
}