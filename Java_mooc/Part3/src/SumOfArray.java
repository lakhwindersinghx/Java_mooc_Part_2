import org.w3c.dom.ls.LSOutput;

public class SumOfArray {
    public static void main(String[] args) {
        int[] numbers = {5, 1, 3, 4, 2};
        int result=sumOfNumbersInArray(numbers);
        System.out.println(result);
    }

    public static int sumOfNumbersInArray(int[] array) {
        int sum=0;
        for(int item:array){
            sum+=item;
        }

    return sum;
    }

}
