package Day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {

    public static List<Message> messages = new ArrayList<>();

    public static void sendMessage (User u1, User u2, String text){
        messages.add(new Message(u1,u2,text));
    }
    public static List<Message> getMessages (){
        return messages;
    }

    public static void showDialog (User u1, User u2){
        for (Message mess: messages) {
            if (mess.getSender()==u1 && mess.getReceiver()==u2  ||
                mess.getSender()==u2 && mess.getReceiver()==u1){
                System.out.println(mess.getSender() +": "+ mess.getText());
            }
        }
    }

}
