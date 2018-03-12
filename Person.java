public class Person {
    String name;
    String email;
    String username;
    String passHash;
    Person(String name, String email, String username, String passHash){
        this.name = name;
        this.email = email;
        this.username = username;
        this.passHash = passHash;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", passHash='" + passHash + '\'' +
                '}';
    }
}
