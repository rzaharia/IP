public class ScriptType
{
    private String language;
    private int version;

    public ScriptType(String language, int version)
    {
        this.language = language;
        this.version = version;
    }

    public String getLanguage()
    {
        return language;
    }

    public int getVersion()
    {
        return version;
    }

    @Override
    public String toString()
    {
        return version + " language: " + language;
    }
}
