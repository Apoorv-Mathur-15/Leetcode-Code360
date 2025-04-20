package src.CodingNinja;

public class CalculateMaximizedSum {
    public static int calculateMaximisedSum(int[] arr1, int[] arr2, int n) {
        for(int i=0; i<n-1; i++){
            int noSwap = Math.abs(arr1[i] - arr2[i]) + Math.abs(arr1[i + 1] - arr2[i]);
            int swap = Math.abs(arr2[i] - arr1[i]) + Math.abs(arr2[i + 1] - arr1[i]);

            if(swap > noSwap){
                int temp = arr1[i];
                arr1[i] = arr2[i];
                arr2[i] = temp;
            }
        }
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += Math.abs(arr1[i] - arr2[i]);
            if(i < n - 1)
                sum += Math.abs(arr1[i + 1] - arr2[i]);
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr1 = {2,2,4,3};
        int[] arr2 = {2,4,2,3};
        System.out.println(calculateMaximisedSum(arr1, arr2, 4));
    }
}
