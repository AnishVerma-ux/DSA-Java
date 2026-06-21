
    public static int removeElement(int[] nums, int val) {

        int k=0;
        for(int i=0;i<nums.length;i++ ){
            if(nums[i]==val){
                continue;

            }
            else {
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }


public static void main(String[] args){
    int[] nums={1,2,3,4,};
    int val=2;
   int result= removeElement(nums,val);
   System.out.println(result);
}