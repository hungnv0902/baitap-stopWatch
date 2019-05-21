import java.util.Date;
import java.text.SimpleDateFormat;

public class StopWatch {
    private Date startTime;
    private Date endTime;

    public StopWatch() {
    }

    public StopWatch(Date startTime, Date endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date start() {
        startTime = new Date();
        return startTime;
    }

    public Date stop() {
        endTime = new Date();
        return endTime;
    }

    public long getElapsedTime() {
        return endTime.getTime() - startTime.getTime();
    }
}
