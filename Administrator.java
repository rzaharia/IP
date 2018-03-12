import com.sun.deploy.util.BlackList;

import java.util.ArrayList;
import java.util.List;

public class Administrator extends Person {
    List<Report> reports = new ArrayList<>();
    Profile profille;
    blackList blacklist = new blackList();
    Administrator(String name, String email, String username, String passHash){
        super(name, email, username, passHash);
    }

    void banUser(User user){
        blacklist.addToBlack(user);
    }

    void evalueteReports(){

    }

    void addReport(Report bug){
        reports.add(bug);
    }
}