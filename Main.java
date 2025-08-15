import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        pattern22(5);

        userInput.close();
    }

    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("| ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("| ");
            }
            System.out.println();
        }
    }

    static void pattern8(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print("| ");
            }
            for (int j = 1; j <= 2 * n - 2 * i + 1; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < i - 1; j++) {
                System.out.print("| ");
            }
            System.out.println();
        }
    }

    static void pattern9(int n) {

        pattern7(n);
        pattern8(n);
    }

    static void pattern10(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int num = i;
            if (i > 2 * n / 2) {
                num = 2 * n - i;
            }
            for (int j = 1; j <= num; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static void pattern11(int n) {
        int num = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                num = 1;
            } else {
                num = 0;
            }
            for (int j = 0; j <= i; j++) {
                System.out.printf("%d ", num);
                num = 1 - num;
            }

            System.out.println();
        }
    }

    static void pattern12(int n) {
        for (int i = 1; i <= n; i++) {
            // for numbers
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d ", j);
            }
            // for space
            for (int j = 1; j <= 2 * n - 2 * i; j++) {
                System.out.print("| ");
            }
            // for numbers
            for (int j = i; j >= 1; j--) {
                System.out.printf("%d ", j);
            }

            System.out.println();
        }
    }

    static void pattern13(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {

            // for numbers
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d ", num);
                num++;
            }
            System.out.println();
        }
    }

    static void pattern14(int n) {
        for (int i = 1; i <= n; i++) {
            // for numbers
            for (char j = 'A'; j < 'A' + i; j++) {
                System.out.printf("%c ", j);
            }
            System.out.println();
        }
    }

    static void pattern15(int n) {
        for (int i = 0; i < n; i++) {
            // for numbers
            char ch = 'A';
            for (int j = 0; j <= i; j++) {
                System.out.printf("%c ", ch + i);
            }
            System.out.println();
        }
    }

    static void pattern16(int n) {
        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            // for space
            for (int j = 0; j <= n - i; j++) {
                System.out.print("| ");
            }
            // for charachters
            for (int j = 0; j < 2 * i - 1; j++) {

                System.out.printf("%c ", ch);
                if (j < 2 * i / 2 - 1) {
                    ch += 1;
                } else {
                    ch -= 1;
                }
            }
            // for space
            for (int j = 0; j <= n - i; j++) {
                System.out.print("| ");
            }

            System.out.println();
        }
    }

    static void pattern17(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = (char) (int) ('A' + n - 1 - i); ch <= (char) (int) ('A' + n - 1); ch++) {

                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    static void patternTop(int n) {
        for (int i = 1; i <= n; i++) {
            // for stars
            for (int j = 0; j <= n - i; j++) {
                System.out.print("* ");
            }
            // for spaces
            for (int j = 0; j < 2 * i - 2; j++) {
                System.out.print("  ");
            }
            // for stars
            for (int j = 0; j <= n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void patternDown(int n) {
        for (int i = 1; i <= n; i++) {
            // for stars
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            // for spaces
            for (int j = 0; j < 2 * n - 2 * i; j++) {
                System.out.print("  ");
            }
            // for stars
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern18(int n) {
        patternTop(n);
        patternDown(n);
    }

    static void pattern19(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int num = i;
            int spaces = 2 * n - 2 * i;
            if (i > 2 * n / 2) {
                num = 2 * n - i;
                spaces = 2 * i - 2 * n;
            }

            for (int j = 1; j <= num; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= num; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static void pattern20(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 1 || j == 0 || i == n || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void pattern22(int n) {
        // Outer loop for no. of rows
        for (int i = 0; i < 2 * n - 1; i++) {

            // inner loop for no. of columns.
            for (int j = 0; j < 2 * n - 1; j++) {

                // Initialising the top, down, left and right indices of a cell.
                int top = i;
                int bottom = j;
                int right = (2 * n - 2) - j;
                int left = (2 * n - 2) - i;

                // Min of 4 directions and then we subtract from n
                // because previously we would get a pattern whose border
                // has 0's, but we want with border N's and then decrease inside.
                System.out.print(n - Math.min(Math.min(top, bottom), Math.min(left, right)) + " ");
            }

            // As soon as the numbers for each iteration are printed, we move to the
            // next row and give a line break otherwise all numbers
            // would get printed in 1 line.
            System.out.println();
        }

    }
}