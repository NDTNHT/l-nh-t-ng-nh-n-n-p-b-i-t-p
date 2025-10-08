public class Main {

    public static int[] Sort(int[] a) {
        int low = 0, high = a.length - 1;
        int mid = 0;
        while (low <= high) {
            if (a[mid] == 0) {
                int temp = a[low];
                a[low] = a[mid];
                a[mid] = a[high];
                a[high] = temp;
                low++;
                mid++;
            }
            else if (a[mid] == 1) {
                mid++;
            }
            else {
                int temp = a[mid];
                a[mid] = a[high];
                a[high] = temp;
                high--;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int[] arr = {2, 0, 1, 2, 1, 0, 1, 2, 0};
        arr = Sort(arr);

        System.out.print("Mảng sau khi sắp xếp: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}