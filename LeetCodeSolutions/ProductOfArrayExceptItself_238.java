class Solution {
    public int[] productExceptSelf(int[] nums) {
        int mul=1;
        int n = nums.length;
        int ans[]= new int[n];
        int zeroCount=0;
		/* Count the number of all the 0's in the array
			and if number is 0 the multiply the overall multiplication
			with 1 because at the end we will be dividing the mul
			with the array elements to get the multiplication excluding the current array element
		*/
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                mul*=1;
                zeroCount++;
        }else
                mul*=nums[i];
        }
		/* If current element is 0 and number of 0's is 1 then
		   the multiplication will be non zero, including multiplication of all
		   numbers except zero otherwise the multiplication will be 0
		*/
        for(int i=0;i<n;i++){
            if(nums[i]==0 ){  
                if(zeroCount==1)
                ans[i]=mul/1;
                else
                    ans[i]=0;
            }else{
               if(zeroCount>0){
                   ans[i]=0;
               }else
                    ans[i]=mul/nums[i];
            }
        }
    return ans;
    }
}
