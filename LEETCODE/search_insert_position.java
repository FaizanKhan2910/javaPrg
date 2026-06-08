class Solution {
    
    public static int Search(int arr[], int target ){
        int st = 0;
        int end = arr.length-1 ;

        while(st <= end){
            int mid = st + (end-st)/2;
            if(arr[mid ] == target){
                return mid;
            }
            else if( target < arr[mid]){
                end = mid -1;
            }
            else {
                st = mid + 1;
            }
            
        }
        return  st;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5};
        int target = 5;
        System.out.println(Search(arr, target));
    }

}
