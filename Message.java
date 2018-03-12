public class Message {
    User sender, receiver;
    int messageToSend = 0;

    Message(User sender, User receiber, int message){

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
