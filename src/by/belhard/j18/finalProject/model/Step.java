package by.belhard.j18.finalProject.model;

public class Step {
    private int stepId;
    private int nextStepId;
    private int eventId;
    private String stepDescription;
    private boolean done;


    public int getStepId() {
        return stepId;
    }

    public void setStepId(int stepId) {
        this.stepId = stepId;
    }

    public int getNextStepId() {
        return nextStepId;
    }

    public void setNextStepId(int nextStepId) {
        this.nextStepId = nextStepId;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getStepDescription() {
        return stepDescription;
    }

    public void setStepDescription(String stepDescription) {
        this.stepDescription = stepDescription;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
