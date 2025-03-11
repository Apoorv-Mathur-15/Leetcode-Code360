package src.CodingNinja;

public class ConcatLargestDigit {
    public static int concatLargestDigit(int a, int b, int c){
        int result = 0;
        result = largestNumber(a)*100 + largestNumber(b)*10 + largestNumber(c);
        return  result;
    }

    private static int largestNumber(int i){
        int k = Integer.MIN_VALUE;
        while( i > 0){
            int n = i % 10;
            k = Integer.max(k, n);
            i = i / 10;
        }
        return k;
    }

    public static void main(String[] args) {
        System.out.println(concatLargestDigit(5678, 45, 769));
        System.out.println(concatLargestDigit(4554, 292, 123567));
    }
}
