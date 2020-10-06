import java.util.Scanner;
class Q24{
      public static void main(String args[]){
           Scanner sc=new Scanner(System.in);
           System.out.println("enter size of array");
           int N=sc.nextInt();
           int flag=0; 
           int arr[]=new int[N];
           for(int i=0;i<arr.length;i++)
          {

             System.out.println("enter element");
             arr[i]=sc.nextInt();
          }
          
          System.out.println("enter searching element");
          int ser=sc.nextInt();
          outer:
          for(int a:arr)
          {
             
              if(a==ser)
              {
                 flag=1;
                 break outer;

              }


          }
         if(flag==1)
         {

            System.out.println("Available");
         }
         else{
            System.out.println("Not avaialble");

         } 
          


}


}