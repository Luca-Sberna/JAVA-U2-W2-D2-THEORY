package services;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import java.util.Random;

import org.springframework.stereotype.Service;

import entities.User;

@Service
public class UserService {
	private List<User> users = new ArrayList<>(List.of(new User(1, "Aldo", "Baglio"), new User(2, "Giovanni", "Storti"),
			new User(3, "Giacomo", "Poretti")));

	public List<User> getUsers() {
		return this.users;
	}

	public Optional<User> findUserById(int id) {
		User u = null;
		for (User user : users) {
			if (user.getId() == id)
				u = user;
		}

		return Optional.ofNullable(u);
	}

	public Optional<User> findUserByName(String name) {
		User u = null;
		for (User user : users) {
			if (user.getName().equals(name))
				u = user;
		}

		return Optional.ofNullable(u);
	}

	public User saveNewUser(User user) {
		Random rndm = new Random();
		user.setId(rndm.nextInt());
		this.users.add(user);
		return user;
	}

	public Optional<User> findUserByIdAndUpdate(int id, User user) {
		User found = null;

		for (User u : users) {
			if (u.getId() == id) {
				found = u;
				found.setName(user.getName());
				found.setSurname(user.getSurname());
				found.setId(id);
			}
		}
		return Optional.ofNullable(found);
	}

	public Optional<User> findUserByIdAndDelete(int id) {
		ListIterator<User> iterator = this.users.listIterator();

		User found = null;
		while (iterator.hasNext()) {

			User currentUser = iterator.next();
			if (currentUser.getId() == id) {
				found = currentUser;
				iterator.remove();
			}
		}
		return Optional.ofNullable(found);
	}

}