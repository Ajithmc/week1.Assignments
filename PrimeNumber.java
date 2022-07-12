package week1.Assignment;
	//Assignment 5
public class PrimeNumber {
	public static void main(String[] args) {
		int num = 13;
		boolean prime = false ;
		for(int i=2;i<=num;i++) {
			if (num%i ==0) 
			{
				prime = true ;
				break;
			}
		}
			if(prime == true){
				System.out.println("The given number is a Prime Number");
			}
		
		else 
		{
				System.out.println("Not a Prime Number");
			}
	}
  }

