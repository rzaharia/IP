import java.util.ArrayList;
public class Administrator extends Person {
    List<Reports> reports = new ArrayList<>();
    Administrator(String name, String email, String username, String passHash){
        super(name, email, username, passHash);
    }

    void banUser(User user){

    }

    void evalueteReports(){

    }

    void addReport(Report bug){
        reports.add(bug);
    }
}