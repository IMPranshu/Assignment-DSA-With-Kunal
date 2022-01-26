public class Power_of_Four_342 {
    public static void main(String[] args) {
        System.out.println(check(16,0));
    }
    static public boolean isPowerOfFour(int n) {
        if(n == 0){
            return false;
        }
        return check(n,0);
    }
    static boolean check(int n, int count)
    {
        if(n == 1 && count == 0)  {
            return true;
        }
        if( n % 4 == 0){
            n = n/4;
            count++;
            return check(n,count);
        }
        if(n == 1 && count >= 1){
            return true;
        }
        return false;

    }
}
