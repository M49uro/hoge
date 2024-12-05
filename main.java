import java.util.Random;

public class HelloWorldRandom {
    public static void main(String[] args) {
        char[] chars = {'ハ', 'ロ', 'ー', 'ワ', 'ー', 'ル', 'ド'};

        Random random = new Random();

        int numDraws = 7;

        System.out.println("ちんちん：");
        for (int i = 0; i < numDraws; i++) {
            char randomChar = chars[random.nextInt(chars.length)];
            System.out.print(randomChar);
        }
        System.out.println(); 
    }
}