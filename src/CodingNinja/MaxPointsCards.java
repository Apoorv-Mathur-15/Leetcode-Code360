package src.CodingNinja;

public class MaxPointsCards {
    public static int maxPoints(int []arr , int k){
        int n = arr.length;
        int maxPoint = 0;
        int currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }
        maxPoint = currentSum;
        for (int i = 0; i < k; i++) {
            currentSum -= arr[k - 1 - i];  // Remove card from the end of the current selection
            currentSum += arr[n - 1 - i];  // Add card from the end of the array

            // Update maxPoint with the new score
            maxPoint = Math.max(maxPoint, currentSum);
        }

        return maxPoint;
    }

    public static void main(String[] args) {
        //System.out.println(maxPoints( new int[]{9,7,5,3,2,1,8}, 4));
        //System.out.println("----------------------------");
        //System.out.println(maxPoints( new int[]{5,4,9,7,8}, 5));
        //System.out.println("----------------------------");
        System.out.println(maxPoints( new int[]{39, 51, 68, 60, 64, 56, 26, 41, 46, 43, 29, 71, 48, 46, 42, 41}, 7));

    }
}
