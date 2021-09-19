//initialize an array with ascii values and print the corresponding character value in a single row


//ascii value of digits 48-57

//ascii value of upper case 65-90

//ascii value of lower case 97-122


public class ascii_value{
    public static void main(String[]agrs)
    {
        int []arr={49,88,74,99,88,76};
        for (int i=0;i<arr.length;i++){
            System.out.print((char)arr[i]+" ");
        }
    }
}
