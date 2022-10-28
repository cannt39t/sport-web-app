package com.sport.net.service.impl;

import com.sport.net.dao.ContactDao;
import com.sport.net.dao.impl.ContactDaoImpl;
import com.sport.net.model.Contact;
import com.sport.net.service.ContactService;

public class ContactServiceImpl implements ContactService {

    ContactDao contactDao = new ContactDaoImpl();

    @Override
    public void add(Contact contact) {
        contactDao.add(contact);
    }
}
