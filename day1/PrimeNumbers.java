package week1.day1;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		int input=4;
		Boolean isPrime =false;
		// TODO Auto-generated method stub
		
		
		for(int i=2;i<input;i++)
		{
            if(input % i == 0)
            {
            	isPrime = true;
                break;
            }
		}
            	
            if(isPrime)
            {
            	System.out.println("prime");
            }           else
            
            	{System.out.println("Not prime");}
            
            
            
		}
            
		}
            
	


