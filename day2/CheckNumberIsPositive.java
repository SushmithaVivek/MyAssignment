package week1.day2;

public class CheckNumberIsPositive {

	public static void main(String[] args) {
		int version = 10;
		
		if(version>0)
		{
			System.out.println(version +" "+"is a Positive Number");
		}
		else if(version<0)
		{
			System.out.println(version+" "+"is a Negative Number");
		}
		else if (version==0)
		{
			System.out.println(version+" "+"is Zero");
		}
	}

}
