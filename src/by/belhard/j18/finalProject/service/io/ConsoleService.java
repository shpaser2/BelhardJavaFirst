package by.belhard.j18.finalProject.service.io;

import by.belhard.j18.finalProject.model.Event;
import by.belhard.j18.finalProject.model.Step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class ConsoleService {

    private static final String WELCOME_MESSAGE =
            "\n" +
                    "##################################\n" +
                    "#### !WELCOME TO EVENT DIARY! ####\n" +
                    "############ continue ############\n" +
                    "##################################\n\n";

    private static final String MAIN_LEGEND =
            "\n" +
                    "1) Add new event\n" +
                    "2) Show all events\n" +
                    "3) Work with one event. Select it's number\n";

    private static final String EVENT_LEGEND =
            "\n" +
                    "1) Rewrite event\n" +
                    "2) Delete event\n" +
                    "3) Show details of event\n" +
                    "4) Add new step in event\n" +
                    "5) Work with steps of event\n";

    private static final String STEPS_LEGEND =
            "\n" +
                    "1) Rewrite step\n" +
                    "2) Delete step\n" +
                    "3) Show details of step\n";

    private static final BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in));

    public void printMainMenu() {
        System.out.println(WELCOME_MESSAGE);
    }

    public void printEventMenu() {
        System.out.println(EVENT_LEGEND);
    }

    public void printStepMenu() {
        System.out.println(STEPS_LEGEND);
    }

    private String getInput() {
        String input = null;
        try {
            input = rdr.readLine();
        } catch (IOException e) {
            System.err.println("Error while input");
            e.printStackTrace();
        }
        return input;
    }

    private int getInputInteger() {
        return Integer.parseInt(getInput());
    }

    /**
     * For events and steps.
     * @param items
     * @return position of event/step in event/step list
     */
    private int makeChoice(List items) {
        for (int i = 0; i < items.size(); i++)
            System.out.printf("%d) %s\n", i + 1, items.get(i));
        return getInputInteger() - 1;
    }

    /**
     * Helps to select event from existing events.
     * @param events
     * @return
     */
    public Event choseEvent(List<Event> events){
        System.out.println("Choose event: \n");
        int chosenEvent = makeChoice(events);
        return events.get(chosenEvent);
    }

    public void showEvent(List<Event> events, int index){
        System.out.println(events.get(index).toString());
    }

    public void showAllEvents(List<Event> events){
        for (int index = 0; index < events.size(); index++){
            showEvent(events, index);
        }
    }

    List<Event> deleteEvent(List<Event> events, int index){

    }

    List<Event> addEvent(List<Event> events, String[] args){

    }

    List<Event> changeEvent(List<Event> events, int index, String[] args){

    }

    /**
     * Helps to select step from existing steps.
     * @param steps
     * @return
     */
    public Step choseStep(List<Step> steps){
        System.out.println("Choose step: \n");
        int chosenStep = makeChoice(steps);
        return steps.get(chosenStep);
    }

    public void showStep(List<Step> steps, int index){
        System.out.println(steps.get(index).toString());
    }

    public void showAllSteps(List<Step> steps){
        for (Step step : steps) {
            System.out.println(step.toString());
        }
    }

    List<Step> deleteStep(List<Step> steps, int index){

    }

    List<Step> addStep(List<Step> steps, String[] args){

    }

    List<Step> changeStep(List<Step> steps, int index, String[] args){

    }


}
