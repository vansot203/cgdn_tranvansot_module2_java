package ss4_class;

public class StopWatch_chay {
    public static void main(String[] args) {
        StopWatch sw = new StopWatch();
        sw.start();
        int sum = 0;
        for (int i = 0; i < 1_000_000; i++) {
            sum += i;
        }
        sw.stop();
        System.out.println("Thời gian thực thi: " + sum + " milliseconds");
    }
}

