package Functions_Methods;

public class Prime_Range {
   // only for number greater then 1
    public static boolean isPrime(int n){
        if (n==2){
            return true;
        }
        for(int i = 2; i<=Math.sqrt(n);i++){      /// Math.sqrt() can replaced at condition for optimisation
            if(n%i==0){
              return false;
            }
        }
        return true;

    }
    public static void PinR(int n)  {
        for (int i = 2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        PinR(20);


    }
}
