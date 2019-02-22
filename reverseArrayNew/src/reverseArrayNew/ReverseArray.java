package reverseArrayNew;


public class ReverseArray {
	
	static void reverseArr (int [] arr) {
		int temp;
		int n = arr.length;
		
		for (int i = 0; i < n/2; i++) {
			temp = arr[i];
			arr[i] = arr[n - i -1];
			arr[n - i - 1] = temp;
		}
		
		System.out.println("Reversed array is: " );
		
		for (int i : arr) {
			System.out.println(i);
		}
	}
	
	public static void main (String [] arg) {
		
		int [] a = {20, 40, 60, 80, 100, 120};
		
		reverseArr(a);
		
	}

}

