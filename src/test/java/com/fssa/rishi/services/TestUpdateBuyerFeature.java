package com.fssa.rishi.services;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.sql.Date;

import org.junit.jupiter.api.Test;

import com.fssa.rishi.model.User;
import com.fssa.rishi.services.exceptions.ServiceException;

class TestUpdateBuyerFeature {

	@Test
	void testUpdateSuccess() {
		UserService userService = new UserService();
		Date dob = Date.valueOf("2003-08-01");
		long phoneNo = 9876543214L;
		long id = 1698899379896L;

		User user1 = new User(id, "yogeshwaran@gmail.com", "Kannan", "Ajai@1234", phoneNo, "Erode",
				"12, gandhi street, gobi", dob, 954323);

		try {
			assertTrue(userService.updateUser(user1));
 
		} catch (ServiceException e) {
			e.printStackTrace();
			fail();
		}
	}

//	@Test
//	void testInvalidUpdate() {
//		UserService userService = new UserService();
//		Date dob = Date.valueOf("2033-08-01");
//		long phoneNo = 987654310L;
//		long id = 1693370759102L;
//
//		User user1 = new User(id, "ajaingmailcom", null, "Aj45", phoneNo, null, "12, gandhi street, gobi", dob,
//				98754);
//		try {
//			assertFalse(userService.updateUser(user1));
//		} catch (ServiceException e) {
//			e.printStackTrace();
//		}
//	}
}
