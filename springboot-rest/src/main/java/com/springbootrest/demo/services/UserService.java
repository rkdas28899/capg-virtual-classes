package com.springbootrest.demo.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.springbootrest.demo.models.User;

@Service
public class UserService {

	private Map<Integer,User> userList;
	
	@PostConstruct
	public void addSomeUsers()
	{
		userList=new HashMap<>();
		User user1=new User(101,"rkdas","rkdas@gmail.com",9990976599L);
		User user2=new User(102,"jagadish","jaggu@gmail.com",9999765438L);
		User user3=new User(103,"somanath","sonu@gmail.com",99990976547L);
		User user4=new User(104,"govardhan","govi@gmail.com",9865324566L);
		
		userList.put(user1.getUserId(),user1);
		userList.put(user2.getUserId(),user2);
		userList.put(user3.getUserId(),user3);
		userList.put(user4.getUserId(),user4);
		
	}
	public Map<Integer, User> getUsers() {
		return userList;
	}
	
	
	public List<User> getUserList()
	{
		List<User> allUsers=new ArrayList<>();
		userList.forEach((k,v)->allUsers.add(v));
		
		return allUsers;
	}

	public User getUser(int userId)
	{
		return userList.get(userId);
	}
	
	public User addUser(User user)
	{
        userList.put(user.getUserId(),user);
        return user;
	}
	
	public boolean deleteUser(int userId)
	{
	    
		if(userList.containsKey(userId))
		{
			userList.remove(userId);
			return true;
		}
		else
		{
			return false;
		}
		
	}

	public User updateUser(User user)
	{
		User oldUserData=userList.get(user.getUserId());
		oldUserData.setUserName(user.getUserName());
		oldUserData.setEmail(user.getEmail());
		oldUserData.setPhoneNumber(user.getPhoneNumber());
		
		return oldUserData;
	}
}
