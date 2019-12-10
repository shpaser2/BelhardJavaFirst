package by.belhard.j18.finalProject.model;

import java.util.List;

public class Step {
    private int stepId;
    private int eventId;
    private String stepDescription;
    private boolean done;

    public Step(int stepId, int eventId, String stepDescription, boolean done) {
        this.stepId = stepId;
        this.eventId = eventId;
        this.stepDescription = stepDescription;
        this.done = done;
    }

    public int getStepId() {
        return stepId;
    }

    public void setStepId(int stepId) {
        this.stepId = stepId;
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

    public void showStep(List<Step> steps, int index){
        System.out.println(steps.get(index).toString());
    }

    public void showSteps(List<Step> steps, int index){
        for (int i = 0; i < steps.size(); i++) {
            showStep(steps, i);
        }
    }

    @Override
    public String toString() {
        return "Step{" +
                "stepDescription='" + stepDescription + '\'' +
                ", done=" + done +
                '}';
    }
}
