public class SecondLargest {
    public static int secondLargest(int[] arr){

     int n=arr.length;
     int largest=-1;
     int secondLargest=-1;

     for(int i =0;i<n;i++){
         if(arr[i]>largest){
             secondLargest=largest;
             largest=arr[i];
         } else if (arr[i]>secondLargest && arr[i]!=largest) {
             secondLargest=arr[i];

         }

     }

        return secondLargest;
    }


    static void main(String[] args) {
        int[] arr={12, 35, 1, 10, 34, 1};
        System.out.println(secondLargest(arr));
    }
}
