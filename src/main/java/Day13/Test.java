package Day13;

public class Test {
    public static void main(String[] args) {

        User user1= new User("User_1");
        User user2= new User("User_2");
        User user3= new User("User_3");

        user1.sendMessage(user2,"Hello, User_2");
        user1.sendMessage(user2,"Kak dela?");

        user2.sendMessage(user1,"Hi, User_1");
        user2.sendMessage(user1,"U menia vse horosho!");
        user2.sendMessage(user1,"A kak ti!?");

        user3.sendMessage(user1,"Privet, User_1");
        user3.sendMessage(user1,"Vse horosho!?");
        user3.sendMessage(user1,"Kak ti tam!?");

        user1.sendMessage(user3,"O! Privet, User_3");
        user1.sendMessage(user3,"Da horosho!");
        user1.sendMessage(user3,"Okey!");

        user3.sendMessage(user1,"Nu i okey!!!!");

        MessageDatabase.showDialog(user3,user1);
    }
}
