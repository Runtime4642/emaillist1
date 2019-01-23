package com.douzone.emaillist.dao.test;

import java.util.List;

import com.douzon.emaillist.dao.EmailListDao;
import com.douzon.emaillist.vo.EmailListVo;

public class EmailListDaoTest {

	public static void main(String[] args) {
		insertTest();
		getListTest();
	}
	public static void getListTest() {
		
		List<EmailListVo> list = new EmailListDao().getList();
		for(EmailListVo vo : list)
		{
			System.out.println(vo);
		}
		
	}
	public static void insertTest()
	{
		EmailListVo vo = new EmailListVo();
		vo.setFirstName("정");
		vo.setLastName("영석");
		vo.setEmail("asdf2022@");
		new EmailListDao().insert(vo);
		
	}
	

}
