

public class Strings {
    public static boolean CheckPalindrome(String pdm){
            int n = pdm.length();
            for(int i = 0 ; i < pdm.length()/2; i++){
                if (pdm.charAt(i) != pdm.charAt(n-i-1)) {
                    return false;
                }

                }
                    return true;
                }
        public static float CheckPath(String path){
            int x = 0, y = 0;

            for(int i = 0; i < path.length()-1; i++){
                char dir = path.charAt(i);
                if(dir == 'S'){
                    y--;
                }
                else if(dir=='N'){
                    y++;
                }
                else if(dir=='E'){
                    x++;
                }
                else{
                    x--;
                }
                    
                
            }
        
            int X2 = x*x;
            int Y2 = y*y;

            return (float) Math.sqrt(X2+Y2); 
        }
    public static String toUpperCase(String str) {
        StringBuilder fk = new StringBuilder();
        char ch = Character.toUpperCase(str.charAt(1));
        fk.append(ch);
    
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                fk.append(str.charAt(i));
                i++;
                fk.append(Character.toUpperCase(str.charAt(i)));
            }
            else {
                fk.append(str.charAt(i));
            }
        }
       return fk.toString();
        
    }

    public static String Compress(String str) {
        String newStr = "";
        for(int i=1; i<str.length(); i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;

            }
            newStr += str.charAt(i);
            if(count > 1){
                newStr += count.toString();
            }
        }
        return newStr;
    }
    

  public static void main(String[] args) {
   
    // String str2 = new Scanner(System.in).next();
    // int count = 0 ;

    // for(int i=0; i< str2.length(); i++){
    //     char ch = str2.charAt(i);
    //     if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
    //         count++;
    //     }
    // }
    // System.out.println("Count of vowels in lowerCase :" + count);
//    String str2 = "FaizanKhan".replace("a", "");
//    System.out.println(str2);

//     String str1 = "earth";
//     String str2 = "heart";
//     //convert it in lower case so that we dont have to check diffrently for uppercase and lowercase
//    str1 =  str1.toLowerCase();
//    str2 =  str2.toLowerCase();

//    if(str1.length() == str2.length()){
//         char[] str1charArray = str1.toCharArray();
//         char[] str2charArray = str2.toCharArray();

//         //now you can sort the array in alphabetical order
//         Arrays.sort(str1charArray);
//         Arrays.sort(str2charArray);

//         //if sorted char arrays are same or identical thenstring are anagram

//         boolean result = Arrays.equals(str1charArray, str2charArray);

//             if(result){
//                 System.out.println(str1 + " and " + str2 + "are anagrams of each other.");
//             }   
//             else {
//                 System.out.println(str1 + " and " + str2 + "are not anagrams of each other.");
//             }

   
//    } else {
//     // case when length are not equal
//     System.out.println(str1 + " and " + str2 + "are not anagrams of each other ");
//    }

        
StringBuffer str = new StringBuffer("Hello");
     str.append("World");
     System.out.print(str);

  }


}
