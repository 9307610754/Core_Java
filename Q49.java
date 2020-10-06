import java.util.Scanner;
interface taxable{
	double salesTax = 0.7;
	double incomeTax = 0.10;
	void calTax();
}
class Employee implements taxable{
	int empID;
	double Salary;
	String name;
	Employee(){}
	
	Employee ( int empID, double Salary, String name ){
		this.empID = empID;
		this.Salary=Salary;
		this.name=name;
	}
	public void calTax(){
	double incomeTax1 =  Salary * incomeTax;
		
		System.out.println("Totala incometax is"+incomeTax1 );
	}
}
class Product implements taxable{
	int pID;
	double price;
	int quantity;
	
	Product (int empID, double price, int quantity){
		this.pID = pID;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void calTax(){
		double salesTaxPrice = price * quantity * salesTax;
		System.out.println("Totle incometax is"+salesTaxPrice );
	}
}
class 	Q49{
public static void main(String args[]){
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Enter Employee Id");
	int empID = sc.nextInt();
	System.out.println("Enter Employee Salary");
	Double empSalry = sc.nextDouble();
	System.out.println("Enter Employee Name");
	String empName = sc.next();	
	taxable t = new Employee(empID, empSalry, empName);	
	t.calTax();	
	
	System.out.println("Enter Product Id");
	int prodID = sc.nextInt();
	System.out.println("Enter Product Price");
	Double prodPrice = sc.nextDouble();
	System.out.println("Enter Product Quantity");
	int prodQuant = sc.nextInt();
	taxable t1 = new Product(prodID, prodPrice, prodQuant);
	t1.calTax();
}
}
