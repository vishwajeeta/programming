#include<stdio.h>

void main()
{
int x,n,result;
printf("Enter the position integer and its power\n");
scanf("%d%d",&x,&n);
result=power(x,n);
printf("answer=%d",result);
getch();
}
int power(int x,int n)
{
int temp=1;
if(n==0)
return 1;
temp=power(x,n/2);
if((n%2)==0)
return (temp*temp);
else
return (x*temp*temp);
}