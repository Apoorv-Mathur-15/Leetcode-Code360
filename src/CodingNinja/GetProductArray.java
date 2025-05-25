package src.CodingNinja;

public class GetProductArray {
    public static long[] getProductArray(int[] arr, int n){
        if(n == 1)
            return new long[n];
        long totalProduct = 1;
        for(int i : arr)
            totalProduct *= i;
        long[] productArray = new long[n];
        for(int i=0; i<n; i++)
            productArray[i] = exactProduct(totalProduct, arr[i]);
        return productArray;
    }
    private static long exactProduct(long totalProduct, int integer){
        return totalProduct/integer;
    }
}
