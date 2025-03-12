package src.CodingNinja;

public class CountInversions {
    public static long getInversions(long[] arr, int n){
        long inversions = 0;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] > arr[j])
                    inversions++;
            }
        }
        return inversions;
    }

    public static void main(String[] args) {
        long[] arr = {2,5,1,3,4};
        System.out.println(getInversions(arr, arr.length));
    }
}
