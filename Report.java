public class Report
{
    private String message;
    private User sender,receiver;
    private Post postReported;

    Report(String message, User sender, User receiver)
    {
        this.message=message;
        this.sender=sender;
        this.receiver=receiver;
    }

    Report createReport()
    {
        return this;
    }

    @Override
    public String toString() {
        return "Report{" +
                "message='" + message + '\'' +
                ", sender=" + sender +
                ", receiver=" + receiver +
                ", postReported=" + postReported +
                '}';
    }
}
