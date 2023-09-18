package com.fssa.rishi.services;

import java.util.List;

import com.fssa.rishi.dao.UserDAO;
import com.fssa.rishi.dao.exceptions.DAOException;
import com.fssa.rishi.model.User;
import com.fssa.rishi.services.exceptions.ServiceException;
import com.fssa.rishi.validation.UserValidator;
import com.fssa.rishi.validation.exceptions.InvalidUserException;

public class UserService {
	public boolean registerUser(User user) throws ServiceException {
		UserDAO userDAO = new UserDAO();
		try {
			UserValidator.validateUser(user);
			userDAO.checkUserDataExistOrNot(user.getEmail());
			if (userDAO.createUser(user)) {
				System.out.println(user.getUsername() + " Successfully registered!");
				return true;
			} else {
				return false;
			}

		} catch (DAOException | InvalidUserException e) {
			throw new ServiceException(e.getMessage());
		}
	}

	public boolean logInUser(User user) throws ServiceException {
		UserDAO userDAO = new UserDAO();
		try {
			UserValidator.validateLogIn(user);
			if (userDAO.checkUserLogin(user.getEmail(), user.getPassword())) {
				System.out.println(user.getEmail() + " Successfully Logged In!");
				return true;
			} else {
				return false;
			}

		} catch (DAOException | InvalidUserException e) {
			throw new ServiceException(e.getMessage());
		}

	}

	public List<User> readUserDetails(User user) throws ServiceException {
		UserDAO userDAO = new UserDAO();
		try {
			UserValidator.validateUserDetailReadFeature(user);
			return userDAO.readUser();
		} catch (DAOException | InvalidUserException e) {
			throw new ServiceException(e.getMessage());
		}
	}

	public boolean updateUser(User user) throws ServiceException {
		UserDAO userDAO = new UserDAO();
		try {
			UserValidator.validateUpdateUser(user);
			if (userDAO.updateUser(user)) {
				System.out.println(user.getEmail() + " Details are Successfully Modified!");
				return true;
			} else {
				return false;
			}

		} catch (DAOException | InvalidUserException e) {
			throw new ServiceException(e.getMessage());
		}

	}

	public long findIdByEmail(String email) throws ServiceException {
		long user;
		try {
			user = UserDAO.findIdByEmail(email);
			return user;
		} catch (DAOException e) {
			throw new ServiceException(e.getMessage());
		}

	}
	
	public int findTypeByEmail(String email) throws ServiceException {
		int user;
		try {
			user = UserDAO.findTypeByEmail(email);
			return user;
		} catch (DAOException e) {
			throw new ServiceException(e.getMessage());
		}

	}

	public static User findUserById(long id) throws ServiceException {
		try {
			return(UserDAO.findUserById(id));
		} catch (DAOException e) {
			throw new ServiceException(e.getMessage());
		}
	}

	public boolean deleteUser(String userEmail) throws ServiceException {
	    UserDAO userDAO = new UserDAO();
	    try {
	        // No need for User object here, just pass the email
	        UserValidator.validateDeleteUser(userEmail);

	        if (userDAO.deleteUser(userEmail)) {
	            System.out.println(userEmail + " Details are Successfully deleted!");
	            return true;
	        } else {
	            return false;
	        }

	    } catch (DAOException | InvalidUserException e) {
	        throw new ServiceException(e.getMessage());
	    }
	}


}
