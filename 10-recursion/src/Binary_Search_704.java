public class Binary_Search_704 {
    public static void main(String[] args) {
        int[] nums ={-1,0,3,5,9,12};
        int target = 9;
        System.out.println(search(nums,target,0,nums.length - 1));

    }
//    static public int search(int[] nums, int target) {
//        return search(nums,target,0,nums.length - 1);
//
//    }
    static int search(int[] nums,int target, int s, int e){

        if(s > e){
            return -1;
        }
        int m = s + (e-s) / 2;

        if(nums[m] == target){
            return m;
        }
        if(nums[m] > target){
            return search(nums, target, s, m - 1);
        }
        return search(nums, target, m+1, e);
    }
}

