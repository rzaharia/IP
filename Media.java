import java.util.Date;

public class Media
{
    private int id;
    private String date;

    public Media(String date)
    {
        this.date = date;
    }

    public int getId()
    {
        return id;
    }

    public String getDate()
    {
        return date;
    }

    @Override
    public String toString()
    {
        return "Media: " + date.toString() + " " + id;
    }
}
