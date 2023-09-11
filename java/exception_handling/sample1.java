public class Sample1{
    public static void main(String [] args)
    {
        String city=null;
        try{
        if(city.equals("banglore"))
        {
            System.out.println("statement executed as banglore");
        }
        }
        catch(NullPointerException e){
            System.out.println("catch block is executed");
        }
        finally{
            System.out.println("final block is executed at the end");
        }
        System.out.println("the end!");
    }
    }