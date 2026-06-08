
public class Sorting {

    public static void BubbleSort(int arr[]){
        for(int i =0; i< arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]> arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void SelectionSort(int arr[]){
        
    }

    public static void InsertionSort(int arr[]){
        for(int i=1; i < arr.length; i++){
            int temp = arr[i];
            int j = i - 1;
            while( j >= 0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;

            }
            arr[j+1] = temp;

        }
    }

    public static void PrintArr(int arr[]){
        for(int i=0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
       BubbleSort(arr); 
        PrintArr(arr);

    }
}