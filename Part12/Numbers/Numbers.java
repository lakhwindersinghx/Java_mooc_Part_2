import java.util.Random;

public class Numbers {
    public static void main(String[] args) {
        random(8);
    }
    public static void random(int times){
        Random ladyluck=new Random();
        for(int i=0;i<times;i++) {
            int randomNumber = ladyluck.nextInt(10);
            System.out.println(randomNumber);
        }
    }
}
