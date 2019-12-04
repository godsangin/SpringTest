package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.Phone;
import com.example.demo.service.PhoneService;

@Controller
public class MyController {
	@Autowired
	PhoneService phoneService;
	@GetMapping("/")
	public String getHTMLHello() {
		return "hello";
	}
	@GetMapping("/allprice")
	@ResponseBody
	public List<Phone> getAllPhonePrice() {
		return phoneService.getAllPhonePrice();
	}
	
	@GetMapping("/insertPhone")
	@ResponseBody
	public boolean insertPhone() {
		Phone phone = new Phone("MyPhone", 1,1);
		return phoneService.insertPhone(phone);
	}
}
