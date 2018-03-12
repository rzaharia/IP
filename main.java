import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args){
        User u1=new User("Ionescu","onescu@gmail.com","ion","asdfaaa123");
        User u2=new User("Georgescu","georgescu@gmail.com","georg","asdf3457");

        System.out.println(u1);
        System.out.println(u2);

        Administrator admin=new Administrator("Popescu","popescu@gmail.com","pop","asdf123");
        System.out.println(admin);

        Comment comment=new Comment("1234","un comentariu",u1,new Date());
        System.out.println(comment);

        Image image=new Image("image1",new Date(),"asffdfbbv");
        System.out.println(image);

        Message message=new Message(u1,u2, "measj");
        System.out.println(message);

        Page page=new Page("page1","fotografii",u2);
        System.out.println(page);

        Post post=new Post("post1",image);
        Report r=new Report("un continut text",u1,u2);

        Media media = new Media("Date pentru media");
        System.out.println(media);

        PhoneNumber number = new PhoneNumber("0732364187");
        System.out.println(number);

        List<Image> images = new ArrayList<>();
        Timeline timeline = new Timeline(images);
        System.out.println(timeline);

        Video video = new Video("date pentru video");
        System.out.println(video);


    }
}
