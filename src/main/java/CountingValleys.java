public class CountingValleys {

    public int countValleys(String str) {
        int elevation = 0;
        int valleys = 0;
        str = str.toLowerCase();
        for(char c : str.toCharArray()) {
            if(c == 'u') {
                if(elevation == -1) {
                    valleys++;
                }
                elevation++;
            }
            if(c == 'd') {
                elevation--;
            }
        }
        return valleys;
    }
}
