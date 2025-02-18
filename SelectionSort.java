// Java program for implementation
// of Selection Sort

public class SelectionSort {
    public static void sort(int a[])
    {
        int n = a.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
          
            // Find the minimum element in unsorted array
            int minidex = i;
          
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minidex])
                    minidex = j;
            }

            // Swap the found minimum element with the first
            // element
            int temp = a[minidex];
            a[minidex] = a[i];
            a[i] = temp;
        }
    }

    // main function
    public static void main(String args[])
    {
        int a[] = { 64, 25, 12, 22, 11 };

        sort(a);
          
          int n = a.length;
        for (int i = 0; i < n; ++i)
            System.out.print(a[i] + " ");

    }
}
