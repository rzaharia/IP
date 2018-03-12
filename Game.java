public class Game extends Media
{
    private Script script;
    private int id;
    private Resource resource;

    public Game(String date, Script script, int id)
    {
        super(date);
        this.script = script;
        this.id = id;
    }

    public Script getScript()
    {
        return script;
    }

    public void setScript(Script script)
    {
        this.script = script;
    }


}
