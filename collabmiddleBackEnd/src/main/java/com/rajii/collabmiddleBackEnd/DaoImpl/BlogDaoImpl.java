package com.rajii.collabmiddleBackEnd.DaoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.rajii.collabmiddleBackEnd.Dao.BlogDao;
import collabmiddleBackEnd.Model.Blogs;


public class BlogDaoImpl implements BlogDao

{
	
@Autowired
SessionFactory factory;
	public boolean addBlog(Blogs blogs)
	{
	Session session= factory.openSession();
		
		return false;
	}

	public List<Blogs> getAllBlogs() 
	{
		
		
		return null;
	}

	public boolean editBlogs(Blogs blogs) {
		
		return false;
	}

	public boolean deleteBlogs(Blogs blog) {
		
		return false;
	}

	public boolean getBlog(int blogId) {
	
		return false;
	}

}
