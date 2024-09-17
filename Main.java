import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("================================="); 
        System.out.println("1. Sum of N number in an array");
        System.out.println("2. Maximum and Minimum number");
        System.out.println("3. Distinct Number");
        System.out.println("4. Exit");
        System.out.println("=================================");
        
        System.out.print("Enter Option: ");
        int option = scanner.nextInt();
        
        System.out.println("");
        
        switch (option) {
          case 1:
                System.out.print("Input Array Size : ");
                int n1 = scanner.nextInt();
                
                int[] array1 = new int[n1];
                
                System.out.print("Input Values: ");
                for (int i = 0; i < n1; i++) {
                    array1[i] = scanner.nextInt();
                }
                
                int sum = sumOfArray(array1);
                System.out.println("Sum of the array: " + sum);
                
                scanner.close();
            break;
          case 2:
                System.out.print("Input Array Size : ");
                int n2 = scanner.nextInt();
                
                int[] array2 = new int[n2];
                
                System.out.print("Input Values: ");
                for (int i = 0; i < n2; i++) {
                    array2[i] = scanner.nextInt();
                }
                int max = findMax(array2);
                int min = findMin(array2);
                
                System.out.println("Maximum value: " + max);
                System.out.println("Minimum value: " + min);
                
                scanner.close();
            break;
          case 3:
                System.out.print("Input Array Size : ");
                int n3 = scanner.nextInt();
                
                int[] array3 = new int[n3];
                
                System.out.print("Input Values: ");
                for (int i = 0; i < n3; i++) {
                    array3[i] = scanner.nextInt();
                }
                int newSize = removeDuplicates(array3);

                System.out.print("Distinct values: ");
                for (int i = 0; i < newSize; i++) {
                    System.out.print(array3[i] + " ");
                }
        
                scanner.close();
            break;
          case 4:
            System.out.println("Exit");
            break;
        }
    }
    public static int sumOfArray(int[] numbers) {
        int totalSum = 0;
        for (int number : numbers) {
            totalSum += number;
        }
        return totalSum;
    }
    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
    public static int findMin(int[] numbers) {
        int min = numbers[0];
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }
    public static int removeDuplicates(int[] array) {
        int n = array.length;
        if (n == 0) {
            return 0;
        }
        
        int newSize = 0;

    for (int i = 0; i < n; i++) {
        boolean isDuplicate = false;
        for (int j = 0; j < newSize; j++) {
            if (array[i] == array[j]) {
                isDuplicate = true;
                break;
            }
        }
        if (!isDuplicate) {
            array[newSize] = array[i];
            newSize++;
        }
    }
    return newSize;
    }
    
}
