import java.util.Scanner;
public class StatisticsMainProgram {
    public static void main(String[] args) {
        Scanner scanner=new Scanner((System.in));
        Statistics statistics = new Statistics();
        Statistics sum = new Statistics();
        Statistics evenSum = new Statistics();
        Statistics oddSum = new Statistics();
//        statistics.addNumber(3);
//        statistics.addNumber(5);
//        statistics.addNumber(1);
//        statistics.addNumber(2);
//        System.out.println("Count: " + statistics.getCount());
//        System.out.println("Sum: "+ statistics.sum());
//        System.out.println("Average: "+ statistics.average());

        while(true){
            int entry=scanner.nextInt();
            if (entry==-1) {
                break;
            }else if(entry%2==0){
                evenSum.addNumber(entry);
            }else{
                oddSum.addNumber(entry);
            }
            statistics.addNumber(entry);

        }
        System.out.println("SUM OF NUMBERS: "+statistics.sum());
        System.out.println("SUM OF EVEN: "+ evenSum.sum());
        System.out.println("SUM OF ODD: "+ oddSum.sum());

    }
}
