package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PhoneDao;
import com.example.demo.dto.Phone;

@Service
public class PhoneService {
	@Autowired
	PhoneDao phoneDao;
	
	public List<Phone> getAllPhonePrice() {
		List<Phone> phones = phoneDao.getPhoneList();
		return phones;
	}
	public boolean insertPhone(Phone p) {
		return phoneDao.addPhone(p);
	}
	public boolean updatePhone(Phone p) {
		return phoneDao.updatePhone(p);
	}
	public boolean deletePhone(Phone p) {
		return phoneDao.deletePhone(p);
	}
}
