public class User extends Person
{
    private Page page;
    private static Administrator administrator;

    User(String name,String email,String username,String passHash)
    {
        super(name,email,username,passHash);
        //System.out.println(name);
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
        Report report= new Report(message,sender,receiver);
        administrator.addReport(report.createReport());
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", passHash='" + passHash + '\'' +
                ", isBanned=" + isBanned +
                '}';
    }
}
