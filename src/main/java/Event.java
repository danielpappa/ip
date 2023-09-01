public class Event extends Task{
    protected String startTime;
    protected String endTime;
    public Event(String description, String startTime, String endTime) {
        super(description);
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public String getStartTime() {
        return startTime;
    }
    public String getEndTime() {
        return endTime;
    }
    public String getTime() {
        String timeInterval = startTime + " - " + endTime;
        return timeInterval;
    }
    public void setStartTime(String startTime) {

        this.startTime = startTime;
    }
    public void setEndTime(String endTime) {

        this.endTime = endTime;
    }
    public void setTime(String startTime, String endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }
    @Override
    public String toString() {
        String summary = String.format("[E] %s (from: %s, to: %s)", super.toString(), startTime, endTime);
        return summary;
    }
}