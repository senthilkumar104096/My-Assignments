package week1Day2;

public class FindtheDuplicatesofArray {

	public static void main(String[] args) {
	    int arr[] = {1,7,2,3,1,5,6,8,5,8,7};
	    
	    System.out.println("Duplicates in the given array");
	    	for (int i = 0; i < arr.length; i++) {
				for (int j = i+1; j < arr.length; j++) {
					if(arr[i]==arr[j])
					System.out.println(arr[i]);
				}
			}
	    

	}

}
