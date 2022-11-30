import java.util.*;


public record Main() {
    public static String compression(String str){
        int n = str.length();
        String output = "";

        for(int i = 0; i<n; i++){
            int count = 1;
            while(i<n-1 && str.charAt(i+1) == str.charAt(i)){
                count++;
                i++;
            }
            output = output + str.charAt(i);
            output += (count);
        }
        if(output.length() > str.length()){
            return str;
        }
        return output;
    }
    public static void main(String[] args) {
        String a1 = "aaabbbcccc";
        System.out.println(compression(a1));
        String a2 = "abcd";
        System.out.println(compression(a2));
    }
}
