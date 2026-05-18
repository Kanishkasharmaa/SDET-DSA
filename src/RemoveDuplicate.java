public class RemoveDuplicate {
    static void main(String[] args) {
        int[] arr={1, 2, 2, 3, 4, 4};
        System.out.println(removeDuplicate(arr));
    }

    public static int removeDuplicate(int[] arr){
        int n=arr.length;
        int j=1;
        int unique=1;
        if(n==0 || n==1){
            return 0;
        }
        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1]){
                continue;
            }
            arr[j++]=arr[i];
            unique++;

        }

        return j;
    }
}
