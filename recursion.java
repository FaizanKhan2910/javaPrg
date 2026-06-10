public class recursion {

    public static void print(int n){
        if( n == 1){
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        print(n-1);
    }
    public static void printINc(int n){
        if( n == 1){
            System.out.print(n + " ");
            return;
        }
        printINc(n-1);
        System.out.print(n + " ");
    }

    public static int fact(int n){
        if( n == 0){
            return 1;

        }
        int fnm1 = fact(n-1);
        int fn = n * fact(n-1);
        return fn;
    }
    public static int Sum(int n){
        if( n == 1){

            return 1;

        }
        int Snm1 = Sum(n-1);
        int Sn = n + Snm1;
        return Sn;

    }
    public static int fibo(int n){
        if( n == 1 || n == 0){
            
            return n ;
        }
       int fbnm1 = fibo(n-1);
       int fbnm2 = fibo(n-2);
        int fn = fbnm1 + fbnm2;

        return fn;

    }

    public static boolean isSorted(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }

        if( arr[i] >  arr[i + 1]){
           return false;
        }
        return isSorted(arr, i+1);
    }



    public static int firstOccurance(int arr[], int key, int i ){
        
        if( i == arr.length-1){
             return -1;
        }
         if(arr[i] == key){
            return i;
         }

         return firstOccurance(arr, key, i + 1);
    }
        public static int LastOccurance(int arr[], int key, int i){

            if( i == arr.length){
                return -1;
            }
           
            int isFound = LastOccurance(arr, key, i+1);
            if(isFound == -1 && arr[i] == key){
                return i;
            }

            return isFound;
             
        }

        public static int PowerOfN(int x, int n){
            if( n == 0){return 1;}
            return x * PowerOfN(x, n-1);
        }

        public static int OptimisedPower(int a, int n){

            if( n == 0){
                return 1;
            }
            int PowerOf2 = OptimisedPower(a, n/2);
            int PowerOpti =  PowerOf2 * PowerOf2;

            if( n % 2 != 0){
                PowerOpti = a * PowerOpti;
            }
            return PowerOpti;
        }

        public static int TillingPrb(int n) // 2 * n
        {
            if( n == 0 || n == 1){
                return 1;
            }
            int vertical = TillingPrb(n-1);
            int horizontal = TillingPrb(n-2);

        return vertical + horizontal;
        }
public static void removeDuplicate(String str , int ind, StringBuilder newStr, boolean map[] ){
         if(ind == str.length() ){   
            System.out.println(newStr); 
            return;
    }
    //kaam karna hain kya kaam - jo bhi reepeat ho usko hata do 
    char currChar = str.charAt(ind);
    if(map[currChar - 'a' ] == true){
        removeDuplicate(str, ind+1, newStr, map);
    }
    else {
            map[currChar - 'a' ] = true;
        removeDuplicate(str, ind+1, newStr.append(currChar), map);
    }


}
    public static int FreindSharePrb( int n){
        if( n==1 || n == 2){
            return n;
        }
        return FreindSharePrb(n - 1) * (n-1) * FreindSharePrb(n-2);
    }
    //Binary String Problem 


    public static void prinBinStrings( int n, String str , int lastPlace){
//base case
          if( n==0){
            System.out.println(str);
            return;
          }
         

        //kaam'
        prinBinStrings(n-1, str+"0", 0);
if( lastPlace == 0){
    //sit 0  on chair n
    prinBinStrings(n-1, str+"1", 1);
}

    }

     public static void FindIndex( int[] arr , int key,  int i ){
            if( i == arr.length ){
                return;
            }
            if( arr[i] == key ){
                System.out.print(i+" ");
            }
            FindIndex(arr, key, i+1);
     }




     public static void main(String[] args) {
     int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
     int key = 2;
     FindIndex(arr, key, 0);
     
    
        }
        
        
    }
