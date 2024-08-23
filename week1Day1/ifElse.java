package week1Day1;

public class ifElse {

	public static void main(String[] args) {
		
    //Largest of 3 Numbers
		int a = 10;
		int b = 900;
		int c = 700;
		
	// using Nested if else condition
		if(a>b && a>c)
		{
			System.out.println("a is the largest number = "+ a);
		}
		else if(b>a && b>c) {
			System.out.println("b is the largest number = "+ b);
		}
		else{
			System.out.println("c is the largest number = "+ c);
		}
	}

}
