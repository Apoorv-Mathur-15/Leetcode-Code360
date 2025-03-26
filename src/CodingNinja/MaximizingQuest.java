package src.CodingNinja;

public class MaximizingQuest {
    public static int findMaximum(int a, int b, int c){
        int temp = 0;
        if(b > c)
            temp = b*5;
        else
            temp = b + c*4;
        return a + temp;
    }

    public static void main(String[] args) {
        System.out.println(findMaximum(1,1,2));
    }
}
