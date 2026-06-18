public class find_subset {
        public static void Subset( String str, String ans, int i ){

            //base coondition
            if(i == str.length()){
                System.out.print(ans+ " ");
                return;
            }

            //kaam
            Subset(str, "", i+1);  // for not taking and saying no to str abc
            Subset(str, ans + str.charAt(i), i+1); // for saying yes and taking all str of abc

        }
    public static void main(String[] args) {
        String str = "abcd";
        Subset(str, "" , 0);
    }
}
