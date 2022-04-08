package week3.day1;

public class Calculator {

	public void add(int num1,int num2)
	{
		System.out.println(num1+num2);
	}
	public void add(int num1,int num2, int num3)
	{
		System.out.println(num1+num2+num3);
	}
	
	public void sub(int num1,int num2)
	{
		System.out.println(num1-num2);
	}
	public void sub(double num1,double num2)
	{
		System.out.println(num1-num2);
	}
	
	public void mul(int num1,int num2)
	{
		System.out.println(num1*num2);
	}
	public void mul(int num1,double num2)
	{
		System.out.println(num1*num2);
	}
	
	public void div(int num1,int num2)
	{
		System.out.println(num1 % num2);
	}
	public void div(double num1,double num2)
	{
		System.out.println(num1 % num2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc =new Calculator();
		calc.add(3, 5);
		calc.add(5, 6, 7);
		calc.sub(7, 2);
		calc.sub(57, 86);
		calc.mul(3, 5);
		calc.mul(6, 87);
		calc.div(48, 6);
		calc.div(99, 6);
	}

}
