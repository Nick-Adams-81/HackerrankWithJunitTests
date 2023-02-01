public class ReverseString {

    public String ReverseString(String str) {
        String revString = "";
        char c;
        for(int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            revString = c + revString;
        }
        return revString;
    }
}
