package src.CodingNinja;

public class ZigZagGrid {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3,4},{8,7,6,5},{9,10,11,12},{16,15,14,13}};
        for(int[] mat : matrix){
            for(int i : mat)
                System.out.print(i+" ");
            System.out.println();
        }
    }
}
