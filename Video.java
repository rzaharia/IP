import java.util.Date;

public class Video extends Media
{
    public Video(Date date)
    {
        super(date);
    }

    @Override
    public String toString()
    {
        return "Video" + super.toString();
    }
}
