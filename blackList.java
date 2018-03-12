import java.util.ArrayList;
import java.util.List;

public class blackList {
    List<User> useriB;
    blackList(){
        useriB = new ArrayList<>();
    }

    void addToBlack(User u1){
        useriB.add(u1);
        u1.isBanned = true;
    }

    void removeFromBlack(User u1){
        useriB.remove(u1);
        u1.isBanned = false;
    }

}
