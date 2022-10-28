package com.sport.net.dao.impl;

import com.sport.net.dao.UserDao;
import com.sport.net.model.User;
import com.sport.net.util.PasswordUtil;
import com.sport.net.util.PostgresConnectionUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserDaoImpl implements UserDao {

    private final Connection connection = PostgresConnectionUtil.getConnection();
    private static final Logger LOGGER = LoggerFactory.getLogger(UserDaoImpl.class);
    @Override
    public User get(int id) {
        return null;
    }

    @Override
    public List<User> getAll() {
        try {
            Statement statement = connection.createStatement();
            String sql = "SELECT * from users;";
            ResultSet resultSet = statement.executeQuery(sql);

            List<User> users = new ArrayList<>();

            while (resultSet.next()) {
                User user = new User(
                        resultSet.getInt("id"),
                        resultSet.getString("login"),
                        resultSet.getString("email"),
                        resultSet.getString("key"),
                        resultSet.getString("salt"),
                        resultSet.getString("gender"),
                        resultSet.getString("goal"),
                        resultSet.getString("form"),
                        resultSet.getString("name"),
                        resultSet.getInt("age"),
                        resultSet.getInt("height"),
                        resultSet.getInt("weight")
                );
                users.add(user);
            }

            return users;
        } catch (SQLException e) {
            LOGGER.warn("Failed execute get all query", e);
            return List.of();
        }
    }

    @Override
    public void save(User user) {
        String salt = PasswordUtil.generateSalt(512).get().toString();
        String key = PasswordUtil.hashPassword(user.getPassword(), salt).get().toString();

        String sql = "INSERT into users (login, email, key, salt) VALUES (?, ?, ?, ?);";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, user.getLogin());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, key);
            preparedStatement.setString(4, salt);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            LOGGER.warn("Failed execute save query", e);
        }
    }

    @Override
    public Optional<Boolean> login(User user) {
        try {
            String sql = "SELECT * FROM users WHERE login LIKE ? OR email LIKE ?;";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            User user_from_db = null;
            try {
                preparedStatement.setString(1, "%" + user.getLogin() + "%");
                preparedStatement.setString(2, "%" + user.getEmail() + "%");
                ResultSet resultSet = preparedStatement.executeQuery();

                while (resultSet.next()) {
                    user_from_db = new User(
                            resultSet.getInt("id"),
                            resultSet.getString("login"),
                            resultSet.getString("email"),
                            resultSet.getString("key"),
                            resultSet.getString("salt"),
                            resultSet.getString("gender"),
                            resultSet.getString("goal"),
                            resultSet.getString("form"),
                            resultSet.getString("name"),
                            resultSet.getInt("age"),
                            resultSet.getInt("height"),
                            resultSet.getInt("weight")
                    );
                }
            } catch (SQLException e) {
                LOGGER.warn("Failed execute save query", e);
            }

            try{
                String salt = user_from_db.getSalt();
            } catch (NullPointerException e){
                return Optional.empty();
            }
            String salt = user_from_db.getSalt();
            String password = user.getPassword();
            String key = user_from_db.getKey();

            Optional<Boolean> res = Optional.of(PasswordUtil.verifyPassword(password, key, salt));
            return res;

        } catch (SQLException e) {
            LOGGER.warn("Failed execute get all query", e);
            return Optional.of(Boolean.FALSE);
        }
    }

    public void update(User user){
        try {

            String sql = "UPDATE users SET gender = ?, goal = ?, form = ?, name = ?, age = ?, height = ?, weight = ? WHERE email LIKE ? AND  login LIKE ?;";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            try {
                preparedStatement.setString(1,  user.getGender() );
                preparedStatement.setString(2,  user.getGoal());
                preparedStatement.setString(3,  user.getForm() );
                preparedStatement.setString(4,  user.getName() );
                preparedStatement.setInt(5, user.getAge());
                preparedStatement.setInt(6, user.getHeight());
                preparedStatement.setInt(7, user.getWeight());
                preparedStatement.setString(8, "%" + user.getEmail() + "%");
                preparedStatement.setString(9, "%" + user.getLogin() + "%");
                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                LOGGER.warn("Failed execute save query", e);
            }

        } catch (SQLException e) {
            LOGGER.warn("Failed execute get all query", e);
        }
    }

    public static void main(String[] args) {
        //User user = new User("sdfsdf", "dssdfsdf", "dsdfdasdfas");
        User user = new User( "sdfsdf", "dssdfsdf", "hjgjgj",  "asdfsfas",  "forma",  "name",  3,  4,  5);
        UserDaoImpl userDao = new UserDaoImpl();
        userDao.getAll().forEach(System.out::println);
    }

}
