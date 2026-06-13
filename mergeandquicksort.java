public class mergeandquicksort {
    public static void MergeSort(int arr[] , int si, int ei){
       if( si >= ei){
        return;
       }
            int mid = si + (ei - si)/2;
            MergeSort(arr, si, mid);
            MergeSort(arr, mid+1, ei);
            Merge( arr, si,  ei, mid);
        
    }
    public static void Merge(int arr[], int si, int ei, int mid){
           
                int temp[] = new int[ei-si + 1];

                int i = si;  //for left array to traverse
                int j = mid + 1 ; //for right array to traverse 
                int k = 0; //for temp array to traverse 

                while( i <= mid && j <= ei){
                    if( arr[i] < arr[j]){
                        temp[k++] = arr[i++];
                    }else{
                        temp[k++] = arr[j++];
                    }
                }
                //left element from left sorted array
                while( i <= mid)
{
                temp[k++] = arr[i++];
}

                //left element from right sorted array
                while( j <= ei){
                    temp[k++] = arr[j++];
                }

                //npw whoever left to add in the temp 

                for( k = 0, i  = si;  k < temp.length; k++, i++ ){
                        arr[i] = temp[k];
                }


              




            
    }

    public static void QuickSort( int arr[], int si, int ei){
        if( si >= ei){
            return;
        }

        int pIdx = Partition(arr, si, ei);
        QuickSort(arr, si, pIdx-1);
        QuickSort(arr, pIdx+1, ei);
    }
    public static int Partition( int[] arr, int si, int ei ){
       
        int pivot = arr[ei];
         int i = si -1;
         for( int j = si; j < ei; j++){
                 if( arr[j] <= pivot){
                    i++;
            //sswap
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
        //for pivot indecx how toplace it 
       
         }

          i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
       
    }


    public static void PrintArr(int arr[]){
        for ( int i= 0; i < arr.length; i++){
            System.out.print(arr[i]+" \t");
        }
    }
public static void main(String[] args) {
    int[] arr = { 4, 3, 6, 2, 9, 2, -5};
    QuickSort(arr, 0, arr.length-1);
    PrintArr(arr);

}
}
