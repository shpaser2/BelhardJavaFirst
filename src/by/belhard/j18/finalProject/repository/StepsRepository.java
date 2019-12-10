package by.belhard.j18.finalProject.repository;

import by.belhard.j18.finalProject.model.Step;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StepsRepository {

    private static final String GET_ALL_STEPS = "select * from eventSteps";

    public static List<Step> getAllSteps() {

        List<Step> stepsList = new ArrayList<>();

        try {
            Connection connection = Jdbc.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(GET_ALL_STEPS);

            while (resultSet.next()) {
                int stepId = resultSet.getInt("stepId");;
                String stepDescription = resultSet.getString("stepDescription");
                boolean done = resultSet.getBoolean("done");
                int eventId = resultSet.getInt("eventId");
                stepsList.add(new Step(stepId, eventId, stepDescription, done));
            }
        } catch (SQLException e) {
            System.err.println("Error while loading players list");
            e.printStackTrace();
        }

        return stepsList;
    }

}
