class Solution {
    public int majorityElement(int[] nums) {
        int count=1;
        int element=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==element){
                count++;
            }
            else if(count==0){
                element=nums[i];
                count=1;
            }
            else{
                count--;
            }
        }
        int c=0;
        for(int num:nums){
            if(num==element){
                c++;
            }
        }
        if(c>nums.length/2){
            return element;
        }
        return -1;
    }
}