public class linearsearch{
    public static void main(String[] args) {
//         int[] nums = {23,423,4,24654,576,45,49};
//         int target = 0;
//         int ans = linears(nums,target);
//         System.out.println(ans); 
        
//     }
//     static  int linears(int[] arr, int target){
//         if(arr.length == 0){
//             return -1;
//         }
//         for(int i=0; i< arr.length; i++){
//             int element = arr[i];
//             if(element == target){
//                 return i;
//             }
//         }
//         return -1;
//     }
// }

// for return the element
int[] nums = {23,423,4,24654,576,45,49};
int target = 49;
int ans = linears(nums,target);
System.out.println(ans); 

}
static  int linears(int[] arr, int target){
if(arr.length == 0){
    return -1;
}
for(int element : arr){
    if(element == target){
        return element;
    }
}
return -1;
}
}




    
