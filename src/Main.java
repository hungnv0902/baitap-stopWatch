

public class Main {
    private static int sum() {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }

    private static void doJob(int count) {
        for (int i = 0; i < count; i++) {
            sum();
        }
    }
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        doJob(10000000);
        stopWatch.stop();
        long millis = stopWatch.getElapsedTime();
        System.out.println(millis);

    }
}
