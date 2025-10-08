 static double sqrt(double n) {
    if(n <0) return -1;
    if (n == 0 || n == 1) return n;
    double low = 0, high = n, mid = 0;
    double eps = 0.01;
    while ((high - low) > eps) {
        mid =low+(high - low) / 2;

        if (mid * mid < n) {
            low = mid;
        } else {
            high = mid;
        }
    }

    return mid;
}


public static void main(String[] args) {
    double N = 10;
   if(sqrt(N)==-1){
       System.out.println("The given number is not a valid number");
   }else {
       System.out.println(sqrt(N));
   }
}