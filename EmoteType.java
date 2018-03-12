public class EmoteType
{
    private int id;
    private Image data;

    public EmoteType(Image data,int id)
    {
        this.id = id;
        this.data=data;
    }

    public int getId()
    {
        return id;
    }

    public Image getData()
    {
        return data;
    }

    @Override
    public String toString()
    {
        return "EmoteType: "+id+" "+data.toString();
    }
}
