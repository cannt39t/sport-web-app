package com.sport.net.dao;

import com.sport.net.model.Comment;

import java.util.List;

public interface CommentDao {

    List<Comment> getAll();

    void add(Comment comment);

}
