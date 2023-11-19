package Arrays.LinearSearch.qestion;

public class SearchInString {
    public static void main(String[] args) {
         String str="shivam";
         int ans=Srch(str,'i');
        System.out.println(ans);
    }

     static int Srch(String str, char i) {
         for (int j = 0; j < str.length(); j++) {
             if (str.charAt(j)==i){
                 return j;
             }
         }
         return -1;
    }
}


