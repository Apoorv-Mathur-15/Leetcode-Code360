package src.CodingNinja;

public class GetProductArrayII {
    public static int[] productPuzzle(int[] arr, int n) {
        int[] left = new int[n];
        int[] right = new int[n];
        int[] prod = new int[n];

        // Left product array
        left[0] = 1;
        for (int i = 1; i < n; i++)
            left[i] = arr[i - 1] * left[i - 1];

        // Right product array
        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--)
            right[i] = arr[i + 1] * right[i + 1];

        // Construct the result
        for (int i = 0; i < n; i++)
            prod[i] = left[i] * right[i];

        return prod;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] result = productPuzzle(arr, arr.length);
        for(int i : result)
            System.out.print(i + " ");
    }
}
