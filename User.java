
public class User {
	private final String name;// required
	private final String password;// required
	private final int phone;// optional
	private final String country;// optional
	
	public User(Builder builder) {
		this.name = builder.name;
		this.password = builder.password;
		this.phone = builder.phone;
		this.country = builder.country;
	}
	
	public static class Builder {
		private final String name;// required
		private final String password;// required
		private int phone;// optional
		private String country;// optional
		
		public Builder(String name, String password) {
			this.name = name;
			this.password = password;
		}
		public Builder phone(int phone) {
			this.phone = phone;
			return this;
		}
		public Builder country(String country) {
			this.country = country;
			return this;
		}
		public User build() {
			return new User(this);
		}
	}


	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public int getPhone() {
		return phone;
	}

	public String getCountry() {
		return country;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", phone=" + phone + ", country=" + country + "]";
	}
	
	
}
