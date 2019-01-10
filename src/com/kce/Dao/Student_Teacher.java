package com.kce.Dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kce.Model.Stud_Store;

@Repository
public class Student_Teacher {

@Autowired
SessionFactory sf;
@Transactional
public void store(Stud_Store tempstud_store)
{
	Session s=sf.getCurrentSession();
	s.save(tempstud_store);
}

}
