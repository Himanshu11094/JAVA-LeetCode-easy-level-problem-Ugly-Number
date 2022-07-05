import java.util.Scanner;

public class UglyNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int number;
		String status;
		Scanner input = new Scanner(System.in);
		
	do {	
		System.out.println("Please enter the num you want to check: ");

		number = input.nextInt();
		status = String.valueOf(checkUgly(number));
		
		System.out.println("Status of the number: " + status+"\n");
	}
	
	while(number>=0);
	System.out.println("Enter the valid num");
	}
	
	static  boolean checkUgly(int num)
	{
	int prime[] =  {2,3,5};	
		
	if(num<=0)
	{return false;}
	
	else
	{
		for (int i: prime)
		{
			while(num%i==0)
			{
				num = num/i;
			}
			
		}
		if (num ==1)
			return true;
		else 
			return false;
			
			
	}
	
	
	}
	
}

	 