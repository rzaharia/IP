import java.util.Date;

public class Media
{
    private int id;
    private Date date;

    public Media(Date date)
    {
        this.date = date;
    }

    public int getId()
    {
        return id;
    }

    public Date getDate()
    {
        return date;
    }

    @Override
    public String toString()
    {
        return "Media: " + date.toString() + " " + id;
    }
}
