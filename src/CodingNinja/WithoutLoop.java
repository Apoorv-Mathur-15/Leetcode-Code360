package src.CodingNinja;

public class WithoutLoop {
    public static int[] printNos(int n){
        int[] arr = new int[n];
        dummy(n, arr);
        return arr;
    }
    private static void dummy(int x, int[] arr) {
        if(x == 0)
            return;
        arr[x-1] = x;
        dummy(x-1, arr);
    }

    public static void main(String[] args) {
        int[] arr = printNos(10);
        for(int i: arr)
            System.out.print(i+" ");
    }
}
