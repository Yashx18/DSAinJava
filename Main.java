import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        pattern15(5);

        userInput.close();
    }

    public static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void pattern5(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern6(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void pattern7(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("| ");
            }
            for (int j = 1; j <= 2* i - 1; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("| ");
            }
            System.out.println();
        }
    }
    public static void pattern8(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print("| ");
            }
            for (int j = 1; j <= 2* n-2*i+1 ; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < i - 1; j++) {
                System.out.print("| ");
            }
            System.out.println();
        }
    }
    public static void pattern9(int n) {

        pattern7(n);
        pattern8(n);
    }
    public static void pattern10(int n) {
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
    public static void pattern11(int n) {
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
    public static void pattern12(int n) {
        for (int i = 1; i <= n; i++) {
            // for numbers
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d ", j);
            }
            // for space
            for (int j = 1; j <= 2*n - 2*i; j++) {
                System.out.print("| ");
            }
            // for numbers
            for (int j = i; j >= 1; j--) {
                System.out.printf("%d ", j);
            }
    
            System.out.println();
        }
    }
    public static void pattern13(int n) {
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
    public static void pattern14(int n) {
        for (int i = 1; i <= n; i++) {
            // for numbers
            for (char j = 'A'; j < 'A'+i; j++) {
                System.out.printf("%c ", j);
            }
            System.out.println();
        }
    }
    public static void pattern15(int n) {
        for (int i = 0; i < n; i++) {
            // for numbers
            char ch = 'A';
            for (int j = 0; j <= i; j++) {
                System.out.printf("%c ", ch + i);
            }
            System.out.println();
        }
    }
}
