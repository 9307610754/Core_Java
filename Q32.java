import java.util.Scanner;
class Student{
       private int rollNo;
       private String nam;
       static int count=0;
       void setData(int roll,String nav){
         rollNo=roll;
         nam=nav;
      }
     
      void showData(){
                
          System.out.println("roll no= "+rollNo+" Name= "+nam);
       }
      Student()
      {
          count++;
      }

}


class StudentDemo{
          
          public static void main(String args[])
          {
              Student s=new Student();
              int count;
              Scanner sc=new Scanner(System.in);
              System.out.println("enter roll no");
              int roll=sc.nextInt();
              System.out.println("enter name of student");
              String nav=sc.next();
              s.setData(roll,nav);
              s.showData();
              count=s.count;
              System.out.println("No of object created= "+count);
           }
}



          