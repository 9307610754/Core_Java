import java.util.Scanner;
class Q18{
      public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number");
      int num=sc.nextInt();
      int i=2;
      while(num%i !=0)
      {
           i++;
              
      }
      
      if(i<num)
     {
          System.out.println("Not prime number");

     }
     else
     {

        System.out.println("Prime Number");
     }
  }

}