package src.Leetcode;

public class CapitalizeTitle {
    public static String capitalizeTitle(String title) {
        StringBuilder sb = new StringBuilder();
        String[] array = title.split(" ");
        for (int i = 0; i < array.length; i++) {
            String str = array[i].toLowerCase();
            if( i > 0 )
                sb.append(" ");
            if(str.length() > 2 ) {
                sb.append(Character.toUpperCase(str.charAt(0)));
                sb.append(str.substring(1).toLowerCase());
            }
            else  {
                sb.append(str);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(capitalizeTitle("First leTTeR of EACH Word"));
        //System.out.println(capitalizeTitle("i lOve leetcode"));
        //System.out.println(capitalizeTitle("capiTalIze tHe titLe"));
    }
}
