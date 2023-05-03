import java.util.Arrays;

public class SelectionSort {
   public static void main(String[] args) {
      int[] arr = { 5, 4, 19, -2, 4, 4, 99, 0, 3, 2, 1, 22 };
      System.out.printf("Before: ");
      printArrayInt(arr);
      selectionSort(arr);
      System.out.printf("After: ");
      printArrayInt(arr);
   }

   private static void printArrayInt(int[] arr) {
      for (int entry : arr) {
         System.out.printf("%d ", entry);
      }
      System.out.println();
   }

   private static void selectionSort(int[] arr) {
      for (int i = 0; i <= arr.length - 1; i++) {
         int min = arr[i];
         int minIndex = i;
         for (int j = i + 1; j <= arr.length - 1; j++) {
            if (arr[j] < min) {
               min = arr[j];
               minIndex = j;
            }
         }
         swap(arr, minIndex, i);

      }
   }

   private static void swap(int[] arr, int a, int b) {
      int temp = arr[a];
      arr[a] = arr[b];
      arr[b] = temp;
   }
}