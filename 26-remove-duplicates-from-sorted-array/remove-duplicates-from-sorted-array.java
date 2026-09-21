class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length==0){
            return 0;
        }
        int x = 0 ;//unique element pointer
        for(int i = 1;i<nums.length;i++){
            if(nums[x]!=nums[i]){
                x++;
                nums[x]=nums[i];//stores the unique element in x position in the i position of array
            }
        }
    return x+1;
    }
}