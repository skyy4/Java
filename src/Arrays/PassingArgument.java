package Arrays;

public class PassingArgument {
    public static void update(int marks[],int checkNo){
         checkNo = 10;
        for(int i = 0 ; i<marks.length;i++){
            marks[i] +=1;
        }
    }
    public static void main(String[] args) {
        int marks []= {92,96,95};
        int checkNo = 5;
        update(marks,checkNo);
        System.out.println(checkNo);
        //output
        for(int i =0 ; i< marks.length;i++ ){
            System.out.print(marks[i]+" ");
        }
    }
}
