package week1Day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n=8;
		int firstNum = 0;
		int secondNum = 1;
		int thirdNum;
		//System.out.print("Fibonoci series - " + firstNum + "  " + secondNum);
		for(int i=0; i<=n;i++) {
			System.out.print(firstNum + ",");
			thirdNum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = thirdNum;
		}
		
		/*while(n<=8) {
			thirdNum = firstNum+secondNum;
			System.out.print(" " +thirdNum);
			firstNum = secondNum;
			secondNum = thirdNum;
			n++;
			
		}*/
	}

}
