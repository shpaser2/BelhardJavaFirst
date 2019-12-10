package by.belhard.j18.finalProject.model;


import java.util.ArrayList;
import java.util.Date;

public class Event {
    private int id = -1;
    private String title;
    private String eventDescription;
    private Date startTime;
    private Date endTime;
    private ArrayList<Step> steps;

    public Event(String title, Date startTime, Date endTime, ArrayList<Step> steps) {
        this.title = title;
        this.startTime = startTime;
        this.endTime = endTime;
        this.steps = steps;
    }

    public Event(int id, String title, Date startTime, Date endTime, ArrayList<Step> steps) {
        this.id = id;
        this.title = title;
        this.startTime = startTime;
        this.endTime = endTime;
        this.steps = steps;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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


    @Override
    public String toString() {
        return "Event{" +
                "title='" + title + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
