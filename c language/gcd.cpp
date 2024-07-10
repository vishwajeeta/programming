#include<stdio.h>
#include<conio.h>
int gcd(int,int);
int gcd1 (int,int,int);
int main() {
int n1,n2,n3,m;
printf("enter 3numbers:");
scanf("%d %d yd",&n1,&n2,&n3);
printf("gcd of /t %d/t%d/t %d/t%d/t is%d ",
      n1,n2,n3,gcd1(n1,n2,n3));
getch();
}
int gcd(int n1 ,int n2)
{
 if(n2!=0)
     return gcd(n2,n1%n2);
 else
     return n;
}
int gcdl(int n1,int n2,int n3)
{
  if(n3!=0)
   return (n3,gcd(n1,n2));
}
