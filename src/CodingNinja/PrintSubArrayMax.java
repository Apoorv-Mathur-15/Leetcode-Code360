package src.CodingNinja;

public class PrintSubArrayMax {
    public static void printSubArrayMax(int[] arr, int n, int k){
        if (arr == null || n == 0 || k > n || k <= 0) {
            //System.out.println("Invalid input");
            return;
        }
        int[] max = new int[n-k+1];
        int b = 0;
        for(int i=0; i<n-k+1; i++){
            int a = arr[i];
            //System.out.println();
            //System.out.println("i: "+i);
            for(int j=i+1; j<i+k; j++){
                a = Math.max(a, arr[j]);
                //System.out.println("j: "+j);
                //System.out.println("a: "+a);
            }
            max[b] = a;
            b++;
        }
        for(int i : max)
            System.out.print(i+" ");
    }

    public static void main(String[] args) {
        printSubArrayMax(new int[]{10,5,2,7,8,7}, 6, 3);
    }
}
