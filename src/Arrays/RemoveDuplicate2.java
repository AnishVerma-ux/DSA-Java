package Arrays;

class Solutionnn{
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }

        int k = 2;


        for (int i = 2; i < nums.length; i++) {

            if (nums[i] != nums[k-2]) {
                nums[k]=nums[i];
                k++;



            } else {
                continue;

            }
        }

        return k;
    }
}
public class RemoveDuplicate2{
    public static void main(String [] args){
        Solutionnn sol=new Solutionnn();
        int[] nums={2,2,3,5,4,4,1,1};
       int result= sol.removeDuplicates(nums);
        System.out.println(result);

    }
}