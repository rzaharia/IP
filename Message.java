public class Message {
    User sender, receiver;
    String messageToSend;

    Message(User sender, User receiber, String message){
        this.sender = sender;
        this.receiver = receiber;
        this.messageToSend = message;
    }

    void sendMessage(){

    }

    @Override
    public String toString() {
        return "Message{" +
                "sender=" + sender +
                ", receiver=" + receiver +
                ", messageToSend=" + messageToSend +
                '}';
    }
}
