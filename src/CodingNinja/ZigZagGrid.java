package src.CodingNinja;

public class ZigZagGrid {
    public static long zigZagGrid(int n, int m, int r, int c){
        int x = (r - 1) * m;
        int ans = 0;
        if (r % 2 == 1) {
            ans = x;
        } else {
            ans = x + m  - c + 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(zigZagGrid(3,4,2,6));
    }
}
