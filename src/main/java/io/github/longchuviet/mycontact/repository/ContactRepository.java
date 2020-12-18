package io.github.longchuviet.mycontact.repository;

import io.github.longchuviet.mycontact.entity.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ContactRepository extends CrudRepository<Contact, Integer> {
    List<Contact> findByNameContaining(String term);
}
