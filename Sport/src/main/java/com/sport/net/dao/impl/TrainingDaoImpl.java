package com.sport.net.dao.impl;

import com.sport.net.dao.TrainingDao;
import com.sport.net.model.Training;
import com.sport.net.util.PostgresConnectionUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TrainingDaoImpl implements TrainingDao {

    private final Connection connection = PostgresConnectionUtil.getConnection();

    @Override
    public List<Training> getAll() {
        try {
            Statement statement = connection.createStatement();
            String sql = "SELECT * from training;";
            ResultSet resultSet = statement.executeQuery(sql);

            List<Training> trainings = new ArrayList<>();

            while (resultSet.next()) {
                Training training = new Training(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getInt("approaches"),
                        resultSet.getString("complexity")
                );
                trainings.add(training);
            }

            return trainings;
        } catch (SQLException e) {
            return List.of();
        }
    }

    public static void main(String[] args) {
        TrainingDaoImpl trainingDao = new TrainingDaoImpl();
        trainingDao.getAll().forEach(System.out::println);
    }
}
