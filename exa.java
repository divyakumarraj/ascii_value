
import java.util.Scanner;

public class Solution{
    Solution(String a[]){
         int[][] arr=new int[2][2];
    int k=0;
    for (var i=0;i<2; i++){
        for (var j=0;j<2 ;j++ ) {
        arr[i][j]=Integer.parseInt(a[k++]);

        }
    }
}
    public void reverse(){
                System.out.print("given array is");
        for (int i=1;i<2 ;i++ ) {
            for (int j=1;j<2 ;j++ ) {
                System.out.print(arr[i][j]+"\t");
                
            }
            System.out.print("reverse array is");
            for (int i=2;i>=0 ;i-- ) {
                for (int j=2;j>=0 ;j-- ) {
                    System.out.print(arr[i][j]+"\t");
                    
                    
                }
                
            }
            
        }
    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt(); // kitne space ka array creat krna hai
        Solution obj= new Solution(args);
        obj.reverse();
    } 
}
