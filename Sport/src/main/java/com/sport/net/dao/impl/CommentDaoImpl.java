package com.sport.net.dao.impl;

import com.sport.net.dao.CommentDao;
import com.sport.net.model.Comment;
import com.sport.net.util.PostgresConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CommentDaoImpl implements CommentDao {

    private final Connection connection = PostgresConnectionUtil.getConnection();

    public List<Comment> getAll() {
        try {
            Statement statement = connection.createStatement();
            String sql = "SELECT * from comment;";
            ResultSet resultSet = statement.executeQuery(sql);

            List<Comment> contacts = new ArrayList<>();

            while (resultSet.next()) {
                Comment comment = new Comment(
                        resultSet.getInt("id"),
                        resultSet.getString("value"),
                        resultSet.getInt("author_id"),
                        resultSet.getInt("training_id")
                );
                contacts.add(comment);
            }

            return contacts;
        } catch (SQLException e) {
            return List.of();
        }
    }

    @Override
    public void add(Comment comment) {

        String sql = "INSERT into comment (value, author_id, training_id) VALUES (?, ?, ?);";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, comment.getValue());
            preparedStatement.setInt(2, comment.getAuthor_id());
            preparedStatement.setInt(3, comment.getTraining_id());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        CommentDao commentDao = new CommentDaoImpl();
        Comment comment = new Comment("32334", 1, 3);
        commentDao.add(comment);
    }


}
