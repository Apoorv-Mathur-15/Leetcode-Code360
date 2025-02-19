public class Patterns {
    static void print1(int n) {
        System.out.println("Pattern 1");
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    static void print2(int n) {
        System.out.println("Pattern 2");
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    static void print3(int n) {
        System.out.println("Pattern 3");
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++)
                System.out.print(j + " ");
            System.out.println();
        }
    }

    static void print4(int n) {
        System.out.println("Pattern 4");
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++)
                System.out.print(i + " ");
            System.out.println();
        }
    }

    static void print5(int n) {
        System.out.println("Pattern 5");
        int i, j;
        for (i = n; i > 0; i--) {
            for (j = i; j > 0; j--)
                System.out.print("* ");
            System.out.println();
        }
    }

    static void print6(int n) {
        System.out.println("Pattern 6");
        int i, j;
        for (i = n; i > 0; i--) {
            for (j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    static void print7(int n) {
        System.out.println("Pattern 7");
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n - i - 1; j++)
                System.out.print(" ");
            for (j = 0; j < 2 * i + 1; j++)
                System.out.print("*");
            for (j = 0; j < n - i - 1; j++)
                System.out.print(" ");
            System.out.println();
        }
    }

    static void print8(int n) {
        System.out.println("Pattern 8");
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < i; j++)
                System.out.print(" ");
            for (j = 0; j < 2 * n - (2 * i + 1); j++)
                System.out.print("*");
            for (j = 0; j < i; j++)
                System.out.print(" ");
            System.out.println();
        }
    }

    static void print9(int n) {
        System.out.println("Pattern 9");
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n - i - 1; j++)
                System.out.print(" ");
            for (j = 0; j < 2 * i + 1; j++)
                System.out.print("*");
            for (j = 0; j < n - i - 1; j++)
                System.out.print(" ");
            System.out.println();
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < i; j++)
                System.out.print(" ");
            for (j = 0; j < 2 * n - (2 * i + 1); j++)
                System.out.print("*");
            for (j = 0; j < i; j++)
                System.out.print(" ");
            System.out.println();
        }
    }

    static void print10(int n) {
        System.out.println("Pattern 10");
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < i + 1; j++)
                System.out.print("* ");
            for (j = 0; j < n - (i + 1); j++)
                System.out.print(" ");
            System.out.println();
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n - i - 1; j++)
                System.out.print("* ");
            for (j = 0; j < i; j++)
                System.out.print(" ");
            System.out.println();
        }
    }

    static void print11(int n) {
        System.out.println("Pattern 11");
        int i, j, start = 1;
        for (i = 0; i < n; i++) {
            if (i % 2 == 0)
                start = 1;
            else start = 0;
            for (j = 0; j <= i; j++) {
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }
    }

    static void print12(int n) {
        System.out.println("Pattern 12");
        int i, j, spaces = 2 * (n - 1);
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++)
                System.out.print(j + " ");
            for (j = 1; j <= spaces; j++)
                System.out.print("  ");
            for (j = i; j >= 1; j--)
                System.out.print(j + " ");
            System.out.println();
            spaces -= 2;
        }
    }

    static void print13(int n) {
        System.out.println("Pattern 13");
        int i, j, a = 1;
        for (i = 0; i < n; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }

    static void print14(int n) {
        System.out.println("Pattern 14");
        int i;
        char ch;
        for (i = 0; i < n; i++) {
            for (ch = 'A'; ch <= 'A' + i; ch++)
                System.out.print(ch + " ");
            System.out.println();
        }
    }

    static void print15(int n) {
        System.out.println("Pattern 15");
        int i;
        char ch;
        for (i = n; i > 0; i--) {
            for (ch = 'A'; ch < 'A' + i; ch++)
                System.out.print(ch + " ");
            System.out.println();
        }
    }

    static void print16(int n) {
        System.out.println("Pattern 16");
        int i, j;
        char ch;
        for (i = 0; i < n; i++) {
            ch = (char) ((int) ('A' + i));
            for (j = 0; j <= i; j++)
                System.out.print(ch + " ");
            System.out.println();
        }
    }

    static void print17(int n) {
        System.out.println("Pattern 17");
        int i, j;
        char ch;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n - i - 1; j++)
                System.out.print(" ");
            ch = 'A';
            int breakpoint = (2 * i + 1) / 2;
            for (j = 1; j <= 2 * i + 1; j++) {
                System.out.print(ch + "");
                if (j <= breakpoint) ch++;
                else ch--;
            }
            for (j = 0; j < n - i - 1; j++)
                System.out.print(" ");
            System.out.println();
        }
    }

    static void print18(int n) {
        System.out.println("Pattern 18");
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j <= i; j++)
                System.out.print((char) ((int) ('A' + n - j - 1)) + " ");
            System.out.println();
        }
    }

    static void print19(int n) {
        System.out.println("Pattern 19");
        int i, j, spaces = 0;
        for (i = 0; i < n; i++) {
            for (j = 1; j <= n - i; j++) {
                System.out.print("* ");
            }
            for (j = 0; j < spaces; j++) {
                System.out.print("  ");
            }
            for (j = 1; j <= n - i; j++) {
                System.out.print("* ");
            }
            spaces += 2;
            System.out.println();
        }
        spaces = 2 * (n - 1);
        for (i = 0; i < n; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            for (j = 0; j < spaces; j++) {
                System.out.print("  ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            spaces -= 2;
            System.out.println();
        }
    }

    static void print20(int n) {
        System.out.println("Pattern 20");
        int i, j, stars, spaces = 2 * n - 2;
        for (i = 1; i < 2 * n; i++) {
            stars = i;
            if (i > n) stars = 2 * n - i;
            for (j = 1; j <= stars; j++)
                System.out.print("* ");
            for (j = 1; j <= spaces; j++)
                System.out.print("  ");
            for (j = 1; j <= stars; j++)
                System.out.print("* ");
            if (n > i) spaces -= 2;
            else spaces += 2;
            System.out.println();
        }
    }

    static void print21(int n) {
        System.out.println("Pattern 21");
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    static void print22(int n) {
        System.out.println("Pattern 22");
        int i, j;
        for (i = 0; i < 2 * n - 1; i++) {
            for (j = 0; j < 2 * n - 1; j++) {
                int top = i, bottom = j, left = 2 * n - 2 - i, right = 2 * n - 2 - j;
                System.out.print(n - Math.min((Math.min(top, bottom)), (Math.min(left, right))));

            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        //Scanner scanner = new Scanner(System.in);
        //System.out.print("Enter the number of rows for the pattern: ");
        //int n = scanner.nextInt();
        int n = 4;
        print1(n);
        print2(n);
        print3(n);
        print4(n);
        print5(n);
        print6(n);
        print7(n);
        print8(n);
        print9(n);
        print10(n);
        print11(n);
        print12(n);
        print13(n);
        print14(n);
        print15(n);
        print16(n);
        print17(n);
        print18(n);
        print19(n);
        print20(n);
        print21(n);
        print22(n);
    }
}
