public class MaximumSumSubarray {
    public static int maxSumSubarray(int[] arr, int k){
        int n=arr.length;
        if(n<k){
            return 0;
        }
        int windowSum=0;
        int maxSum=Integer.MIN_VALUE;

        // sum of first k elements
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        maxSum=windowSum;
        //slide the window
        for(int i=k;i<n;i++){
            windowSum+=arr[i]-arr[i-k];
            maxSum=Math.max(maxSum,windowSum);

        }

        return maxSum;


    }
    static void main(String[] args) {
        int[] nums = {2,1,5,1,3,2};
        int k=3;
        System.out.print(maxSumSubarray(nums,k));

    }
}
