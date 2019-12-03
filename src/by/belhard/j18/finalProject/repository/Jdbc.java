package by.belhard.j18.finalProject.repository;

import by.belhard.j18.lessons.lesson11.Employee;
import by.belhard.j18.lessons.lesson11.Specialty;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Jdbc {
    private static final String PATH =
            "jdbc:mysql://127.0.0.1/bh18db?serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "root";

    private static Connection connection;

    static {
        try {
            connection = DriverManager.getConnection(PATH, USER, PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(
                "select id, name, date_of_employment as date, specialty_id, salary from employees");
        List<Employee> listOfEmployees = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String name = resultSet.getString("name");
            Date date = resultSet.getDate("date");
            Specialty specialty = getSpecialtyEntity(resultSet.getInt("specialty_id"));
            int salary = resultSet.getInt("salary");
            listOfEmployees.add(new Employee(id, name, date, specialty, salary));
        }
        statement.close();
        connection.close();
        listOfEmployees.forEach(System.out::println);
    }

    private static Specialty getSpecialtyEntity(int specialtyId) throws SQLException {
        PreparedStatement statement = connection.prepareStatement(
                "select * from specialties where id = ?");
        statement.setInt(1, specialtyId);
        ResultSet resultSet = statement.executeQuery();
        Specialty result = null;
        while (resultSet.next()) {
            result = new Specialty(resultSet.getInt(1), resultSet.getString(2));
        }
        statement.close();

        return result;
    }
}
