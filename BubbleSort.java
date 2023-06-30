public class BubbleSort {
   public static void main(String[] args) {
      int[] arr = { 3, 2, 1, 5, 0, 2, 5, 1, 10, 11 };
      System.out.printf("Before: ");
      printArrayInt(arr);
      bubbleSort(arr);
      System.out.printf("After: ");
      printArrayInt(arr);
   }
   
   private static void printArrayInt(int[] arr) {
      for (int entry : arr) {
         System.out.printf("%d ", entry);
      }
      System.out.println();
   }
   
   /**
    * Sort a array of numbers using bubble sort.
    *
    * @param arr array of numbers to sort
    */
   private static void bubbleSort(int[] arr) {
      boolean swapped = true;
      while (swapped) {
         swapped = false;
         for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
               swap(arr, i, i + 1);
               swapped = true;
            }
         }
      }
   }
   
 /**
    * Swap 2 positions in a array.
    * 
    * @param arr
    * @param a   index to swap with b
    * @param b   index to swap with a
    */
   private static void swap(int[] arr, int a, int b) {
      int temp = arr[a];
      arr[a] = arr[b];
      arr[b] = temp;
   }
}
