public class Power_of_Two_231 {
    public static void main(String[] args) {
        System.out.println(check(6,0));
    }
    static public boolean isPowerOfTwo(int n) {
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
        if( n % 2 == 0){
            n = n/2;
            count++;
            return check(n,count);
        }
        if(n == 1 && count >= 1){
            return true;
        }
        return false;

    }
}
