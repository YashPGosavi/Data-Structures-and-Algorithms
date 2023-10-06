public class _11_CompareStrings {
    
    public static int stringCompress(String str1, String str2) {
        int ans = 0;
        int n = str2.length();
        int i=0;
        while(n<=str1.length()){
            if(str2.equals(str1.substring(i,n))){
                ans ++;
            }
            n++;
            i++;
        }
        return ans;
    }

    public static void main(String[] args) {
        String str1 = "ansisthebestansoftheworldansans";
        String str2 = "ans";
        System.out.println(stringCompress(str1, str2));
    }

}