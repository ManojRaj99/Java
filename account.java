import java.util.*;
class account{
long accNo;
String name;
long phoNo;
float balAmt=0;
Scanner sc=new Scanner(System.in);



void getdetails(){
System.out.println("enter your account no");
accNo=sc.nextLong();
sc.nextLine();
System.out.println("enter your name");
name=sc.nextLine();
System.out.println("enter your phone no");
phoNo=sc.nextLong();
System.out.println("blance in your account is rs"+balAmt);
}


void deposit(){
System.out.println("enter the ammount to be deposited");
float deposit;
deposit = sc.nextFloat();
balAmt +=deposit;
System.out.println("balance in ur account is  rs"+balAmt);
}


void withdraw(){
System.out.println("enter the ammount to withdraw");
float withdraw;
withdraw=sc.nextFloat();
if(withdraw<=balAmt){
	balAmt-=withdraw;
	System.out.println("balance amt is "+balAmt);
}
else{
System.out.println("insufficient balance");
}
}

void printdetails(){

System.out.println("account no of account holder:  "+accNo);
System.out.println("name of the account holder:  "+name);
System.out.println("phone no of the account holder:  "+phoNo);
System.out.println("your current balance is rs :    "+balAmt);
}


public static void main(String args[]){
Scanner sc=new Scanner(System.in);
Account a1=new Account();

while(true){

System.out.println("1.enter details\n2.deposit\n3.withdraw\n4.print details\n5.exit\n enter ur choice");
int choice=sc.nextInt();

switch(choice)
{
case 1: a1.getdetails();
	break;
case 2: a1.deposit();
	break;
case 3: a1.withdraw();
	break;
case 4: a1.printdetails();
	break;
case 5: 

	System.exit(0);
	break;
default :System.out.println("invalid choice");
	}
}}}