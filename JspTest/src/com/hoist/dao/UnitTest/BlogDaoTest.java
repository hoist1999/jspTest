package com.hoist.dao.UnitTest;

import java.util.List;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.hoist.dao.BlogDao;
import com.hoist.model.Blog;

public class BlogDaoTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void getListTest() {
		BlogDao blogDao = new BlogDao();
		List<Blog> blogList = blogDao.getBlogList();
		Assert.assertEquals(3, blogList.size());
	}

}
