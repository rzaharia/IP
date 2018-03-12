import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class Timeline {
    List<Image> images = new ArrayList<>();
    Timeline(List<Image> images){
        this.images = images;
    }
    @Override
    public String toString() {
        return "Timeline{}";
    }
}
