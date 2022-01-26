public class Power_of_Three_326 {
    public static void main(String[] args) {
        System.out.println(check(27,0));
    }
    static public boolean isPowerOfThree(int n) {
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
        if( n % 3 == 0){
            n = n/3;
            count++;
            return check(n,count);
        }
        if(n == 1 && count >= 1){
            return true;
        }
        return false;

    }
}
