package Objects;

public class Person {
   
    private int id;
    private String access;
    private String name;
    private String lastName;
    private String email;
    private int personalID;
    private String password;
    private int age;

    public Person() {
    }

    public Person(int id, String access, String name, String lastName, String email, int personalID, String password, int age) {
        this.id = id;
        this.access = access;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.personalID = personalID;
        this.password = password;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPersonalID() {
        return personalID;
    }

    public void setPersonalID(int personalID) {
        this.personalID = personalID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
    
    
    
    
    
    
    
}
