package com.kce.Controller;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kce.Model.Stud_Store;

@Controller
public class Stud_Teacher {
@Autowired
SessionFactory sf;
@RequestMapping("/")
public String displayfirst() {
	return "stud";
}
@RequestMapping("/stud_store")
@Transactional
public String store_detail(@ModelAttribute("stud_store") Stud_Store tempstud_store) {
	Session s=sf.getCurrentSession();
	s.save(tempstud_store);
	return "stud";
}
}