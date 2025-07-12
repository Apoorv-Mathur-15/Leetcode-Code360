package src;

import java.io.IOException;

public class URLShortner {
    public static String idToShortURL(int n) {
        char map[] = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();

        StringBuffer shortURL = new StringBuffer();

        while (n > 0) {
            shortURL.append(map[n % 62]);
            n = n / 62;
        }
        return shortURL.reverse().toString();
    }

    public static int shortURLtoID(String shortURL) {
        int id = 0;
        for(int i=0; i<shortURL.length(); i++) {
            if('a' <= shortURL.charAt(i) && shortURL.charAt(i) <= 'z')
                id = id * 62 + shortURL.charAt(i) - 'a';
            if('A' <= shortURL.charAt(i) && shortURL.charAt(i) <= 'Z')
                id = id * 62 + shortURL.charAt(i) - 'A' + 26;
            if('0' <= shortURL.charAt(i) && shortURL.charAt(i) <= '9')
                id = id * 62 + shortURL.charAt(i) - '0' + 52;
        }
        return id;
    }

    public static void main(String[] args) throws IOException {
        int n = 12345;
        String shorturl = idToShortURL(n);
        System.out.println("Generated short url is " + shorturl);
        System.out.println("Id from url is " + shortURLtoID(shorturl));
    }
}
