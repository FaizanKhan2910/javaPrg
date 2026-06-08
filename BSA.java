public class BSA {
    public static void BubbleSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] < arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();

    }
    public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
                int minPos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPos]  < arr[j] ){
                    //IF WE SWAP THEN it will be like bubble sort
                    //we are not doing swap here
                    minPos = j;
                }
            } 
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;

        }
        
    }

    public static void InsertionSort(int arr[]) {
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            //finding out the correct postion to insert 
            while( prev >=0 && arr[prev] < curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;


        }
    }
   public static void countingSort(int arr[]){
    int largest = Integer.MIN_VALUE;
    for(int i=0; i<arr.length; i++){
        largest = Math.max(largest, arr[i]);
    }

    int count[] = new int[largest + 1];
    for(int i=0; i<arr.length; i++){
        count[arr[i]]++;

    }
    //sorting
    int j = 0;
    for(int i=0; i<count.length; i++){
        while(count[i] > 0){
            arr[j] = i;
            j++;
            count[i]--;
        }
    }
   }

    
    public static void main(Solution[] args) {
        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        selectionSort(arr);
        printArray(arr);
    }
}







