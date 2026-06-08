public class NumbersExample {
 
 public static void main(String[] args) {
   int[] arr = {1, 3, 5, 33,55, 67, };
   int tar = 55;
   System.out.println(search(arr, tar, 0, arr.length-1));

 } 
  static int search(int arr[], int tar, int st, int end){
     

   if(st > end){
      return -1;
   }

   int mid = st +  (end - st)/2;

   if( arr[mid] == tar){
      return mid;
   }
   if( tar < arr[mid] ){
      return search(arr, tar , st , mid - 1);
   }

   return search(arr, tar, mid + 1, end );
  }

}
