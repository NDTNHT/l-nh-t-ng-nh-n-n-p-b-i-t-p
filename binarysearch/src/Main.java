//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
static boolean BinarySearch(int[] a, int k){
     int low = 0, high = a.length - 1;
     while(low <= high){
         int mid = low + (high - low)/2;
         if(a[mid] == k){
             return true;
         } if(a[mid] < k){
             low = mid + 1;
         }else
             high = mid - 1;
     }
    return false;
}
public static void main() {
     int[]a = {2,23,4,45,7,2,34,5,5,76,74,56};
    if (BinarySearch(a,5)) {System.out.println("thay");}
    else{
            System.out.println("khong thay");
    }
}
