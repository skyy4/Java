package Arrays;

public class LnSmallestNumber {
    public static int  lnumber(int number[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i  = 0 ; i<number.length;i++ ){
            if (number[i]>largest){
                largest=number[i];
            }
            if (number[i]<smallest){
                smallest=number[i];
            }

        }
        System.out.println("Smallest number in array is = "+smallest);
        return largest;
    }
    public static void main(String[] args) {
        int number[] = {1,2,3,56,75,23,23};
       int largest = lnumber(number);

        System.out.println("largest number in array is = "+largest );
    }
}
