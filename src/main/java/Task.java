public class Task {
    private String description;
    private boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public char getStatusIcon() {
        return (isDone ? 'X' : ' '); // mark done task with X
    }
    public void markTaskAsDone() {
        isDone = true;
    }
    public void markTaskAsNotDone() {
        isDone = false;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return isDone;
    }
}

