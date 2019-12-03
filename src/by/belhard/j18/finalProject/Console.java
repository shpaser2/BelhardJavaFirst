package by.belhard.j18.finalProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console implements Runnable {

    public String consoleBuffer;

    private void listenConsole() {
        try (BufferedReader rdr = new BufferedReader(
                new InputStreamReader(System.in))) {
            consoleBuffer = "";
            while (!"exit".equals(consoleBuffer)) {
                showMenu();
                consoleBuffer = rdr.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showMenu(){
        System.out.println("Select menu item. Press number");
        System.out.println("1) Add new event");
        System.out.println("Show in detail one event");
        System.out.println("Show all events");
        System.out.println("2) Delete event");
        System.out.println("3) Change event");
            System.out.println("Change event name");
            System.out.println("Change event start date");
            System.out.println("Change event end date");
            System.out.println("1) Add new step to event");
            System.out.println("2) Delete step from event");
            System.out.println("3) Rewrite step in event");

        System.out.println();
    }

    @Override
    public void run() {
        Console c = new Console();
        c.listenConsole();
    }
}
