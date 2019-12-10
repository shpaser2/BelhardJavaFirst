package by.belhard.j18.finalProject.repository;


import by.belhard.j18.finalProject.model.Event;
import by.belhard.j18.finalProject.model.Step;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EventsRepository {

    private static final String GET_ALL_EVENTS = "select * from events";

    public static List<Event> getAllEvents() {

        List<Event> eventsList = new ArrayList<>();

        try {
            Connection connection = Jdbc.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(GET_ALL_EVENTS);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");;
                String title = resultSet.getString("title");
                Date startTime = resultSet.getDate("startTime");
                Date endTime = resultSet.getDate("endTime");
                List<Step> steps = StepsRepository.getAllSteps();
                eventsList.add(new Event(id, title, startTime, endTime, (ArrayList<Step>) steps));
            }
        } catch (SQLException e) {
            System.err.println("Error while loading events list");
            e.printStackTrace();
        }

        return eventsList;
    }

}
