package io.github.longchuviet.mycontact.service;

import io.github.longchuviet.mycontact.entity.Contact;

import java.util.List;

public class ContactService {

    Iterable<Contact> findAll();
    List<Contact> search(String term);
    Contact findOne(Integer id);
    void save(Contact contact);
    void delete(Integer id);
}
