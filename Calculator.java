package week1.day2;

public class Calculator {
    public int add(int a,int b,int c) {
		int d=a+b+c;
		return d;
    }
    public int sub(int a, int b) {
    	int e=a-b;
    	return e;
    }
    public double mul(double a, double b) {
    	double f=a*b;
    	return f;
    }
    public float div(int a, int b) {
    	float g=a/b;
    	return g;
    }
	public static void main(String[] args) {
       Calculator calc=new Calculator();
       System.out.println("Sum:"+ calc.add(50, 40, 30));
       System.out.println("Sub:"+ calc.sub(50, 40));
       System.out.println("Mul:"+ calc.mul(50, 40));
       System.out.println("Div:"+ calc.div(50,10));
          }
	}
