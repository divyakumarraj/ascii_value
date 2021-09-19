//program to initialize an integer array with values and check if a given number is present in array


public class Solution{
	public static void main(String[] args) {
		int[] a = new int[]{1,2,3,4,5};
		int given_number=4;
		for(int x=0;x<a.length;x++){
			if(given_number == a[x]){
				System.out.println(x);
				break;
			}
			else if(x==a.length-1){
				System.out.println("-1");
			}
		}
	}
}
