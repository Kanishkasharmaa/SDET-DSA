public class MinimumSizeSubarraySum {
    static int MinSizeSubarraySum(int[] nums,int target){
        int n=nums.length;
        int left=0;
        int sum=0;
        int minLength=Integer.MAX_VALUE;

        for(int right=0;right<n;right++){
            //Expand Window
            sum+=right;

            //shink window while condition is satisfied
            while (sum>=target){
                int curentLength=right-left+1;
                minLength=Math.min(minLength,curentLength);
                sum-=nums[left];
                left++;
            }
        }
        if(minLength==Integer.MAX_VALUE){
            return 0;
        }

        return minLength;
    }
    static void main(String[] args) {
        int[] nums={2,3,1,2,4,3};
        int target=7;

        System.out.println(MinSizeSubarraySum(nums,target));
    }
}
