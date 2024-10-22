public class minimumarray {
    public static void main(String[] args) {
        int arr[] = {34,345,23,4,34,5,2434,45,4};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int ans = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }

    
}
