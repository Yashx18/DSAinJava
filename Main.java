import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {

    // PATTERN PROBLEMS TO BUILD LOGICAL THINKING
    static Scanner userInput = new Scanner(System.in);

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

    // MATH PROBLEMS TO MANIPULATE NUMBERS

    static int countDigits(int n) {
        int cnt = 0;
        while (n > 0) {
            n /= 10;
            cnt++;
        }
        return cnt;
    }

    static void reverseNumber(int n) {
        int lastValue = 0;
        int reversed = 0;
        while (n > 0) {
            lastValue = n % 10;
            reversed = reversed * 10 + lastValue;
            n /= 10;
        }
        System.out.println(reversed);
    }

    static void checkPalindrome(int n) {
        int num = n;
        int lastValue = 0;
        int reversed = 0;
        while (n > 0) {
            lastValue = n % 10;
            reversed = reversed * 10 + lastValue;
            n /= 10;
        }

        if (num == reversed) {
            System.out.printf("%d is a Palindrome Number.", num);
        } else {
            System.out.printf("%d is a NOT Palindrome Number.", num);
        }
    }

    static void HCF(int n1, int n2) {
        int range = (n1 > n2) ? n2 : n1;
        int hcf = 0;
        for (int i = 1; i <= range; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                hcf = i;
            }
        }
        System.out.printf("Highest Common Factor of %d and %d is %d.\n", n1, n2, hcf);
    }

    static void checkPrime(int n) {
        ArrayList<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
            }
        }

        if (divisors.size() == 2) {
            System.out.printf("%d is a Prime number.", n);
        } else {
            System.out.printf("%d is NOT a Prime number.", n);
        }
    }

    static void armstrongNum(int n) {
        int num = n;
        int num2 = n;
        int lastDigit = 0;
        int digits = 0;
        int cnt = 0;
        int res = 0;
        while (num > 0) {
            lastDigit = num % 10;
            num /= 10;
            cnt++;
        }

        for (int i = 0; i < cnt; i++) {
            digits = num2 % 10;
            num2 /= 10;
            res += Math.pow(digits, cnt);
        }

        System.out.printf("Length of %d is %d\n", n, cnt);
        System.out.printf("%d\n", res);
        if (res == n) {
            System.out.printf("%d is an Armstring Number.\n", n);
        }
    }

    static void printDivisors(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                arr.add(i);
            }
        }

        System.out.println("Divisors of " + n + " are " + arr + ".");
    }

    // RECURSIONS

    static void recursion(int n) {
        if (n != 0) {
            System.out.println("Printing my name using Recursion 'KEN'.");
            recursion(n - 1);
        }

    }

    static void recursion3(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println(i);
        recursion3(i + 1, n);
    }

    static void recursion4(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println(n);
        recursion4(i, n - 1);
    }

    static void recursion5(int n, int sum) {
        if (n < 0) {
            System.out.println(sum);
            return;
        }

        recursion5(n - 1, sum + n);
    }

    static void recursion6(int n, int sum) {
        if (n <= 1) {
            System.out.println(sum);
            return;
        }

        recursion6(n - 1, sum *= n);
    }

    static void recursion7(int[] arr, int left, int right) {
        if (left > arr.length / 2 - 1) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        recursion7(arr, left + 1, right - 1);
    }

    static void palindromeRecursion(String word, int left, int right) {
        boolean palindrome = false;
        if (left > right / 2) {
            palindrome = true;
            System.out.printf("'%s' is a Palindrome.\n", word);
            System.out.printf("Palindrome : %b.\n", palindrome);
            return;
        } else if (word.charAt(left) != word.charAt(right)) {
            palindrome = false;
            System.out.printf("%s is NOT a Palindrome.\n", word);
            System.out.println(palindrome);
            return;

        }
        palindromeRecursion(word, left + 1, right - 1);

    }

    static void fibonacciRecursion(int n) {
        int[] arr = new int[n];
        if (n >= 1)
            arr[0] = 0;
        if (n >= 2)
            arr[1] = 1;

        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(Arrays.toString(arr));
    }

    // HASHING

    static void num(int n, int[] arr) {
        int choice;

        int[] hash = new int[n + 1];
        Arrays.fill(hash, 0);

        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]] += 1;
        }

        System.out.println(Arrays.toString(hash));

        System.out.print("Enter the number you want to know about : ");
        choice = userInput.nextInt();

        if (choice < 0 || choice > 10) {
            System.out.println("Enter Valid Input (0-10)");
        }
        System.out.println(hash[choice]);

    }

    static void str(int n, String word) {
        int[] arr = new int[n];
        Arrays.fill(arr, 0);

        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i);
            arr[index - 'a'] += 1;
        }

        int len = word.length() - 1;
        while (len > 0) {
            System.out.print("Enter the Letter you want to search for : ");
            char letter = userInput.next().charAt(0);

            int index = letter - 'a';

            System.out.println(arr[index]);
            len--;
        }

        userInput.close();
    }

    static void frequency(int[] arr) {
        int highest = 0;
        int lowest = 0;
        Arrays.sort(arr);
        int n = arr[arr.length - 1];
        int[] hashed = new int[n + 1];
        Arrays.fill(hashed, 0);
        for (int i = 0; i < arr.length; i++) {
            hashed[arr[i]] += 1;
        }
        for (int item : arr) {
            System.out.println(item);
            for (int i = 0; i < hashed.length; i++) {
                if (hashed[item] > highest) {
                    highest = hashed[item];
                }
                if (hashed[item] < lowest) {
                    lowest = hashed[item];
                }
            }
        }
        System.out.println(highest);
        System.out.println(lowest);
        int highestValue = indexOf(hashed, highest);
        int lowestValue = indexOf(hashed, lowest);
        System.out.println(hashed[highestValue]);
        System.out.println(hashed[lowestValue]);
        System.out.println(Arrays.toString(hashed));
    }

    static int indexOf(int[] arr, int target) {
        int found = 0;
        for (int item : arr) {
            if (arr[item] == target) {
                found++;
            }
        }
        return found;

    }

    // SORTING TECHNIQUES

    // First => Selection SORT
    static void selectionSort(int[] arr) {
        String res = Arrays.toString(arr);
        System.out.printf("This is the Original Array: %s\n", res);
        for (int i = 0; i < arr.length - 1; i++) {
            // System.out.println(arr[i]);
            for (int j = i; j < arr.length; j++) {
                int temp = arr[i];
                if (arr[j] < arr[i]) {
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                System.out.printf("This is the Sorted Array %s\n", Arrays.toString(arr));

            }
        }
        System.out.printf("This is the Sorted Array %s\n", Arrays.toString(arr));
    }

    // Second => Bubble SORT
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped = false;
        System.out.println(Arrays.toString(arr));
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                    System.out.println(Arrays.toString(arr));
                }

            }
            System.out.println(swapped);
            if (!swapped) {
                break;
            }
        }
    }

    // Third => Insertion SORT
    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.println(Arrays.toString(arr));
    }
    // Learned theory of Merge SORT
    // Fourth => Merge SORT (Uses Recursion)

    static void merge(int[] arr, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int[] temp = new int[n1 + n2];
        int left = low;
        int right = mid + 1;
        int index = 0;

        // Merge elements from both halves in sorted order
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[index] = arr[left];
                left++;
            } else {
                temp[index] = arr[right];
                right++;
            }
            index++;
        }

        // Copy remaining elements from left half
        while (left <= mid) {
            temp[index] = arr[left];
            left++;
            index++;
        }

        // Copy remaining elements from right half
        while (right <= high) {
            temp[index] = arr[right];
            right++;
            index++;
        }

        for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }
    }

    static void mergeSort(int[] arr, int low, int high) {
        if (low >= high)
            return;
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
        System.out.println(Arrays.toString(arr));
    }

    // Main QuickSort function
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Step 1: Partition the array, get pivot index
            int pivotIndex = partition(arr, low, high);

            // Step 2: Recursively sort elements before pivot
            quickSort(arr, low, pivotIndex - 1);

            // Step 3: Recursively sort elements after pivot
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Partition function
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // choosing last element as pivot
        int i = low - 1; // index of smaller element

        // Loop through array
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Put pivot in its correct place
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // return pivot index
    }

    // ARRAYS

    // First => Largest element in the Array
    static void largestElement(int[] arr) {
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }

    // Second => Second largest element in the Array
    static void secondLargest(int[] arr) {
        int largest = arr[0];
        int secondLargest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("The Largest Element is " + largest);
        System.out.println("The Second Largest Element is " + secondLargest);
    }

    // Third => Check if the Array is sorted
    static void isSorted(int[] arr) {
        boolean isSorted = false;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= arr[i - 1]) {
                isSorted = true;
            } else {
                isSorted = false;
                break;
            }
        }
        System.out.println("Is the Array sorted ? : " + isSorted);
    }

    // Fourth => Remove Duplicated from the Array
    static void removeDuplicates(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        for (int j = 0; j < arr[i]; j++) {

            System.out.println(arr[j]);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 2, 3, 3, 3, 4, 5, 5, 6 ,7};
        // int low = 0;
        // int high = arr.length - 1;
        removeDuplicates(arr);
        // System.out.println(Arrays.toString(arr));
    }
}