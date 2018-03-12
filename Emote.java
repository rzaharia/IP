import java.util.Date;

public class Emote
{
    private Date data;
    private EmoteType emoteType;
    private int id;

    public Emote(Date data, EmoteType emoteType, int id)
    {
        this.data = data;
        this.emoteType = emoteType;
        this.id = id;
    }

    public Date getData()
    {
        return data;
    }

    public EmoteType getEmoteType()
    {
        return emoteType;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    @Override
    public String toString()
    {
        return "Emote: "+ data.toString()+" "+ emoteType.toString();
    }
}
