import java.util.*;
class bubble{
public static void main(String args[]){
System.out.println("enter the size of array");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
System.out.println("enter array elements");
for ( int i=0;i<n;i++){
	a[i]=sc.nextInt();
}
for(int i=0;i<n;i++){
	for(int j=0;j<n-i-1;j++){
		if(a[j]>a[j+1]){
			int temp=a[j+1];
			a[j+1]=a[j];
			a[j]=temp;
			}
		}	
	}

System.out.println("elements after sorting");
for(int i=0;i<n;i++)
System.out.println(a[i]+"");
}}