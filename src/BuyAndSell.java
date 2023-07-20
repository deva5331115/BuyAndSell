import java.util.Scanner;

public class BuyAndSell {
    public static int maximumProfit(int[] array){
    int min = Integer.MAX_VALUE, indexOfMin = -1;
        for(int i = 0 ; i < array.length ; i++){
        if(array[i] < min){
            min = array[i];
            indexOfMin = i;
        }
    }
    int max = Integer.MIN_VALUE;
        for (int i = indexOfMin + 1 ; i < array.length ; i++){
        max = Math.max(array[i], max);
    }
        return max - min;
}

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int size= scan.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();

        }
        maximumProfit(arr);
    }
}
