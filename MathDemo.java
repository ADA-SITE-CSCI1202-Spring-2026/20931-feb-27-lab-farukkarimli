public class MathDemo{

    public int min(int a, int b){
        if (a >b){
            return b; 
        }
        if (b > a) { 
            return a;
        }
        return a;
    }
    public int max(int a, int b){
        if (a >b){
            return a; 
        }
        if (b > a) { 
            return b;
        }
        return a;
    }
    public int sum(int[] arr){
        int sum = 0;
        for(int i = 0; i< arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    public float average(int[] arr){
    if (arr.length == 0){
        return 0;
    }

    return (float) sum(arr) / arr.length;
    }
    public int factorial(int n){
        int res = 1;
        if (n == 0 || n==1){
            return 1;}
        for (int i = 2; i<=n; i++){
            res = res * i;
        }
        return res;
        }
    }
    //Advantages of defining the methods as static:
    //1)No object creation required
    //2)Saves memory
//No need to create objects when methods don't depend on instance variables.
    //3)Utility-style usage
//Works like Java’s built-in Math class

