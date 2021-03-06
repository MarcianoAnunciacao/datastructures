package datastructures.recursion;

public class Recursion{

     public static int reduce = 0;

    public static void reduceByOne(int n){

        if(n>=0){
            reduce = n-1;
            reduceByOne(n-1);

        }

        System.out.println("Valor de N : " + n);

    }

    public static int recursiveLinearSearch(int valueForSearch, int index, int ... elements ){
        if(index > elements.length - 1){
            return -1;
        }else if(elements[index] == valueForSearch){
            return index;
        }else{
            return recursiveLinearSearch(valueForSearch, index + 1, elements);
        }
    }

    public static int recursiveBinarySearch(int p, int r, int x, int ... elements){

        if(p > r){
            return -1;
        }else{
            int q = (p + r) /2;

            if(elements[q] == x){
                return  q;
            }else if(elements[q] > x){
                return recursiveBinarySearch(p, q-1, x, elements);
            }else {
                return recursiveBinarySearch(q+1, r, x, elements);
            }
        }

    }

    public static int fibonacci(int n) {
        if(n < 2){
            return n;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static int fibonacci2(int n){
        if (n == 0) return 0;
        int[] f = new int[n+1];
        f[0] = 0;
        f[1] = 1;
        for(int i = 2; i <= n; i++){
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];
    }

    public static int davisStaircase(int s, int n){
    // can jump 1, 2 or 3 steps
        if(n == s){
            return 1;
        }else if (s > n) {
            return -1;
        }else{
            return davisStaircase(s, n);
        }
    }
}