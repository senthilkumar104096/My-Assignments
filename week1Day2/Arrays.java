package week1Day2;

public class Arrays {

	public static void main(String[] args) {
	    //Single Dimensional Array
		
		// Declare an array
		int arr[] = {10,20,30,40,50};
		
		//find the size of array
		System.out.println(arr.length);
		
		//find the single value of array
		System.out.println(arr[2]);
         
		//Read multiple values of an array
		//using for loop
		/*for(int i =0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+ " ");
		}*/
		
		//using for-each loop
		for(int var: arr)
		{System.out.println(var);
			
		}
	}

}
