package Rishi.services;

import Rishi.model.User;

public class TestDeleteSellerFeature {
	public static void main(String[] args) {
		User user1 = new User("ajaikumar@gmail.com", true);

		UserService sellerService = new UserService();

		try {
			sellerService.DeleteUser(user1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
