package week1.day2;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		

			//Considering the first two numbers as 0 and 1 
			 int num1=0,num2=1,num3,i,count=6;  
			//Count=6 means that only the first 8 Fibonacci numbers will be displayed,wherein already 2 numbers available 0,1
			System.out.print(num1+" "+num2);
			//printing 0 and 1
			 for(i=0;i<count;i++)  
			 {
			  num3=num1+num2;
			  System.out.print(" "+num3);
			  num1=num2;
			  num2=num3;
			 }
			}


}
