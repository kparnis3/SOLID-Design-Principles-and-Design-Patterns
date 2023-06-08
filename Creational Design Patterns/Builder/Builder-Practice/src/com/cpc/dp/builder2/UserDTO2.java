import java.time.LocalDate;
import java.time.Period;

//Product class thats immutable
//Second way to make a builder class
public class UserDTO2 {

	private String name;
	
	private String address;
	
	private String age;

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getAge() {
		return age;
	}
	
	private void setName(String name) {
		this.name = name;
	}

	private void setAddress(String address) {
		this.address = address;
	}

	private void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "name=" + name + "\nage=" + age + "\naddress=" + address ;
	}
	//Get builder instance
	public static UserDTOBuilder2 getBuilder() {
		return new UserDTOBuilder2();
	}
	//Builder
	public static class UserDTOBuilder2 {
		
		private String firstName;
		
		private String lastName;
		
		private String age;
		
		private String address;
		
		private UserDTO2 userDTO;
		
		public UserDTOBuilder2 withFirstName(String fname) {
			this.firstName = fname;
			return this;
		}
		
		public UserDTOBuilder2 withLastName(String lname) {
			this.lastName = lname;
			return this;
		}
		
		public UserDTOBuilder2 withBirthday(LocalDate date) {
			age = Integer.toString(Period.between(date, LocalDate.now()).getYears());
			return this;
		}
		
		public UserDTOBuilder2 withAddress(Address address) {
			this.address = address.getHouseNumber() + " " +address.getStreet()
						+ "\n"+address.getCity()+", "+address.getState()+" "+address.getZipcode(); 

			return this;
		}
		
		public UserDTO2 build() {
			this.userDTO = new UserDTO2();
			userDTO.setName(firstName+" " + lastName);
			userDTO.setAddress(address);
			userDTO.setAge(age);
			return this.userDTO;
		}
		
		public UserDTO2 getUserDTO() {
			return this.userDTO;
		}
	}
}
