import java.util.Scanner;
import java.lang.*;
class Stack{
    int size;
    int top;
    int a[];
    Scanner sc = new Scanner(System.in);
    Stack(int size,int top){
        this.size = size;
        this.top = top;
        this.a= new int[size];
    }

     void push(int item){
        if(top == size-1){
            System.out.println("Stack Overflow");
        }
        else{
            a[++top] = item;
        }
    }

    void  pop(){
        if(top == -1){System.out.println("stack underflow");
            return ;
        }
        else{System.out.println("element poped is "+a[top--]);
            
        }
    }

     void display(){
        if(top == -1){
            System.out.println("Stack Underflow");
        }
        else{
            System.out.print("The elemnets of the array are:  ");
            for(int i=0;i<=top;i++)
                System.out.print(a[i]+"  ");
        }
    }
    public static void main(String[] args){
	int size;

        System.out.println("Enter the size of the stack:   ");
        
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        Stack st = new Stack(size,-1);

        while(true){
            
            System.out.println("1.Push\n2.pop\n3.display\n4.exit\nenter your choice");
           
            int choice;
          
            choice = sc.nextInt();

            switch(choice){
                case 1:
                        System.out.println("Enter the element you wanna push into the stack");
                        int element;
                        element= sc.nextInt();
                        st.push(element);
                        break;

                case 2:st.pop();
                        
                        break;
                case 3:
                        st.display();
                        break;
                case 4:
                        System.exit(0);
                default:
                        System.out.println("Invalid choice");
            }
        }
    }
}