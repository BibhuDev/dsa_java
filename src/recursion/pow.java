package recursion;

class Solution50 {

    public double myPow(double x, int n){
        long N = n;
        return myPow(x, N);
    }

    public double myPow(double x, long n) {
        if(n<0){
            return 1/myPow(x, -n);
        }else if(n==0){
            return 1.0;
        }else{
            double half = myPow(x, n/2);

            if(n%2==0){
                return half*half;
            }else{
                return half*half*x;
            }
        }
    }
}