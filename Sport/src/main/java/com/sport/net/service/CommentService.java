package com.sport.net.service;

import com.sport.net.model.Comment;

import java.util.List;

public interface CommentService {

    List<Comment> getAll();

    void add(Comment comment);

}
