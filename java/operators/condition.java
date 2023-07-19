import java.util.Scanner;
class omg
{
public static void main(String []args)
{
System.out.println("hello World!");
for(int i=1;i<10;i++)
{
System.out.println("hii"+i);
}
int i=0;
while(i<=10)
{
System.out.println(i);
i++;
}

Scanner sc=new Scanner(System.in);
System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Exit / Quit");
int choice=sc.nextInt();

switch(choice)
{
case 1:System.out.println("choosen Addition");
	break;
case 2:System.out.println("choosen Subtraction");
	break;
case 3:System.out.println("choosen Multiplication");
	break;
case 4:return;
default:System.out.println("invallid choice");

}

int a=10,b=20,temp;
System.out.println("Before a="+a+" b="+b);
System.out.println("Swap values");
temp=a;
a=b;
b=temp;
System.out.println("After a="+a+" b="+b);


}
}