class MathOperation{
	static int add(int a,int b) {
		int c= a+b;
		return c;
	}
	static int subtract(int a, int b){
		int c = a+b;
		return c;

	}
	static int multiply(int a ,int b){
		int c = a*b;
		return c;
	}
	static int power(int a,int b){
		
 		int po = (int)Math.pow(a,b);
		return po;

	}
}

public class Q34{
	public static void main(String args[]){
		int a = MathOperation.add(4,4);
		System.out.println(a);
		int s= MathOperation.subtract(4,4);
		System.out.println(s);
		int m = MathOperation.multiply(4,4);
		System.out.println(m);
		int p = MathOperation.power(2,2);
		System.out.println(p);
	}
}
