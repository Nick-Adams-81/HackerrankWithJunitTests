public class Main {

    public static void main(String[] args) {
        var revString = new ReverseString();
        var arrayTotal = new ArraySum();
        var countingValleys = new CountingValleys();

        int[] myArr = {1, 2, 3 ,4, 5};

        System.out.println(arrayTotal.arraySum(myArr));
        System.out.println(countingValleys.countValleys("duuddduu"));
        System.out.println(revString.ReverseString("hello"));
    }
}
