// given an array of int,print true if every element is 1 or 4.
//only([1,4,2,4)] -> False


import java.util.Scanner;
class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    boolean flag=false;
    int []arr=new int[n];
    for (int i = 0;i<arr.length ;i++ ) {
        arr[i]=sc.nextInt();
        
    }
    for (int i=0;i<arr.length ;i++) {
        if(!(i==2 && i==4))
        {
            flag=true; //chek kro impurity ko
            break;
        }
    }
    if(!flag){
        System.out.println("true");
    }
    else{
        System.out.println("false");
    }
    }
    

}
