package week1Day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int num = 13;
		int count = 0;
		
		for (int i = 1; i <= num; i++) {
			if( num % i==0) {
				count++;
			}
		}		
			if(count==2) {
				System.out.println("The given number is Prime Number ");
			}else {
				System.out.println("The given number is not a Prime Number ");
			}
			
		}
		
		

	}


