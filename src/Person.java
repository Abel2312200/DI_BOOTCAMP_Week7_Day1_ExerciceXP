public class Person {
    // class attributes
    private String name;
    private String lastName;
    private String email;
    private int age;

    // constructor without parameters
    public Person() {
        super();
    }

    // constructor(s) using parameter(s
    public Person(String name, String lastName, String email, int age) {
        super();
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }

    // getters and setters

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // class methods
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
