package com.entor.test;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entor.dao.StudentDao;
import com.entor.dao.impl.StudentDaoimpl;
import com.entor.entity.Classes;
import com.entor.entity.Student;
import com.entor.service.BaseService;
import com.entor.service.StudentService;

public class Test1 {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
//		StudentService studentService=(StudentService)ac.getBean("studentService");
		BaseService baseService=(BaseService)ac.getBean("baseService");
		/*List<Student>list=new ArrayList<>();
		for(int i=1;i<=10;i++) {
		Student s=new Student();
//		s.setId(10024);
		s.setName("ÍõÁ¦ºê"+i);
		s.setUsername("wanglihong"+i);
		s.setPassword("123123");
	    s.setSex(1);
	    s.setAge(33);
		s.setBirthday(new Date());
		s.setCreateTime(new Timestamp(System.currentTimeMillis()));	
		studentDao.add(s);
//		studentDao.update(s);
		}
		studentDao.addMore(list);*/
//		Student s=studentDao.queryById(10024);
//		System.out.println(s);
//		studentDao.deleteById(10024);
//		studentDao.deleteMore("10023,10025");
//		List<Student> list=studentDao.queryAll();
//		for(Student s:list) {
//			System.out.println(s);
//		}
//		List<Student> list=studentDao.queryByPage(10,20);
//		for(Student s:list) {
//			System.out.println(s);
//		}
//		Map<String,Integer> map=new HashMap<>();
//		map.put("start", 0);
//		map.put("pageSize", 30);
//		List<Student> list=studentDao.queryByPage(map);
//		for(Student s:list) {
//			System.out.println(s);
//		}
		
//		System.out.println(studentDao.getTotals());
//		System.out.println(studentService.getTotals());
		/*List<Student>list=new ArrayList<>();
		for(int i=1;i<=10;i++) {
		Student s=new Student();
//		s.setId(10035);
		s.setName("ÇÇµ¤"+i);
		s.setUsername("qiaodan"+i);
		s.setPassword("123456");
		s.setSex(1);
	    s.setAge(23);
		s.setBirthday(new Date());
		s.setCreateTime(new Timestamp(System.currentTimeMillis()));	
		list.add(s);
//		studentService.update(s);
		}
		studentService.addMore(list);*/
		
//		System.out.println(baseService.queryById(Classes.class,2));
//		studentService.deleteById(10057);
//		studentService.deleteMore(Student.class,"10096,10098");
//		List<Student> list=studentService.queryAll();
//		for(Student s:list) {
//			System.out.println(s);
//		}
		List<Classes>list=baseService.queryByPage(Classes.class,1,10);
		for(Classes s:list) {
			System.out.println(s);
		}
				}
}
