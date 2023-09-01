package com.spring.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.assignment.entity.Contact;


@Repository
public interface ContactRepo extends JpaRepository<Contact, Long> {

}