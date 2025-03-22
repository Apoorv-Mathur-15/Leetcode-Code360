package src.Leetcode;

public class RemoveDigit {
    public static String removeDigit(String number, char digit){
        int place = 0;
        for(int i=0; i<number.length(); i++){
            if( number.charAt(i) == digit){
                place = i;
                if(i < number.length()-1 && digit < number.charAt(i+1))
                    break;
            }
        }
        number = number.substring(0, place) + number.substring(place+1);
        return number;
    }

    public static void main(String[] args) {
        System.out.println(removeDigit("1231", '1'));
    }
}
