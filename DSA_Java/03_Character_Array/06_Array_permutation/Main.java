public class Main {
    public static int permutation(String A, String B) {
        A = A.toLowerCase();
        B = B.toLowerCase();

        if(A.length() > B.length()){
            return 0;
        }

        int len = (A.length() > B.length())?A.length():B.length();
        int matched = 0;

        for (int i = 0; i < A.length(); i++) {
            char word = A.charAt(i);
            for (int j = 0; j < B.length(); j++) {
                if(word == B.charAt(j)){
                    matched++;
                }
            }
        }
        if(matched == len){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        int value = permutation("abcdx", "dacb");
        if(value == 1){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
