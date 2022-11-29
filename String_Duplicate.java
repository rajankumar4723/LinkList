public class String_Duplicate {
    
    /**
     * @param str1
     * @param str2
     * @param n
     * @param m
     * @return
     */
    public static boolean stringDuplicate(String str1, String str2,int n,int m) {

        int j = 0;
        for(int i = 0; i < n && j < m; i++){
            if(str1.charAt(i) == str2.charAt(j))
            j++;
        }
        
        return j == m;
        
        
    }
    public static void main(String[] args) {
        String str1="ABCDEF";
        String str2="ABC";
        System.out.print(stringDuplicate(str1, str2, 6, 3));
      

    }
}
