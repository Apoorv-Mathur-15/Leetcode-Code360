package src.CodingNinja;

public class CompressTheString {
    public static String compressTheString(String s){
        StringBuilder stringBuilder = new StringBuilder();
        int n = 1;
        for(int i=1; i< s.length(); i++){
            //System.out.println(s.charAt(i-1) +" " + s.charAt(i));
            if(s.charAt(i-1) == s.charAt(i)){
                n=n+1;
                //System.out.println("First If");
            }
            else{
                stringBuilder.append(s.charAt(i-1));
                if(n != 1)
                    stringBuilder.append(n);
                n = 1;
                //System.out.println("Else");
            }
            if(i == s.length()-1){
                stringBuilder.append(s.charAt(i));
                stringBuilder.append(n);
                //System.out.println("Second If");
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(compressTheString("aaabbddccc"));
        //System.out.println("------------------------------");
        System.out.println(compressTheString("ggttttffffrreee"));
        //System.out.println("------------------------------");
        System.out.println(compressTheString("xyzzz"));
    }
}
