
public class Solution{

    public static void oddOrEven(int n){

    int bitMask = 1 ;
    if(( n & bitMask) == 0 ) {
        System.out.println("Number is Even");
    }
    else{
        System.out.println("Number is Odd");
    }
}

public static int setithBit(int n ,  int i){
    int bitMask = (1<<i);
    return n | bitMask;

}

public static boolean isPowerOfTwo(int n ){
     return (n&(n-1)) == 0;
}
    public static void main(String[] args){
        for( char ch = 'M'; ch<='Z'; ch++){
            System.out.print((char) (ch | ' '));
        }
} 
}

