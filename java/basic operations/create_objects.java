class vishwa
{
    public static void main(String []args)
    {
        System.out.println("hello world");
        //if method of main and called method are static [no need to create object]
        
        vishwa r1=new vishwa();//object is created
        r1.omg();//method of an created object is called
    }
    void omg()
    {
        System.out.println("hello world");
    }
}