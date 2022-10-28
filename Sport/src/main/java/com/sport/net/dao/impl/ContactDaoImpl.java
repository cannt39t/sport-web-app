package com.sport.net.dao.impl;

import com.sport.net.model.Contact;
import com.sport.net.util.PostgresConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ContactDaoImpl implements com.sport.net.dao.ContactDao {

    private final Connection connection = PostgresConnectionUtil.getConnection();

    public List<Contact> getAll() {
        try {
            Statement statement = connection.createStatement();
            String sql = "SELECT * from contact;";
            ResultSet resultSet = statement.executeQuery(sql);

            List<Contact> contacts = new ArrayList<>();

            while (resultSet.next()) {
                Contact contact = new Contact(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("surname"),
                        resultSet.getString("country"),
                        resultSet.getString("value")
                );
                contacts.add(contact);
            }

            return contacts;
        } catch (SQLException e) {
            return List.of();
        }
    }

    @Override
    public void add(Contact contact) {

        String sql = "INSERT into contact (name, surname, country, value) VALUES (?, ?, ?, ?);";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, contact.getName());
            preparedStatement.setString(2, contact.getLastname());
            preparedStatement.setString(3, contact.getCountry());
            preparedStatement.setString(4, contact.getValue());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {

        }
    }
}
