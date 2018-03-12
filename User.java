public class User extend Person
{
    private Page page;
    private static Administrator administrator;

    User(String name,String email,String username,String passHash)
    {
        super(name,email,username,passHash);
    }

    public Page getPage()
    {
        return page;
    }

    public void setPage(Page page)
    {
        this.page = page;
    }

    public void createReport(String message,User sender,User receiver)
    {
        Report report= new Report();
        report.createReport(message,sender,receiver);
        administrator.addReport(report);
    }
}
