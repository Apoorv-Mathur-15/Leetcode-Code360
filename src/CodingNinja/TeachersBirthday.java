package src.CodingNinja;

public class TeachersBirthday {
    public static int teacherBirthday(int n, int k){
        int mod = n % k;
        if(mod == 0)
            return n/k;
        int a = n/k + 1;
        return a;
    }
}
