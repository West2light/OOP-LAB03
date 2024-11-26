package LAB01_06;

import java.util.Arrays;
import java.util.Scanner;
public class SortAndCalculateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập kích thước của mảng
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Khởi tạo mảng với kích thước đã nhập
        int[] my_array1 = new int[size];

        // Nhập từng phần tử của mảng
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            my_array1[i] = scanner.nextInt();
        }
        
        // Hiển thị mảng ban đầu
        System.out.println("Original array: " + Arrays.toString(my_array1));
      
        // Sắp xếp mảng
        Arrays.sort(my_array1);

        // Hiển thị mảng sau khi sắp xếp
        System.out.println("Sorted array: " + Arrays.toString(my_array1));

        // Tính tổng các phần tử của mảng
        double sum = 0d;
        for (int i = 0; i < my_array1.length; i++) {
            sum += my_array1[i];
        }

        // Tính giá trị trung bình
        double average =  sum / my_array1.length;

        // In ra kết quả
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average value of array elements: " + average);
    }
}
