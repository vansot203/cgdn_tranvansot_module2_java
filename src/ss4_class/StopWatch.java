package ss4_class;

public class StopWatch { private long startTime;
    private long endTime;
    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }
    public void start() {
        this.startTime = System.currentTimeMillis();
    }
    public void stop() {
        this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime() {
        return endTime - startTime;
    }
}
