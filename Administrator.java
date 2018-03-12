import java.util.ArrayList;
import java.util.List;

public class Administrator extends Person {
    List<Report> reports = new ArrayList<>();
    Profile profille;
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