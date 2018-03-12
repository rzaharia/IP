public class Add extends Post
{
    private int id;
    private Resource resource;

    public Add(String id, Image img)
    {
        super(id, img);
        this.resource = resource;
    }

    @Override
    public String toString()
    {
        return "Add: " + id + " " + resource.toString();
    }
}
