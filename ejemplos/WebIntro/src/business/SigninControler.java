package business;

import java.util.ArrayList;

import entities.*;

public class SigninControler {
	/* this static arrayList should be removed and 
	 * replaced by the data layer
	 */
	public static ArrayList<User> mockUsers =
			new ArrayList<User>() {{
				add(new User("jperez@gmail.com","juanperez","123"));
				add(new User("jd@gmail.com","johndoe","jdrules"));
				add(new User("mm@gmail.com","mastermind","smarter"));
			}};
			
	public User getUser(User user) {
		for (User u : mockUsers) {
			if (u.equals(user) 
					&& u.getPassword().equals(user.getPassword())) {
				return u;
			}
		}
		return null;
	}

}
