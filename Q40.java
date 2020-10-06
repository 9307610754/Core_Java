public class Q40{

      public static void main(String[] args){
           
          Scanner sc=new Scanner(System.in);
          Student arr[]=new Student[10];
          for(int i=0;i<arr.length;i++){

                  System.out.println("Enter Student name");
                  String n=sc.next();
                  System.out.println("Enter Student rollno");
                  int r=sc.nextInt();
                  System.out.println("Enter Student age");
                  int a=sc.nextInt()
                  System.out.println("Enter Student score");
                  int sco =sc.nextInt();
                  Student s=new Student(n,r,a,sco);
                  arr[i]=s;
            }
            System.out.println("Group 0 to 50");
            for(int i=0;i<arr.length;i++){
                  if(arr[i].getScore() > 0 && arr[i].getScore <=50){
                       arr[i].show();
            
                }


            }




        }






    }







 }


