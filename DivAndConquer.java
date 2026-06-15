public class DivAndConquer {

    public static int search(int arr[], int target, int si, int ei){
        //base condition
        if( si > ei){
            return -1;
        }
        //kaAM

        int mid = si + ( ei - si) / 2;

        //case found
        if( arr[mid] == target){
            return mid;
        }
        

        /// agar on L1. //left & right dono cover hojayegee
        if( arr[si] <= arr[mid]){
            // on left side of mid
            if( arr[si] <= target && target <= arr[mid]){
                  return search(arr, target, si, mid-1);
                }
                //case on right side of mid
            else {
                return search(arr, target, mid+1, ei);
            }
        }// on L2 

        else { //case on right 
            if(arr[mid] <= target &&  target <= arr[ei]){
                return search(arr, target, mid + 1, ei);
            }
            else {
                return search(arr, target, si, mid-1);
            }

        }
          
    

       
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7 , 0, 1, 2, 3 };
        int target = 5; //->output shouold be 4
        int tarIdx = search(arr, target, 0, arr.length-1);
        System.out.println(tarIdx);

            }
}
