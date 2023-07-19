class Vishwa
{
    public static void main(String []args)
    {
        int a=10;
        int b=20;
        int c=15;
        System.out.println("Addition="+(a+=c));//a=a+c
        System.out.println("Subtraction="+(a-=c));//a=a-c
        System.out.println("Multiplication="+(a*=c));//a=a*c
        System.out.println("Division="+(c/=a));//c=c/a
        System.out.println("Modelater="+(a%=b));//a=a%b
    }
}
