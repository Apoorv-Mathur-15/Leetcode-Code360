package src.Leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class UniqueEmails {
    public static int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();
        for (String email : emails) {
            String name = check(email.split("@")[0]);
            String domain = "@" + email.split("@")[1];
            set.add(name + domain);
        }
        return set.size();
    }

    private static String check(String name) {
        StringBuilder finalName = new StringBuilder();
        for(int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if(Character.isLetter(ch))
                finalName.append(ch);
            else if (ch == '.')
                continue;
            else if (ch == '+')
                break;
        }
        return finalName.toString();
    }

    public static void main(String[] args) {
        System.out.println(numUniqueEmails(new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"}));
    }
}
