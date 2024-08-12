package Functions_Methods;

public class FunctionOverloading {
    // function overloading using parameters

//    public static int sum (int a, int b){
//        return a+b;
//    }
//    public static int sum (int a, int b,int c){
//        return a+b+c;
//    }
//    public static void main(String[] args) {
//        System.out.println("sum  =  "+sum(1,2,8));
//
//    }

    // function overloading using data types

    public static int sum (int a, int b){
        return a+b;
    }
    public static float sum (float a, float b,float c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println("sum  =  "+sum(1.6F,2.4f,8));

    }
}
