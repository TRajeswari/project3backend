package com.rajii.collabmiddleBackEnd.Dao;

import java.util.List;

import collabmiddleBackEnd.Model.Blogs;

public interface BlogDao
{
	 
	
		boolean addBlog(Blogs blogs);
		List<Blogs> getAllBlogs();
		boolean editBlogs(Blogs blogs);
		boolean deleteBlogs(Blogs blog);
		boolean getBlog(int blogId);
		

	}



