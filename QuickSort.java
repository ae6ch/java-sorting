public class QuickSort {
   public static void main(String[] args) {
      int[] arr = { 5, 4, 19, 4, 4, 0, 3, 2, 1, 22 };
      System.out.printf("Before: ");
      printArrayInt(arr);
      quickSort(arr);
      System.out.printf("After: ");
      printArrayInt(arr);
   }

   private static void printArrayInt(int[] arr) {
      for (int entry : arr) {
         System.out.printf("%d ", entry);
      }
      System.out.println();
   }

   private static void quickSort(int[] arr) {
      quickSort(arr, 0, arr.length - 1);
   }

   private static void quickSort(int[] arr, int i, int j) {
      if (i >= j)
         return; // subarray of 1 element
      int pivot = arr[j]; // pivot is the last number in the array
      int l = i;
      int r = j;
      while (l < r) { // partition
         while (arr[l] <= pivot && l < r) {
            l++;
         }
         while (arr[r] >= pivot && l < r) {
            r--;
         }
         swap(arr, l, r);
      }
      // l and r met, swap with pivot
      swap(arr, l, j);
      // sort the left and right partitions
      quickSort(arr, i, l - 1);
      quickSort(arr, l + 1, j);

   }

   private static void swap(int[] arr, int a, int b) {
      int temp = arr[a];
      arr[a] = arr[b];
      arr[b] = temp;
   }
}