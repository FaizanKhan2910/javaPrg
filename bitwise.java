
public class bitwise {
    
    public static void OddorEven(int n) {
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("Even Number");
        } else{
            System.out.println("Odd Number");
        }
        
    }

  
    public static int FindUnique(int arr[]) {
        int unique = 0 ;
        //fpr (int i=0; i<arr.length; i++)
       for( int n : arr){
           
                unique ^=n;
            }
            return unique;

        }

        public static int getIthBit(int n, int i) {
            int bitmask = 1<<i;
            if((n & bitmask)==0){
                return 0;
            }
            else{
                return 1;
            }

        }
       
        public static int clearIthBit(int n, int i){
        int bitmask = ~(1<<i);
         return n & bitmask;
        }
        public static boolean isPowerofTwo(int n){
            return (n &(n - 1)) == 0;
        }

    public static int setIthBit(int n , int i){
        int bitMask = 1<<i;
        return n | bitMask;


    }
    
    public static int  CountsetBith(int n){
        int count = 0;
        while(n > 0){
        if((n & 1) != 0){
            count++;
          

        }
        n=n>>1;
    }
    return count;
}


    public static void main(String[] args) {
    //    int[] arr = {2, 3, 4, 3, 2, 5, 6, 5, 4};
    //    System.out.println(Fi ndUnique(arr));
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // a = a ^ b;
    // b = a ^ b;
    // a = a ^ b;


    // System.out.println("After Swapping");
    // System.out.println("New A :" + a);
    // System.out.println("New B :" + b);

        // int num = 9;

        // System.out.println("Before: " + num);

        // num = -~num;

        // System.out.println("After: " + num);

        for(char ch='A'; ch <='Z'; ch++){
            System.out.println((char)(ch | ' '));
        }

    }
}


 