package com.accp.springboot.pqw;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.accp.springboot.pojo.Starclass;
import com.accp.springboot.service.pqwservice.StarClassService;

@SpringBootTest
public class StarClassTest {
	@Autowired
	private StarClassService service;

	@Test
	public void save() {
		System.err.println(service.save(new Starclass("实习生", 0f)));
	}

	@Test
	public void pageList() {
		service.pageList(1, 5).getList().forEach(i -> {
			System.err.println(i.toString());
		});
	}

	@Test
	public void updateObj() {
		Starclass star = new Starclass("实习", 0.5f);
		star.setStarclassid(1);
		System.err.println(service.updateObj(star));
	}

	@Test
	public void deleteObj() {
		System.err.println(service.deleteObj(0));
	}
}
