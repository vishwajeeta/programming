class omg 
{
    public static void main(String []args)
    {
        System.out.println("hello world");
        golu s1= new golu();
        s1.deploy();
        s1.sample();
        s1.hii();
        s1.how();
    }
}

class golu implements vishwa
{
    public void deploy()
    {
        for(int i=0;i<500;i++)
            System.out.println("hello world!");
    }
    public void sample()
    {
        for(int i=0;i<500;i++)
        System.out.println("hii");
    }
    public void hii()
    {
        for(int i=0;i<500;i++)
        System.out.println("how");
    }
    public void how()
    {
        for(int i=0;i<500;i++)
        System.out.println("buyy");
    }
}
interface vishwa
{
    void deploy();
    void sample();
    void hii();
    void how();
}