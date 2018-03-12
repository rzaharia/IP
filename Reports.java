public class Report
{
    private String message;
    private User sender,receiver;
    private Post postReported;

    Report()
    {

    }

    Report createReport(String message,User sender,User receiver)
    {
        this.message=message;
        this.sender=sender;
        this.receiver=receiver;
        return this;
    }
}
