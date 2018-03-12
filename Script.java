public class Script
{
    private ScriptType scriptType;

    Script(ScriptType type)
    {
        this.scriptType=type;
    }

    public ScriptType getScriptType()
    {
        return scriptType;
    }

    public void setScriptType(ScriptType scriptType)
    {
        this.scriptType = scriptType;
    }

    @Override
    public String toString()
    {
        return "Script: "+scriptType.toString();
    }
}
