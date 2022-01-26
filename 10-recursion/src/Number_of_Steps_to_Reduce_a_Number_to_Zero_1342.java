public class Number_of_Steps_to_Reduce_a_Number_to_Zero_1342 {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(10) );
    }
    static public int numberOfSteps(int num) {
        return reduce(num,0);

    }
    static int reduce(int num, int count){

        if(num == 0){
            return count;
        }

        if(num % 2 == 0){
            count++;
            return reduce(num/2,count);
        }
        count++;
        return reduce(num - 1, count);

    }
}

