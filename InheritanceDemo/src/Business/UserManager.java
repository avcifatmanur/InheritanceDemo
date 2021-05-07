package Business;

import Entities.User;

public class UserManager {
	
	public void Add(User user) {
		System.out.println(user.getFullName()+" eklendi.");
	}
	public void multipleAdd(User[] users) {
		for (User user : users) {
			Add(user);
		}
	}
	public void Update(User user) {
		System.out.println(user.getFullName()+" güncellendi.");
	}
	public void Delete(User user) {
		System.out.println(user.getFullName()+" silindi.");
	}
	public void getAll(User[] users) {
		for (User user : users) {
			System.out.println(user.getFullName());
		}	
	}
	public int getById(User user) {
		return user.getId();
	}

}
