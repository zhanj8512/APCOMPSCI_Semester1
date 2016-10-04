import java.util.Scanner; //import Statement

public class Lab_04ex3
{
	public static void main(String[]args)
	{
		Lab_04ex3 loan = new Lab_04ex3();
		
		double rate = 1.15;
		double principle = 200.5;
		double number = 12.0;
		double time = 3.0;
		double payment = loan.calcPayment(rate,principle,number,time);
		System.out.printf("Your total monthly payment will be %12.2f\n", payment);
	}
	
	public double calcPayment(double r, double p, double n, double t)
	{
		return (p*(Math.pow(1+r/n, n*t)))/(t*12);
	}
}
