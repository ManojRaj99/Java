import java .util.Scanner;
class fibb{
public static void main(String args[]){
System.out.println("enter the no of elements");
Scanner sc=new Scanner(System .in);
int n =sc.nextInt();
System.out.println("FIBB SERIES");
int a=0,b=1;
if(n>=1)
System.out.println(a);
if(n>=2)
System.out.println(b);
int f;
for(int i=3;i<=n;i++)
{
f=a+b;
System.out.println(f);
a=b;
b=f;
}}
}