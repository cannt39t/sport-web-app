package com.sport.net.service.impl;

import com.sport.net.dao.CommentDao;
import com.sport.net.dao.impl.CommentDaoImpl;
import com.sport.net.model.Comment;
import com.sport.net.service.CommentService;

import java.util.List;

public class CommentServiceImpl implements CommentService {

    CommentDao commentDao = new CommentDaoImpl();

    @Override
    public List<Comment> getAll() {
        return commentDao.getAll();
    }

    @Override
    public void add(Comment comment) {
        commentDao.add(comment);
    }
}
