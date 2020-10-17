import java.util.*;

interface Stack
{
    void push(String s);
    void pop();
}

class StringStack implements Stack
{
    public int top=-1;
    public int max=10;
    public String a[]=new String[max];
    
   
    
    
   public void push(String s)
   {;
       if(top>=9)
       {
           System.out.println("Stack is full");
       }
       
       else
       {
          top+=1;
          a[top]=s;
       }
   }
   
 public void pop()
   {
      if(top<0)
      {
          System.out.println("Stack is empty");
      }
      
      else
      {
          top-=1; if(top==-1) System.out.println("Stack is empty");
      }
   }
   
   void PrintStack()
   {
      for(int i = top;i>=0;i--)
      {
         System.out.println(a[i]);
      }
   }
   
}   



class solution
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int pop_number = input.nextInt();
        input.nextLine();
        
        StringStack s = new StringStack();
        
        for(int i = 0 ; i<size ; i++)
        {
            String l = input.nextLine();
            s.push(l);
        }
        
        s.PrintStack();
        
        for(int i=0;i<pop_number;i++)
        {
            s.pop();
        }
        s.PrintStack();
    }
}