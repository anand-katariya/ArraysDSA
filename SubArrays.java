package Array;

public class SubArrays {
    public static void main(String[] args) {
        int number[] = {10,20,30,40,50,60,60,70,80};
        subArrays(number, 3);
    }
    public static void subArrays(int number[], int start){
        for(int i = start;i<number.length;i++){
            for(int j =start; j<=i;j++){
                System.out.print(number[j] +" ");
            }
            System.out.println();
        }
    }
}
