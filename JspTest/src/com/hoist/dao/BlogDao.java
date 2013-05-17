package com.hoist.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.hoist.model.Blog;

public class BlogDao {
	public List<Blog> getBlogList() {
		Session session = HibernateUtil.getSession();
String hql = "From Blog ";
Query query = session.createQuery(hql);
List<Blog> blogs = query.list();
	return blogs;
	}
}
