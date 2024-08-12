package JavaBasics;

public class Rough {
    public static void main(String[] args) {
        int x,y,z;
         x=y=z=2;
         x+=y;
         y-=z;
         z/=(x+y);
         System.out.print(x+"'"+y+"'"+z);
         if(z==(z/=4)){
             System.out.print(true);
         }
         else{
             System.out.print(false);
         }

    }
}
