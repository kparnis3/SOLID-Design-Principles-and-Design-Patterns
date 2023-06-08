import java.time.LocalDate;
import java.time.Period;

//The concrete builder for UserWebDTO
public class UserWebDTOBuilder implements UserDTOBuilder {

    private String firstName;
    private String lastName;
    private String age;
    private String address;
    private UserWebDTO dto;

    @Override
    public UserWebDTOBuilder withFirstName(String fname){
        firstName = fname;
        return this;
    }

    @Override
    public UserWebDTOBuilder withLastName(String lname){
        lastName = lname;
        return this;
    }

    @Override
    public UserWebDTOBuilder withBirthday(LocalDate date){
        Period ageInYears = Period.between(date, LocalDate.now()); //we need the age in years
        age = Integer.toString(ageInYears.getYears());
        return this;
    }

    @Override
    public UserWebDTOBuilder withAddress(Address address){
        this.address = address.getHouseNumber() + ", " + address.getStreet() 
                       + "\n" +address.getCity() + "\n" + address.getState()
                       + " " +address.getZipcode();
        return this;
    }

    @Override
    public UserDTO build() {
        dto = new UserWebDTO(firstName + " "+ lastName, address, age);
        return dto;
    }

    @Override
    public UserDTO getUserDTO() {
        return dto;
    }

}
