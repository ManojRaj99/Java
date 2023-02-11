import java.util.Scanner;
import java.lang.*;
class accountr
{
int accno,phno;
        String name="";
float bal_amt=0;
float credit,debit;
          Scanner sc = new Scanner(System.in);

       void getinput()
{

          System.out.println("enter your acc. number:");
          accno = sc.nextInt();
 System.out.println("enter your phone number:");
 phno = sc.nextInt();
 System.out.println("enter your name please:");
 name = sc.next();
          System.out.println("welcome "+name);
}
       
       void deposit()
{
 System.out.println("enter the amount to be deposited:");
 credit = sc.nextFloat();
          bal_amt+=credit;
 System.out.println("your present balance is: "+bal_amt);
return;
}
   
       void withdrawal()
       {
         System.out.println("enter the amount to be withdrawn:");
         debit = sc.nextFloat();
           if(bal_amt<debit)
  System.out.println("insufficient balance");
           else
{
  bal_amt-=debit;
           System.out.println("your present balance is "+bal_amt);
}
       }
   

public static void main(String[] args)
{
          int choice;
         accountr obj = new accountr();
Scanner sc = new Scanner(System.in);
 obj.getinput();
          while(true)
{
         System.out.println("enter your choice:");
System.out.println("1.deposit");
System.out.println("2.withdrawal");
System.out.println("3.exit");
         choice = sc.nextInt();

         switch(choice)
{
         case 1: obj.deposit();
        System.out.println("thank you");
        break;
         case 2: obj.withdrawal();
        System.out.println("thank you");
                 break;
case 3: System.exit(0);
                 break;
         default:System.out.println("thank you");
        break;
        }
       }
      }
}
