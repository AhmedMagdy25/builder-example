
public class Main {
	public static void main(String[] args) {
		User user1 = new User.Builder("Ahmed", "abc").phone(1668645).build();
		User user2 = new User.Builder("Ali", "xyz").country("Egypt").build();
		System.out.println(user1.toString());
		System.out.println(user2.toString());
	}
}
