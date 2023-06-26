package week1.day1;

public class Fibonocci {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int range = 8, firstNum = 0, secNum = 1;
				int sum=0 ;
		
		for(int i=1; i<=range;i++)
			
		{
			System.out.println(firstNum);
			sum=firstNum+secNum;
			firstNum=secNum;
			secNum     =sum;
			//System.out.println(sum);
			
			
		}
		
	}
}