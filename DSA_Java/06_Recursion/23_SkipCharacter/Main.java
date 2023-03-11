// bbbaaccddacda <- input
// ans <- aaccddacda

public class Main {
    public static void main(String[] args) {
        String str = "abbccaab";
        char skip = 'b';
        StringBuilder newStr = new StringBuilder();
        skipCharacter(str, skip, 0, newStr);
        System.out.println(newStr);
        System.out.println(skipCharacter2("rohitapple"));
        // System.out.println(skipAppletNotApp("rohitapple"));
    }

    public static void skipCharacter(String str, char skip, int index, StringBuilder newStr){
        if(str.length() == index) return;
        if(str.charAt(index) != skip){
            newStr.append(str.charAt(index));
        }
        skipCharacter(str, skip, index+1, newStr);
    }

    public static String skipCharacter2(String up){
        if(up.isEmpty()) return "";

        if(up.startsWith("apple")){
            return skipCharacter2(up.substring(5));
        }
        else{
            return up.charAt(0) + skipCharacter2(up.substring(1));
        }
    }

    // public static String skipAppletNotApp(String up){
    //     if(up.isEmpty()) return "";

    //     if(up.startsWith("app") && !up.startsWith("apple")){
    //         return skipAppletNotApp(up.substring(3));
    //     }
    //     else{
    //         return up.charAt(0) + skipAppletNotApp(up.substring(1));
    //     }
    // }
}
