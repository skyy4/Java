package Functions_Methods;

public class BinomialCoefficient {
    public static int Factorial(int x){

        int f = 1;
        for(int i =1;i<=x;i++){
            f=f*i;
        }

        return f;
    }
    public static int BinoCoeff(int n,int r){
        int nfact = Factorial(n);
        int rfact = Factorial(r);
        int nmrfact =   Factorial(n-r);
        int bc = (nfact)/(rfact*nmrfact);
        return bc;
    }
    public static void main(String[] args) {
         int n = 5;
         int r = 2;
        System.out.println("Binomial Coefficient = "+BinoCoeff(n,r));
    }
}
