public class Main {

    public static void main(String[] args) {
        var revString = new ReverseString();
        var arrayTotal = new ArraySum();

        int[] myArr = {1, 2, 3 ,4, 5};

        System.out.println(arrayTotal.arraySum(myArr));

        System.out.println(revString.ReverseString("hello"));
    }
}
