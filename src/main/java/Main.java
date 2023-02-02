

public class Main {

    public static void main(String[] args) {
        var revString = new ReverseString();
        var arrayTotal = new ArraySum();
        var countingValleys = new CountingValleys();
        var primeNums = new PrimeNumbers();

        int[] myArr = {1, 2, 3 ,4, 5};


        System.out.println(primeNums.primeNumbers(15));
        System.out.println(arrayTotal.arraySum(myArr));
        System.out.println(countingValleys.countValleys("duuddduu"));
        System.out.println(revString.ReverseString("hello"));
    }
}
