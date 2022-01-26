public class Reverse_String_344 {
    public static void main(String[] args) {

        char[] s = {'h','e','l','l','o'};
        revPrint(s,0,s.length - 1);
    }
//    public static void reverseString(char[] s) {
//        revPrint(s,0,s.length - 1);
//
//    }
static void revPrint(char[] s, int start,int end){
    if(start <= end){
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        start++;
        end--;
        revPrint(s,start,end);
    }
    return;



}
}
