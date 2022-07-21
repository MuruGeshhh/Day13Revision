package sg.edu.nus.iss.day13revision.models;


// models dont need annotation
public class PersonForm {

    //select both , rigth click, source action, getters and setters.
    private String firstName;
    private String lastName;
    
    
       // getters and setters
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
}
