import java.util.Scanner;

class Employee{

        private static int empNo;
        private int salary;
        private static int totalSalary; 


     Employee(){
     this.empNo=0;
     this.totalSalary=0;

     }

     Employee(int salary){
     this.empNo++;
     this.salary=salary;
     this.totalSalary=totalSalary+salary;
    }  

    void show(){
         System.out.println("empNo:"+empNo+""+"Salary:"+salary+""+"TotalSalary:"+totalSalary);

      }
  }

  class  EmployeeDemo{
        public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Employee e=new Employee();
        e.show();   
        Employee e1=new Employee(5000);
        e1.show();
        Employee e2=new Employee(1000);
        e2.show();      


    } 
}



  

    